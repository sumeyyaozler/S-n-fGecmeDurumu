import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, avarage, toplam =0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :" );
        mat = input.nextDouble();

        System.out.print("Fizik notunuz :");
        fizik = input.nextDouble();

        System.out.print("Turkce notunuz :");
        turkce = input.nextDouble();

        System.out.print("Kimya notunuz :");
        kimya = input.nextDouble();

        System.out.print("Muzik notunuz :");
        muzik = input.nextDouble();



        if ((mat >= 0) && (mat <= 100)) {

            toplam  += mat;
        } else {
            toplam += 0;
            System.out.println("Matematik notunuz 0-100 arasında olmadığı için ortalamaya katılmadı ");
        }

        if ((fizik >= 0) && (fizik <= 100)) {
            toplam += fizik;
        } else {
            toplam += 0;
            System.out.println("Fizik notunuz 0-100 arasında olmadığı için ortalamaya katılmadı ");
        }

        if ((turkce > 0) && (turkce < 100)) {
           toplam += turkce;
        } else {
            toplam += 0;
            System.out.println("Turkce notunuz 0-100 arasında olmadığı için ortalamaya katılmadı ");
        }

        if ((kimya > 0) && (kimya < 100)) {
            toplam += kimya;
        } else {
            toplam += 0;
            System.out.println("Kimya notunuz 0-100 arasında olmadığı için ortalamaya katılmadı ");
        }
        if ((muzik > 0) && (muzik < 100)) {
            toplam += muzik;
        } else {
            toplam += 0;
            System.out.println("Muzik notunuz 0-100 arasında olmadığı için ortalamaya katılmadı ");
        }
        avarage = ( toplam)/ 5;
        System.out.println(avarage);

        if (avarage <= 60){
        System.out.print( "Sınıfta kaldınız");
    }else{
            System.out.print("Tebrikler Sınıfı geçtiniz");
}
    }
}