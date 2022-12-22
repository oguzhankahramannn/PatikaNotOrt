import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //Geçme Notu : 55
        double mat,fiz,turkce,kimy,muzik,ortalama;
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : ");
        mat = scan.nextDouble();
        if (mat>=0 && mat <=100) {
            mat = mat;
        }
        else {
            mat = 0;
        }
        System.out.println("Fizik notunuzu giriniz : ");
        fiz = scan.nextDouble();
        if (fiz>=0 && fiz <=100) {
            fiz = fiz;
        }
        else {
            fiz = 0;
        }
        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = scan.nextDouble();
        if (turkce>=0 && turkce <=100) {
            turkce = turkce;
        }
        else {
            turkce = 0;
        }
        System.out.println("Kimya notunuzu giriniz : ");
        kimy = scan.nextDouble();
        if (kimy>=0 && kimy <=100) {
            kimy = kimy;
        }
        else {
            kimy = 0;
        }
        System.out.println("Müzik notunuzu giriniz : ");
        muzik = scan.nextDouble();
        if (muzik>=0 && muzik <=100) {
            muzik = muzik;
        }
        else {
            muzik = 0;
        }
        ortalama = (mat+fiz+turkce+kimy+muzik)/5;

        if (ortalama >= 55) {
            System.out.println("Ortalamanız : " + ortalama+ " " + "Geçtiniz");
        }
        else {
            System.out.println("Ortalamanız : " + ortalama+ " " +"Kaldınız");
        }


    }
}