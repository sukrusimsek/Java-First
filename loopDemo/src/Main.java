public class Main {

    public static void main(String[] args) {
        //forLoop
        // 3 kısımdan oluşur bunlar:
        // başlangıç "i = 1" & bitiş "i <= 10" & artış miktarıdır " i++ "
        for(int i = 1;i <= 10;i++){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");
        //whileLoop
        // manuel durdurma yani bir sayaç kurmalısınız aksi halde i değeri değişmez
        // nedeni ise her döngüde kendini sıfırlıyor , döngü turunu toplayacak bir şeyler yazmalısınız
        int i=0;
        while (i<11){
            System.out.println(i);
            i+=2;
            //i+=2;
        }
        System.out.println("While döngüsü bitti");
        // do-while de şart sağlanmasa bile en az 1 kez çalışır buda
        // sistemde test için kullanımı ideal olur.
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<11);
        System.out.println("Do-While Döngüsü bitti");


    }
}