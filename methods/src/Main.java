import java.util.Scanner;
//methods dosyası içinde yaptım ancak bu bir class dersi dosyasıdır.
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen İlk Sayıyı Giriniz :");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz :");
        int sayi2 = input.nextInt();
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Carp(sayi1, sayi2);
        System.out.println(sonuc);
    }
} // Hoca direk konsolda sayı girerek hesap makinesi yapıyordur scan ederek geliştiripte yapmaya çalıştım.