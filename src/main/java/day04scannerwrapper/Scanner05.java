package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağımız 5 basamaklı sayının ilk iki ve
        // son iki rakamlarını yazdıran kodu giriniz.


        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli sayi giriniz..");
        int number=input.nextByte();

        //bir sayının son rakamını alabilmek icin 0
        //%==> modulus operator solunda bulunan sayinin  sagında bulunan kalanı verir
        // bir tam sayıyı bir tam sayıya bolerseniz java sonucu tam sayı yapar
        // java yuvarlama yapmaz ondalıklı kısmı iptal eder
        //dolayısı ile 10 bölersek birler basamagını silmis oluruz

        //son rakami al
        int birlerBasamagi = number % 10;
        //sayiyi kucult
        number = number / 10;

        //sondan ikinci rakami al
        int sondanIkinci = number % 10;
        //sayiyi kucult
        number = number / 10;

        //sondan ucuncu rakami al
        int sondanUcuncu = number % 10;
        //sayiyi kucult
        number = number / 10;

        //sondan dorduncu rakami al
        int sondanDorduncu =number%10;
        //sayi yi kucult
        number = number/10;

        //sondan besinci rakami al
        int sondanBesinci =number%10;
        //son rakam oldugu icin kucultmeye gerek yok

        System.out.println(sondanBesinci+sondanDorduncu+birlerBasamagi+sondanIkinci);




    }
    //Homework
    //1) Kullanıcıdan aldıgınız 3 tane sayının ortalamasını yazınız.
    //ornegin ==> 3,5,7, için ortalama (3+5+7)/3=5
    //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
    // ornegin => 312 icin 3+1+2=6



}
