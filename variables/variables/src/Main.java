public class Main {
    //reusability tekrar kullanılabilirlik anlamına gelir aşşağıda yaptığımız şeydir satır 4-8 arası
    public static void main(String[] args) {
        int sayi = 1000000;
        String mesaj ="Günlük İşlem Hacmi ="; //Burada yaptığımız işlem tek komutla başka komutları da çalıştırmaya yarar
        System.out.println(mesaj+sayi); //Burada olduğu gibi tanımlama yapıp ardından koda ekleyerek yazım yapılabilir
        System.out.println(mesaj+sayi);
        System.out.println(mesaj+sayi); // Bir datayı kolaylıkla değiştirmeye yarar
        System.out.println(mesaj+sayi);
    }
}
