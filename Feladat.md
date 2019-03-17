# TDD

## Feladat

Hajókra tervezünk ütközéselkerülő rendszert. A rendszer alapja, hogy a hajó
navigációs radarja érzékeli a "másik hajó" relatív helyzetét, vagyis az x,y
koordinátáit, ahol az y tengely a hajó haladási irányával párhuzamos (a
haladási irány felé pozitív), az x tengely pedig arra merőleges (haladási
iránytól jobbra pozitív), és a másik hajó relatív haladási irányát fokban
megadva (ez egy 0-359 közötti szám: 0 ha párhuzamosan azonos irányba; 90 ha
merőlegesen jobbról balra; 180 ha párhuzamosan de ellentétes irányba; 270,
ha merőlegesen balról jobbra halad). Ebből kiszámolja a két hajó útvonalának
mettszéspontját. 

Ezután a saját haladási sebességből és hosszból kiszámolja, hogy mikor (milyen
időintervallumban) fog ezen a ponton áthaladni 3-3 hajóhossz ráhagyással. Ez
azt jelenti, hogy a hajó eleje mikor közelíti meg 3 hajóhossznyira a metszéspontot,
és a hajó tatja mikor hagyja el legalább 3 hajóhosszal (viszonyítási pontnak a hajó
geometriai közepét tekintve).

Közben érzékeli a másik hajó folyamatosan sugárzott sebesség és hossz adatait, és
azokkal is elvégzi a számolást. Ha a két hajó eltérő időintervallumban tartozkodik
az adott helyen, akkor nincs baj.

Ha viszont a két időpont metszi egymást, akkor több lehetőség van. Ha a hajók
haladási iránya legfeljebb 90 fokban tér el (azaz legfeljebb merőlegesen haladnak,
de kicsit sem "egymással szemben"), akkor "a jobbról érkezőnek elsőbbsége van"
alapon sebességcsökkentést javasol, vagy csak fokozott óvatosságra figyelmeztet.
Ha viszont a két hajó kicsit is szemben halad egymással, akkor "a könnyebb hajó
könnyebben menőverez" alapon javasol elkerülő manővert vagy fokozott óvatosságot.
(A tömeg adatokat szintén folyamatosan sugározzák a hajók.)

A probléma, hogy az adatsugárzó rendszerek nem teljesen standardizáltak, ezért a
sebesség, hossz és tömeg adatokat különféle hajók különféle mértékegységekben
sugározhatják.

- Hosszmérték
  - cm, m (100cm), km (1000m), in (2.54cm), ft (12in), yd (3ft),
    mile (1760yd), nm (1852m)

- Tömeg
  - g, kg (1000g), t (1000kg), oz (28.34952g), lb (16oz)

- Idő
  - s, m (60s), h (60m)

- Sebesség
  - m/s, km/h, mi/h, knot (1 nm/h)

## Tervezés

### Az algoritmus

- Saját hajó (sebesség, hossz, tömeg [relatív irány 0 fok, relatív pozíció (0,0)])
- Másik hajó (sebesség, hossz, tömeg, irány, relatív pozíció)

1. Másik hajó irányából és pozíciójából kiszámolni, hogy keresztezi-e a mi útvonalunkat?
  - Ha a jobb oldalon (relatív pozíció dx koordinátája > 0) jobbra tart (0-180 fok), vagy
    a bal oldalon (dx < 0) balra megy (180-360(=0) fok) -- megengedve a párhuzamos haladást,
    most tekintsünk el a gömbfelszíntől --, akkor nem, tehát nincs figyelmeztetés.
2. Számoljuk ki az útvonalak metszéspontját:
  - A másik hajó v sebességét vx (nekünk merőleges) és vy (velünk párhuzamos) komponensekre
    kell felbontani: vx = v * cos(90° - irány), vy = v * sin(90° - irány)
  - vx-ből és a relatív pozíció dx koordinátájából kiszámolható, hogy a másik hajó
    t = - (dx / vx) idő múlva keresztezi a mi útvonalunkat
  - vy-ból, a relatív dy koordinátából és t-ből kiszámolható, hogy a másik hajó az
    Y = dy + vy * t helyen keresztezi a mi útvonalunkat (X=0, mivel mi definíció szerint
    az y tengelyen haladunk)
3. Mikor ér a két hajó az útvonalak kereszteződéséhez?
  - A másik hajó az előbb kiszámolt t idő múlva
  - Mi T = Y / V idő múlva (V a sebességünk)
4. Ütközünk?
  - Ha a másik hajó hossza l, akkor dt = 3.5 * l / v idővel a keresztezés előtt lép be,
    és ennyivel ez után lép ki a biztonságos zónából, vagyis [t-dt, t+dt] időintervallumban
    tartózkodik ott.
  - Hasonlóan, ha a mi hajónk L hosszú, akkor dT = 3.5 * L / V, és a [T-dT, T+dT] a
    keresett időintervallum.
  - Ha a két időintervallum nem metszi egymást, akkor nincs figyelmeztetés.
5. Ki tér ki?
  - Ha a másik hajó iránya 270-360° vagy 0-90° között van, akkor
    - Ha jobbra van tőlünk (dx > 0), ő mehet, mi lassítunk
    - Ha balra van tőlünk (dx < 0), mi mehetünk, de figyeljünk rá
  - Ha 90-270° az iránya, akkor
    - Ha ő a nehezebb, akkor mi mehetünk, de figyeljünk
    - Ha mi vagyunk nehezebbek, ő mehet, mi lassítunk

### Szükséges osztályok, műveletek

- Hossz
  - skalárral szorzás?
  - negáció?
  - összeadás
  - sebességgel osztás
  - összehasonlítás
  - ZERO konstans

- Idő
  - skalárral szorzás?
  - negáció?
  - összeadás, kivonás
  - összehasonlítás

- Sebesség
  - skalárral szorzás
  - negáció?
  - idővel szorzás

- Tömeg
  - összehasonlítás

- Intervallum
  - két időpont között
  - metszet létezik-e

- Pozíció
  - x, y: Hossz

- Hajó
  - Tömeg, Sebesség, Hossz
  - ütközésdetektálás(másik hajó, irány, relatív pozíció)?

- Ütközésellenőrző rendszer?
  - Saját hajó
  - ütközésdetektálás(másik hajó, irány, relatív pozíció)

- Mértékegységek (Hossz, Idő, Sebesség, Tömeg)
  - Konstruktor(double, String)
    - pl. (0.2, "km"), (5, "m/s")
  - as(String): double
    - érték visszaadása valamilyen mértékegységben

- Hibakezelés:
  - InvalidUnitException, amit a konstruktorok dobnak,
    ha ismeretlen mértékegységgel találkoznak

### Lehetséges további refactoring

- Hossz, Idő, Sebesség, Tömeg: közös ősből, azonos alap műveletekkel (`+`, `-`, negáció, skalár `*`, skalár `/`, `compareTo`)
- általános (generikus) Intervallum
