package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        // Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız.
        //a) alanını hesaplayınız ==> Kısa kenar*uzun kenar
        //b) cevresini hesaplayınız==>2*kisa kenar+2*uzun kenar
        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz..");
        double shortside = input.nextDouble();

        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz..");
        double longSide = input.nextDouble();

        System.out.println(shortside*longSide);
        System.out.println(2*shortside+2*longSide);



    }


}
