public class Main {
    public static void main(String[] args) {
        int sayi1 = 11;
        int sayi2 = 10;
        int sayi3 = 20;

        if (sayi1>sayi2){ //Tamamen Bana ait ilk kodlar :)
            if(sayi1>sayi3) {
                System.out.println("En Büyük Sayı :" + sayi1);
            }
        }if (sayi2>sayi3){
            if (sayi2>sayi1){
                System.out.println("En Büyük sayı :" + sayi2);
            }
        }else
            System.out.println("En Büyük Sayı :" + sayi3);
    }
}
