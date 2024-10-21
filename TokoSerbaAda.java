package tugas.array.pbo;

import java.util.Scanner;

public class TokoSerbaAda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] kodeBarang = {"001", "002", "003", "004", "005"};
        String[] namaBarang = {"Pulpen", "Buku", "Pensil", "Spidol", "Penghapus"};
        int[] hargaBarang = {2000, 5000, 1500, 3000, 1000};

        System.out.print("Masukkan jumlah item yang dibeli: ");
        int jumlahItem = sc.nextInt();
        sc.nextLine(); // konsumsi newline

        String[] kodeDibeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Masukkan kode barang (contoh: 001, 002, dst): ");
            kodeDibeli[i] = sc.nextLine();

            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = sc.nextInt();
            sc.nextLine(); // konsumsi newline
        }

        System.out.println("\nTORO SERBA ADA");
        System.out.println("==============================================================================");
        System.out.printf("| %-3s | %-12s | %-12s | %-8s | %-11s | %-13s |\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("==============================================================================");

        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeDibeli[i].equals(kodeBarang[j])) {
                    int jumlahBayar = hargaBarang[j] * jumlahBeli[i];
                    totalBayar += jumlahBayar;
                    System.out.printf("| %-3d | %-12s | %-12s | Rp%-6d | %-11d | Rp%-11d |\n", (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar);
                }
            }
        }

        System.out.println("==============================================================================");
        System.out.printf("| %-58s | Rp%-11d |\n", "Total Bayar", totalBayar);
        System.out.println("==============================================================================");

        sc.close();
    }
}
