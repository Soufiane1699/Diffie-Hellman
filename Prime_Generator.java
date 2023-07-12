package dh;

import java.math.BigInteger;
import java.util.Random;

public class Prime_Generator {
    private static final Random rnd = new Random();
    public static BigInteger generatePrime(int numbits){
        BigInteger prime;
        do {
            prime = new BigInteger(numbits, rnd);
        } while (!isPrime(prime));
        return prime;
    }

    private static boolean isPrime(BigInteger prime){
        // Überprüfe ob die Zahl kleiner oder gleich 1 ist (keine Primzahl)
        if (prime.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }
        // Überprüfe ob die Zahl 2 oder 3 ist (Primzahlen)
        if (prime.compareTo(BigInteger.TWO) == 0 || prime.compareTo(BigInteger.valueOf(3)) == 0){
            return true;
        }
        // Überprüfe, ob die Zahl gerade ist (keine Primzahl)
        if (prime.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            return false;
        }
        // Berechnen der Quadratwurzel der Zahl
        BigInteger sqrt = prime.sqrt();
        // Überprüfe, ob die Zahl durch eine ungerade Zahl von 3 bis zur Quadratwurzel teilbar ist
        for (BigInteger i = BigInteger.valueOf(3); i.compareTo(sqrt) <= 0; i = i.add(BigInteger.TWO)) {
            // Überprüfe, ob die Zahl durch i teilbar ist (keine Primzahl)
            if (prime.mod(i).equals(BigInteger.ZERO)){
                return false;
            }
        }
        // Die Zahl ist eine Primzahl
        return true;
    }
}
