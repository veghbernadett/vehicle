Gyakorlat: Járműkölcsönző Rendszer
Készíts egy egyszerű járműkölcsönző rendszert, amely kezeli a különböző járműtípusokat, például autókat, teherautókat és motorkerékpárokat.
1.	Definiálj egy alaposztályt Jármű néven az alábbi attribútumokkal és metódusokkal:
•	Attribútumok:
•	gyártó (String): a jármű gyártója.
•	modell (String): a jármű modellje.
•	év (int): a jármű gyártási éve.
•	kölcsönzésiDíj (double): a napi bérleti díj.
•	kölcsönzött (boolean): azt jelzi, hogy a jármű jelenleg ki van kölcsönözve vagy sem.
•	Metódusok:
•	Jármű(String gyártó, String modell, int év, double kölcsönzésiDíj): konstruktor az attribútumok inicializálásához.
•	void kölcsönződik(): metódus a jármű kölcsönzöttként való megjelöléséhez.
•	void visszahoz(): metódus a jármű visszahozottként való megjelöléséhez.
2.	Definiálj három leszármazottat: Autó, Teherautó és Motorkerékpár, mindegyik az Jármű osztálytól öröklődik. Minden leszármazott osztálynak saját egyedi attribútumai és metódusai kell legyenek, a járműtípustól függően.
3.	Valósítsd meg a következő metódusokat minden leszármazott osztályban:
•	Autó:
•	Attribútumok:
•	ajtókSzáma (int): az autó ajtóinak száma.
•	Metódusok:
•	Autó(String gyártó, String modell, int év, double kölcsönzésiDíj, int ajtókSzáma): konstruktor az attribútumok inicializálásához.
•	Teherautó:
•	Attribútumok:
•	teherbírás (double): a teherautó teherbírása.
•	Metódusok:
•	Teherautó(String gyártó, String modell, int év, double kölcsönzésiDíj, double teherbírás): konstruktor az attribútumok inicializálásához.
•	Motorkerékpár:
•	Attribútumok:
•	motorméret (int): a motorkerékpár motormérete.
•	Metódusok:
•	Motorkerékpár(String gyártó, String modell, int év, double kölcsönzésiDíj, int motorméret): konstruktor az attribútumok inicializálásához.
4.	Hozz létre egy KölcsönzőRendszer osztályt a kölcsönzési folyamat kezeléséhez. Ennek az osztálynak tartalmaznia kell metódusokat:
•	Járművek hozzáadása a rendszerhez.
•	Jármű kölcsönzése.
•	Jármű visszahozása.
•	Elérhető járművek megjelenítése.
•	Kölcsönzött járművek megjelenítése.
5.	Hozz létre egy Fő osztályt egy main metódussal a járműkölcsönző rendszer működésének bemutatásához.
Ez a gyakorlat lehetőséget biztosít az osztályok, az öröklődés, a konstruktorok és a metódusok gyakorlására Java nyelven, miközben egy egyszerű járműkölcsönző rendszert készítesz.

