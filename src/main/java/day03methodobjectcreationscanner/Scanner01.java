package day03methodobjectcreationscanner;
// javanın util kutuphanesinden scanner class import edildi
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. Adım scanner Clas tan objet olustur
        Scanner input = new Scanner(System.in);
       //2. adım kullanıcıya ne istediginize dair mesaj veriniz
        System.out.println("lütfen yasinizi giriniz");
        //3. adım uygun metodu kullanarak kullanicinin verdigi datayi memoriye yerlestiriniz
        byte age = input.nextByte();
        System.out.println("age = " + age);
    }
}
