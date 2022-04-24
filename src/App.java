import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mat,fizik,turkce,kimya,muzik,toplam=0,bolum=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = inp.nextInt();

        if(!(mat<0 || mat>100)){
            toplam += mat;
            bolum++;
        }

        System.out.println("Fizik Notunuz: ");
        fizik = inp.nextInt();

        if(!(fizik<0 || fizik>100)){
            toplam += fizik;
            bolum++;
        }
        
        System.out.println("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        if(!(turkce<0 || turkce>100)){
            toplam += turkce;
            bolum++;
        }

        System.out.println("Kimya Notunuz: ");
        kimya = inp.nextInt();

        if(!(kimya<0 || kimya>100)){
            toplam += kimya;
            bolum++;
        }

        System.out.println("Müzik Notunuz: ");
        muzik = inp.nextInt();

        if(!(muzik<0 || muzik>100)){
            toplam += muzik;
            bolum++;
        }
        
        System.out.println("Fizik Notunuz: ");
        fizik = inp.nextInt();

        if(!(fizik<0 || fizik>100)){
            toplam += fizik;
            bolum++;
        }
        inp.close();
        double average = toplam/bolum;
        if(average<=55){
            System.out.println("Sınıfta Kaldınız!");
        }else{
            System.out.println("Sınıfı Geçtiniz!");
        }
        System.out.println("Ortalamanız: "+average);
    }
}
