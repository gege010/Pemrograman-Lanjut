import java.util.Scanner;

public class perpustakaanUI {
    public static void main(String[] args) {
        perpustakaanClass perpustakaan = new perpustakaanClass();
        Scanner sc = new Scanner(System.in);
        int input;
        String pilih = "Y";
        do{
            System.out.print("PERPUSTAKAAN X\n============================\nGenre buku yang tersedia :\n1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n8. Jumlah buku\n============================\nMasukkan pilihan anda : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Buku dalam kategori Fiksi:");
                    perpustakaan.bukuUI(perpustakaan.getFiksi());
                    break;
                case 2:
                    System.out.println("Buku dalam kategori Filsafat:");
                    perpustakaan.bukuUI(perpustakaan.getFilsafat());
                    break;
                case 3:
                    System.out.println("Buku dalam kategori Politik:");
                    perpustakaan.bukuUI(perpustakaan.getPolitik());
                    break;
                case 4:
                    System.out.println("Buku dalam kategori Teknologi:");
                    perpustakaan.bukuUI(perpustakaan.getTeknologi());
                    break;
                case 5:
                    System.out.println("Buku dalam kategori Sejarah:");
                    perpustakaan.bukuUI(perpustakaan.getSejarah());
                    break;
                case 6:
                    System.out.println("Buku dalam kategori Psikologi:");
                    perpustakaan.bukuUI(perpustakaan.getPsikologi());
                    break;
                case 7:
                    System.out.println("Buku dalam kategori Agama:");
                    perpustakaan.bukuUI(perpustakaan.getAgama());
                    break;
                case 8:
                    int jumlah = 0;
                    jumlah += perpustakaan.banyakBuku(perpustakaan.getFiksi())+perpustakaan.banyakBuku(perpustakaan.getFilsafat())+perpustakaan.banyakBuku(perpustakaan.getPolitik())+perpustakaan.banyakBuku(perpustakaan.getTeknologi())+perpustakaan.banyakBuku(perpustakaan.getSejarah())+perpustakaan.banyakBuku(perpustakaan.getPsikologi())+perpustakaan.banyakBuku(perpustakaan.getAgama());
                    System.out.println("Jumlah total buku: " + jumlah+"\n");
                    break;
                default:
                    System.out.println("Error. Silakan pilih ulang!");
                    break;
            }
            sc.nextLine();
            System.out.println("Apakah anda ingin melanjutkan : (Y/N)");
            pilih = sc.nextLine();
        } while(pilih.equalsIgnoreCase("Y"));
    }
}
