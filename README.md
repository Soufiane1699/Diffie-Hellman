# Diffie-Hellman
- Protokoll zur Schlüsselvereinbarung
- zwei Kommunikationspartner (siehe Beispiel: Alice und Bob) können über eine öffentliche, abhörbare Leitung einen geheimen Schlüssel austauschen in Form einer Zahl
- der vereinbarte Schlüssel kann anschließend für zum Beispiel die symmetrische Verschlüsselung verwendet werden (DES oder AES)

### Key-Facts über das Protokoll
- wurde 1976 als erstes asymmetrisches Kryptoverfahren veröffentlicht
- (das GCHQ entwickelte bereits in den 1970er-Jahren ein asymmetrisches Verfahren durften es aber nicht veröffentlichen :)

- Der DHM-Schlüsselaustausch zählt zu den Krypto-Systemen auf Basis des diskreten Logarithmus (DL-Verfahren) aber was heißt das ? (mehr dazu später)
- der DHM-Schlüsselaustausch ist allerdings nicht sicher, wenn sich ein Angreifer zwischen die beiden Kommunikationspartner schaltet und Nachrichten verändern kann (Abhilfe schafen die beiden Protokolle Station-to-Station-Protokoll (STS) durch zusätzliche digitale Signaturen und Message Authentication Codes)

### Bedeutung der Buchstaben
- p = DHM-Primzahl  
    - desto größer desto sicherer aber auch desto aufwendiger  
    - BSI empfielt eine Schlüssellänge für p von mindestens 3000 Bit (Quelle: https://www.bsi.bund.de/SharedDocs/Downloads/DE/BSI/Publikationen/TechnischeRichtlinien/TR02102/BSI-TR-02102.html)

![Key-Exchange](Key-Exchange.jpeg)

## Bedeutung von groß A (Public Key von Alice) und groß B (Public Key von Bob) am Beispiel TLS 1.3
- Beim TLS 1.3 Handshake wird in der ClientHello sowie im ServerHello jeweils der Public Key mitgesendet damit lässt sich der Sitzungsschlüssel auf beiden Seiten berechnen
