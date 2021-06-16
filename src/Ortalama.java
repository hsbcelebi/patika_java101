import java.util.Scanner;


public class Ortalama {

    public static void main(String[] args) {

        int mat,fizik,kimya,tarih,turkce,muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = scanner.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih = scanner.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = scanner.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = scanner.nextInt();

        double ort = (mat+fizik+kimya+tarih+turkce+muzik)/6;

        System.out.println("Not ortalamanız : " + ort);

    }
}
