import java.util.Scanner;

public class Kafe13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        double totalHarga, nominalBayar; // Deklarasi variabel totalHarga dan nominalBayar
        float diskon = 0.1f; // Diskon 10% untuk member

        // Input keanggotaan dan jumlah item yang dibeli
        System.out.print("Apakah Anda member kafe? (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        // Hitung total harga tanpa diskon
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        
        if (keanggotaan) {
            nominalBayar = totalHarga - (diskon * totalHarga);
        } else {
            nominalBayar = totalHarga; 
        }

        
        System.out.println("\nKeanggotaan pelanggan: " + keanggotaan);
        System.out.println("Item pembelian: " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti ");
        System.out.println("Nominal bayar: Rp " + nominalBayar);
    }
}
