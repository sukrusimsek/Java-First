import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int numberasal = number.nextInt();
        //System.out.println(numberasal+ " Sayınızdır");
        int remainder = numberasal % 2;
        int remainder2 = numberasal % 3;
        int remainder3 = numberasal %7;
        System.out.println(remainder);
        {
            //boolean b = remainder == 0;
            if (remainder == 0) {
                System.out.println(numberasal + " Sayınız Asal Değildir");
            } else if (remainder2 == 0) {
                System.out.println((numberasal + " Sayınız Asal Değildir"));
            } else if (remainder3 == 0) {
                System.out.println((numberasal + " Sayınız Asal Değildir"));
        }else{
                System.out.println(numberasal + " Sayınız Asaldır");
        }
        }//Kendimce Çözüm Buldum :)
    }
}