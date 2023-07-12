package dh;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static int numbits = 512;
    static Random rnd = new Random();
    private static final BigInteger p = Prime_Generator.generatePrime(64);
    private static final BigInteger g = new BigInteger(numbits, rnd);
    private BigInteger shared_secret;
    private BigInteger alice_secret;

    public static class KeyError extends Exception{
        public KeyError() {
            super("Beim Schlüsselaustausch ist es zu einem Problem gekommen.");
        }
    }

    public static void main(String[] args) throws KeyError {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alice     Bob");
        System.out.println(" O        O ");
        System.out.println("/|\\      /|\\");
        System.out.println(" |        | ");
        System.out.println("/ \\      / \\");
        System.out.println("Diffie-Hellman Key Exchange");
        System.out.println("Zufälliger-Wert für p (Primzahl): " + p + "\n" + "Zufälliger Wert für g: " +  g);
        System.out.println("Geben Sie einen Wert für Alice ein: ");
        BigInteger alice_secret  = sc.nextBigInteger();
        System.out.println("Geben Sie einen Wert für Bob ein: ");
        BigInteger bob_secret = sc.nextBigInteger();
        System.out.println("Alice-Wert: " + alice_secret);
        System.out.println("Bob-Secret: " + bob_secret);

        // Calculate Alice_Public_Key
        System.out.println("Berechne den Public-Key von Alice mit der Formel: A = g^(a) mode p");
        BigInteger alice_public = g.modPow(alice_secret, p);
        // System.out.println(alice_public);

        // Calculate Bob_Public_Key
        System.out.println("Berechne den Public-Key von Bob mit der Formel: B = g^(b) mod p");
        BigInteger bob_public = g.modPow(bob_secret, p);
        // System.out.println(bob_public);

        BigInteger alice_public_key_bob = bob_public;
        BigInteger bob_public_key_alice = alice_public;

        // Berechne von K1 (Shared-Secret von Alice) Formel: K1 = B^(a) mod p
        BigInteger k1 = alice_public_key_bob.modPow(alice_secret, p);
        // Berechne von K2 (Shared-Secret von Bob) Formel: K2 = A^(b) mod p
        BigInteger k2 = bob_public_key_alice.modPow(bob_secret, p);

        // Test ob K1 = K2 ist weil K1 = K2 = K und der Shared-Secret
        if (k1.equals(k2)) {
            System.out.println("K1 ist: " + k1);
            System.out.println("K2 ist: " + k2);
        } else {
            throw new KeyError();
        }
        System.out.println("K (Shared-Secret) ist : " + k1);
    }
}
