import java.util.Scanner;

public class PemilihanHaridenganIf13  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hari;

        
        System.out.print("Masukkan angka (1-7): ");
        hari = sc.nextInt();

        
        if (hari >= 1 && hari <= 5) {
            System.out.println("Weekday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}

