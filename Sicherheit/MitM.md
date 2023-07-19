## Man-in-the-Middle-Angriff
- Mallory fängt bei einem Man-in-the-Middle-Angriff die von Alice und Bob gesendeten Nachrichten ab und sendet stattdessen jeweils seine eigene Nachricht
![Alt text](MitM.jpg)
- Da Alice und Bob davon ausgehen mit dem jeweils anderen zu kommunizieren und diese über Mallory stattfindet, kann Mallory die symmetrisch verschlüsselte Kommunikation abhören

### Welche Protokolle sind anfällig für diesen Typ Angriff
- HTTP (ohne SSL/TLS)
    - Daten werden im Klartext übertragen
    - Angreifer können diesen Datenverkehr abfangen und nach Belieben lesen oder manipulieren
    - HTTPS bietet Authentifizierung und die Daten werden verschlüsselt
- Telnet
    - Fernsteuerung von Geräten
    - bietet keine Verschlüsselung
    - SSH als Alternative bietet Verschlüsselung und Authentifizierung
- SMTP und POP3 (ohne SSL/TLS)
    - beide Protokoll bietet keine Verschlüsselung oder Authentifizierung und sind somit anfällig für MitM-Angriffe
    - Alternative sind SMTPS und POP3S welche SSL/TLS für die Verschlüsselung und Authentifizierung benutzen