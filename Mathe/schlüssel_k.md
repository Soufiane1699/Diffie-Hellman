- Nur Alice und Bob kennen K
- aufgrund des diskreten Logarithmus kann Eve nicht K aus der abhörten Kommunikation nicht berechnen 
- Alice und Bob können gefarhlos für eine symmetrische Verschlüsselung nutzen

### Aber warum ist K1 = K2

K1 = B^(a) mod p = (g^(b) mod p)^(a) mod p = (g^(b))^(a) mod p = g^(ba) mod p
K2 = A^(b) mod p = (g^(a) mod p)^(b) mod p = (g^(a)^(b)) mod po = g^(ab) mod p

