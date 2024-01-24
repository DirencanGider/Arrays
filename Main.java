import java.util.Scanner;

//Arrayleri liste olarak düşünebiliriz.
public class Main {

    public static void arrayi_bastir(int[] array) { /* Bu dersteki sondan 2. işlemimiz.
                                                       Fonksiyon çağrısında direkt parantez içine array cinsinden
                                                       veri tipi yazacağız. "Örnek; arrayi_bastir(e)" gibi.
                                                       Sayfanın sonunda yapık ve çalıştırdık.
                                                      */

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + ":" + array[i]);

        }

    }
    public static double ortalamanbul(int[] array) {
        int toplam = 0;

        for (int i = 0; i < array.length; i++) {

            toplam += array[i];


        }
        return ((double)toplam / array.length);

    }

    public static void main(String[] args) {



        //int a = 5;
        int[] a = new int[10]; /* a değişkenine 10 tane değer depolanacak şekilde bellekte yer açılmış oldu.
                                   İndekslemede 0'dan başlar. Yani 10 ise; 0,1,2,3,4,5,6,7,8,9 olur. */
        a[5] = 32; //a'nın 5. indeksine 32 değerini atadık. Indeks hedef göstererek bu şekilde tanımlama da yapabiliyoruz.
        a[9] = 50; //Aynı şekilde 9. indeks 50 olarak tanımlandı.


        //double[] b; //Bu şekilde de farklı bir veri tipinde array tanımlayabiliriz.


        int[] b = {1,2,3,4,5,6,7,8,9,10}; //Değerleri direkt bu şekilde belirleyebiliyoruz. Süslü parantez kullanıyoruz.
        System.out.println(b[9]); //Bellekte 0 dan başlayıp 9'a saydığımızda tanımlı olan değer çıktı olarak "10" olmuş oluyor.


        int[] c = {30,40,50,60,70};
        System.out.println(c[0]); //Çıktı 30 olur.
        System.out.println(c[2]); //Çıktı 50 olur.
        //System.out.println(c[6]); //6 indeks olmadığı için hata verir.



        int[] d = new int[5];

        int[] e = {10,20,30,40,50,60};
        System.out.println("Arrayimizin Uzunluğu : " + e.length); //Arrayimizin Uzunluğu = 5 şeklinde çıktı aldık.

        /*

        System.out.println("**************************************************************************");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            d[i] = scanner.nextInt(); //Her dönggü başında indeks değerlerini girmemizi bizden isteyecek.



        /*

        for (int i = 0; i < 5; i++) {

            d[i] = i * 4 + 2;



        }

        System.out.println("**************************************************************************");
        System.out.println("d[] array'i için Scanner ile konsoldan indekslere girdiğimiz değerler");
            for (int i = 0; i < 5; i++) {

            System.out.println(d[i]);

        }
            */

        arrayi_bastir(e);

        System.out.println("Ortalama : " + ortalamanbul(e));


    }


}
