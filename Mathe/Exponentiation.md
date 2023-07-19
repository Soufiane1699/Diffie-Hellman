## Die Exponentiation spielt eine zentrale Rolle beim Diffie-Hellman Schlüsselaustausch
- mathematische Operation die auf zwei Zahlen Basis b und Exponenten n ausgeführt wird
- b zur Potenz n oder b hoch n

### Bedeutung beim Diffie-Hellman Schlüsselaustausch
1. Generierung des öffentlichen Schlüssels
    - Schlüssel A = g^(a) mod p => g zur Potenz a gefolgt von der Modulo-Operation
    - Schlüssel B = g^(b) mod p => g zur Potenz b gefolgt von der Modulo-Operation 
2. Berechnung des gemeinsamen Geheimnisses
    - S = B^(a) mod p

### Besondere ist A = g^(a) mod p 
- ist einfach auszurechnen aber umzukehren heißt a herauszufinden wenn A,g,p gegeben ist 
-> Diskrete Logarithmusproblem 