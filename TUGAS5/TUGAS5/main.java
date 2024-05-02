package TUGAS5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Kue[] kue = {
            new KuePesanan("Pesona Tropis", 5500.0, 2),
            new KuePesanan("Coklat Elegan", 12000.0, 3),
            new KuePesanan("Pisang Manis", 18000.0, 6),
            new KuePesanan("Velvet Merah", 9000.0, 7),
            new KuePesanan("Nastar Nostalgia", 11000.0, 1),
            new KuePesanan("Lemon Bar Segar", 22000.0, 4),
            new KuePesanan("Simfoni Coklat", 25000.0, 8),
            new KuePesanan("Berrylicious", 14000.0, 2),
            new KuePesanan("Karamel Manis", 24000.0, 9),
            new KuePesanan("Kesegaran Delima", 13000.0, 1),
            new KueJadi("Lapis Legit Emas", 9000.0, 6),
            new KueJadi("Bolu Moka Mekar Senyum", 14000.0, 4),
            new KueJadi("Kue Lapis Surabaya Semarak", 28000.0, 7),
            new KueJadi("Brownies Klasik Nostalgia", 45000.0, 5),
            new KueJadi("Donat Manis Ceria", 90000.0, 2),
            new KueJadi("Tart Buah Segar Tropis", 13000.0, 2),
            new KueJadi("Chiffon Pandan Wangi", 50000.0, 6),
            new KueJadi("Rainbow Cupcake Ceria", 38000.0, 5),
            new KueJadi("Black Forest Slice Romantis", 24000.0, 6),
            new KueJadi("Biskuit Cokelat Renyah Manis", 72000.0, 3)};
        int pilih;
        do {
            System.out.println("\n1. Tampilkan kue dan jenisnya\n" +
                    "2. Hitung total harga yang didapat dari semua jenis kue\n" +
                    "3. Hitung total harga dan total berat dari KuePesanan\n" +
                    "4. Hitung total harga dan total jumlah dari KueJadi\n" +
                    "5. Tampilkan informasi kue dengan harga terbesar\n" +
                    "6. Exit\n");
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    for (Kue jenisKue : kue) {
                        System.out.println(jenisKue.toString() + "\nJenis\t\t: " + ((jenisKue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi") + "\n");
                    }
                    break;
                case 2:
                    double totalHarga = 0;
                    for (Kue jenisKue : kue) {
                        totalHarga += jenisKue.getHarga();
                    }
                    System.out.println("Total harga semua jenis kue: Rp " + totalHarga);
                    break;
                case 3:
                    double totalHargaKuePesanan = 0;
                    double beratPesanan = 0;
                    for (Kue jenisKue : kue) {
                        if (jenisKue instanceof KuePesanan) {
                            totalHargaKuePesanan += jenisKue.hitungharga();
                            beratPesanan += ((KuePesanan) jenisKue).getBerat();
                        }
                    }
                    System.out.println("Total harga kue pesanan: Rp " + totalHargaKuePesanan);
                    System.out.println("Total berat kue pesanan: " + beratPesanan + " kg");
                    break;
                case 4:
                    double totalHargaKueJadi = 0;
                    double jumlah = 0;
                    for (Kue jenisKue : kue) {
                        if (jenisKue instanceof KueJadi) {
                            totalHargaKueJadi += jenisKue.hitungharga();
                            jumlah += ((KueJadi) jenisKue).getJumlah();
                        }
                    }
                    System.out.println("Total harga kue jadi\t: Rp " + totalHargaKueJadi);
                    System.out.println("Jumlah kue pesanan\t: " + jumlah);
                    break;
                case 5:
                    Kue kueTermahal = kue[0];
                    for (Kue jenisKue : kue) {
                        if (kueTermahal.hitungharga() < jenisKue.hitungharga()) {
                            kueTermahal = jenisKue;
                        }
                    }
                    System.out.println("Kue Termahal\n" + kueTermahal.toString() + "\nJenis kue\t: " + ((kueTermahal instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi"));
                    break;
                default:
                    if (pilih > 6||pilih<1) {
                        System.out.println("Masukkan kembali pilihan Anda!");
                    }
            }
        } while (pilih != 6);
    }
}