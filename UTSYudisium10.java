
import java.util.Scanner;

public class UTSYudisium10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = 10;

        System.out.println("=== PENDAFTARAN YUDISIUM ===");

        System.out.print("Bebas kompen (Ya/Tidak): ");
        String kompen = sc.nextLine();

        System.out.print("Tanggungan perpustakaan (true/false): ");
        boolean perpustakaan = sc.nextBoolean();

        System.out.print("Jumlah SKS lulus: ");
        int sks = sc.nextInt();

        System.out.print("IPK: ");
        double ipk = sc.nextDouble();

        System.out.print("Lama studi (semester): ");
        int semester = sc.nextInt();

        System.out.print("Pernah mengulang mata kuliah (true/false): ");
        boolean mengulang = sc.nextBoolean();

        boolean isD3 = (P % 2 == 0);
        int minSks = isD3 ? 108 : 144;
        int batasSemester = isD3 ? 6 : 8;
        String jenjang = isD3 ? "D3" : "D4";

        String pesan;

        // Syarat administrasi
        if (!kompen.equalsIgnoreCase("Ya") || perpustakaan) {
            pesan = "Ditolak: syarat administrasi "
                    + "(kompen/perpustakaan) belum terpenuhi";

        