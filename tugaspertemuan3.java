
import java.util.Scanner;

public class tugaspertemuan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int harga;
        int umur;
        int tinggi;

        System.out.println("======== Selamat datang di Disney Island ========");
        System.out.println("===== silahkan masukan data diri pengunjung =====");
        System.out.print("Masukan umur anak anda : ");
        umur = scanner.nextInt();
        System.out.print("Masukan tinggi badan anak anda (cm) : ");
        tinggi = scanner.nextInt();

        if (umur < 1) {
            System.out.println("Dilarang masuk");
        } else if (umur < 3) {
            harga = 30000;
            if (umur >= 2 && tinggi > 70) {
                harga += 10000;
            }
            System.out.println("Tarif: Rp " + harga);
        } else if (umur < 7) {
            harga = 40000;
            if (umur >= 4 && tinggi > 120) {
                harga += 15000;
            }
            System.out.println("Tarif: Rp " + harga);
        } else if (umur < 10) {
            harga = 50000;
            if (umur >= 8 && tinggi > 150) {
                harga += 20000;
            }
            System.out.println("Tarif: Rp " + harga);
        } else {
            harga = 80000;
            System.out.println("Tarif: Rp " + harga);
        }

        scanner.close();
    }
    
}
