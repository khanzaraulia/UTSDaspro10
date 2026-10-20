import java.util.Scanner; 

public class UTSCetak10 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        String kertas = "";
        int harga = 0;
        int P = 10;

        System.out.print(" === Kasir Unit Cetak Kampus === ");

        System.out.print("Masukkan kode kertas (1/2/3):");
        int kodeKertas = sc.nextInt();

        System.out.print("Masukkan jumlah lembar: ");
        int jumlahLembar = sc.nextInt();

        System.out.print("Cetak warna (true/false): ");
        boolean cetakWarna = sc.nextBoolean();

        switch (kodeKertas) {
            case 1:
                kertas = "A4";
                harga  = cetakWarna ? 1000 : 300;
                break;
            case 2: 
                kertas = "F4";
                harga  = cetakWarna ? 1200 : 350;
                break;
            case 3:
                kertas = "A3";
                harga  = cetakWarna ? 2500 : 800;
                break;
            default: 
                System.out.println("Kode kertas tidak  tersedia");
                sc.close();
                return;
        }

        if (jumlahLembar < 1 || jumlahLembar > 1000) {
            System.out.println("Jumlah lembar tidak valid");
            sc.close();
            return; 
        }

        harga = harga + (P * 10);

        int subTotal = harga * jumlahLembar; 
        double diskon = 0;

        //diskon menggunakan IF-ELSE if_ELSE
        if (jumlahLembar >= 500) {
            diskon = 0.15 * subTotal;
        } else if (jumlahLembar >= 100) {
            diskon = 0.10 * subTotal;
        }else {
            diskon = 0;
        }
        
        double total = subTotal - diskon; 

        //biaya min 5.000
        if (total < 5000) {
            total = 5000;
        }

        //menampilkan transaksi 
        System.out.println("=== STRUK PEMBAYARAN ===");
        System.out.println("Kertas           : " + kertas);
        System.out.println("Jenis Cetak      : " + (cetakWarna ? "Warna" : "Hitam-Putih"));
        System.out.println("Harga per Lembar : Rp." + harga);
        System.out.println("Subtotal         : Rp." + subTotal);
        System.out.printf("Diskon           : Rp%.0f%n", diskon);
        System.out.printf("Total Bayar      : Rp%.0f%n", total);

        sc.close();
        
        }
    }





    
  