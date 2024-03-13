public class perpustakaanClass {
    private String[][] bukuFiksi;
    private String[][] bukuFilsafat;
    private String[][] bukuPolitik;
    private String[][] bukuTeknologi;
    private String[][] bukuSejarah;
    private String[][] bukuPsikologi;
    private String[][] bukuAgama;

    public perpustakaanClass(){
        bukuFiksi = new String[][] {
            {"Laskar Pelangi", "528", "Andrea Hirata", "Bentang Pustaka", "2005", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Sang Pemimpi", "544", "Andrea Hirata", "Bentang Pustaka", "2006", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Ayat-Ayat Cinta", "488", "Habiburrahman El Shirazy", "Republika Penerbit", "2004", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Bumi", "432", "Tere Liye", "Gramedia Pustaka Utama", "2014", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Lelaki Harimau", "344", "Eka Kurniawan", "Gramedia Pustaka Utama", "2004", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."}
        };
        
        bukuFilsafat = new String[][] {
            {"Meditasi", "204", "Marcus Aurelius", "Gramedia Pustaka Utama", "2005", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Republic", "448", "Plato", "Pustaka Jaya", "2013", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Critique of Pure Reason", "800", "Immanuel Kant", "Pustaka Pelajar", "2007", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Being and Time", "532", "Martin Heidegger", "Pustaka Pelajar", "2009", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"The Metaphysics of Morals", "272", "Immanuel Kant", "Pustaka Pelajar", "2012", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."}
        };
        
        bukuPolitik = new String[][] {
            {"1984", "352", "George Orwell", "Gramedia Pustaka Utama", "2023", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Animal Farm", "224", "George Orwell", "Gramedia Pustaka Utama", "2022", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Leviathan", "448", "Thomas Hobbes", "Pustaka Pelajar", "2021", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"The Prince", "208", "Niccolò Machiavelli", "Mizan Pustaka", "2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Republic", "544", "Plato", "Kompas Gramedia", "2019", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."}
        };
        
        bukuTeknologi = new String[][] {
            {"Sapiens: Riwayat Singkat Umat Manusia", "672", "Yuval Noah Harari", "Kepustakaan Populer Gramedia", "2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Homo Deus: Riwayat Singkat Masa Depan", "528", "Yuval Noah Harari", "Kepustakaan Populer Gramedia", "2018", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"21 Lessons for the 21st Century", "352", "Yuval Noah Harari", "Kepustakaan Populer Gramedia", "2019", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Zero to One: Notes on Startups, or How to Build the Future", "264", "Peter Thiel", "Gramedia Pustaka Utama", "2014", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"The Lean Startup: How Today's Entrepreneurs Use Continuous Innovation to Create Radically Successful Businesses", "320", "Eric Ries", "Penerbit Erlangga", "2013", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."}
        };
        
        bukuSejarah = new String[][] {
            {"Peradaban Barat: Sejarah Singkat dari Yunani Kuno hingga Abad ke-21", "1024", "Norman Davies", "Pustaka Obor", "2019", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Senjata Kuman dan Baja", "880", "Jared Diamond", "Kepustakaan Populer Gramedia", "2005", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Sejarah Singkat Dunia", "544", "Bill Bryson", "Gramedia Pustaka Utama", "2004", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Indonesia dalam Arus Sejarah", "640", "Sartono Kartodirdjo", "Gramedia Pustaka Utama", "2012", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Sejarah Nasional Indonesia", "624", "Tim Penyusun Sejarah Nasional Indonesia", "Balai Pustaka", "1975", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."}
        };
        
        bukuPsikologi = new String[][] {
            {"Thinking, Fast and Slow", "544", "Daniel Kahneman", "Gramedia Pustaka Utama", "2012", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Man's Search for Meaning", "240", "Viktor Frankl", "Elex Media Komputindo", "2016", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "352", "Susan Cain", "Gramedia Pustaka Utama", "2013", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"The Gift of Therapy", "352", "Irvin D. Yalom", "PT Gramedia Widiasarana Indonesia", "2002", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Ego is the Enemy", "240", "Ryan Holiday", "Bentang Pustaka", "2017", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."}
        };
        
        bukuAgama = new String[][] {
            {"Al-Qur'an", "604", "Nabi Muhammad SAW", "Pustaka Imam Bonjol", "2023", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Injil", "1280", "Yesus Kristus", "Yayasan Gloria", "2022", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Bhagavad Gita", "720", "Vyasa", "Pustaka Jaya", "2021", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Dhammapada", "288", "Buddha Gautama", "Vihara Bodhigiri", "2020", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."},
            {"Tao Te Ching", "160", "Laozi", "Spring", "2019", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dictum."}
        };
    }

    public String[][] getFiksi() {
        return bukuFiksi;
    }

    public String[][] getFilsafat() {
        return bukuFilsafat;
    }

    public String[][] getPolitik() {
        return bukuPolitik;
    }

    public String[][] getTeknologi() {
        return bukuTeknologi;
    }

    public String[][] getSejarah() {
        return bukuSejarah;
    }

    public String[][] getPsikologi() {
        return bukuPsikologi;
    }

    public String[][] getAgama() {
        return bukuAgama;
    }

    public void bukuUI(String[][] listBuku) {
        for (int i = 0; i < 5; i++) {
            String sinopsis = listBuku[i][5];
            int jumlahKata = jumlahKata(sinopsis);
            System.out.println("\nJudul        : " + listBuku[i][0]+"\nHalaman      : " + listBuku[i][1]+"\nPenulis      : " + listBuku[i][2]+"\nPenerbit     : " + listBuku[i][3]+"\nTahun Terbit : " + listBuku[i][4]+"\nSinopsis     : " + listBuku[i][5]+"\nJumlah Kata  : "+ jumlahKata);
        }
    }

    public int banyakBuku(String[][] listBuku) {
        return listBuku.length;
    }

    public int jumlahKata(String sinopsis) {
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }

    public boolean cekBuku(String judul1, String judul2) {
        boolean buku1Ada = false, buku2Ada = false;

        for (String[] buku : bukuFiksi) {
            if (buku[0].equalsIgnoreCase(judul1)) {
                buku1Ada = true;
            }
            if (buku[0].equalsIgnoreCase(judul2)) {
                buku2Ada = true;
            }
        }

        for (String[] buku : bukuFilsafat) {
            if (buku[0].equalsIgnoreCase(judul1)) {
                buku1Ada = true;
            }
            if (buku[0].equalsIgnoreCase(judul2)) {
                buku2Ada = true;
            }
        }

        for (String[] buku : bukuPolitik) {
            if (buku[0].equalsIgnoreCase(judul1)){
                buku1Ada = true;
            }
            if (buku[0].equalsIgnoreCase(judul2)){
                buku2Ada = true;
            }
        }

        for (String[] buku : bukuTeknologi) {
            if (buku[0].equalsIgnoreCase(judul1)){
                buku1Ada = true;
            }
            if (buku[0].equalsIgnoreCase(judul2)){
                buku2Ada = true;
            }
        }

        for (String[] buku : bukuSejarah) {
            if (buku[0].equalsIgnoreCase(judul1)){
                buku1Ada = true;
            }
            if (buku[0].equalsIgnoreCase(judul2)){
                buku2Ada = true;
            }
        }

        for (String[] buku : bukuPsikologi) {
            if (buku[0].equalsIgnoreCase(judul1)){
                buku1Ada = true;
            }
            if (buku[0].equalsIgnoreCase(judul2)){
                buku2Ada = true;
            }
        }

        for (String[] buku : bukuAgama) {
            if (buku[0].equalsIgnoreCase(judul1)){
                buku1Ada = true;
            }
            if (buku[0].equalsIgnoreCase(judul2)){
                buku2Ada = true;
            }
        }

        return buku1Ada && buku2Ada;
    }

    public int kesamaanAtribut(String judul1, String judul2) {
        int similarity = 0;
        String[] buku1 = null;
        for (String[] buku : bukuFiksi) {
            if (buku[0].equalsIgnoreCase(judul1)) {
                buku1 = buku;
                break;
            }
        }
        if (buku1 == null) {
            for (String[] buku : bukuFilsafat) {
                if (buku[0].equalsIgnoreCase(judul1)) {
                    buku1 = buku;
                    break;
                }
            }
        }
        if (buku1 == null) {
            for (String[] buku : bukuPolitik) {
                if (buku[0].equalsIgnoreCase(judul1)) {
                    buku1 = buku;
                    break;
                }
            }
        }
        if (buku1 == null) {
            for (String[] buku : bukuTeknologi) {
                if (buku[0].equalsIgnoreCase(judul1)) {
                    buku1 = buku;
                    break;
                }
            }
        }
        if (buku1 == null) {
            for (String[] buku : bukuSejarah) {
                if (buku[0].equalsIgnoreCase(judul1)) {
                    buku1 = buku;
                    break;
                }
            }
        }
        if (buku1 == null) {
            for (String[] buku : bukuPsikologi) {
                if (buku[0].equalsIgnoreCase(judul1)) {
                    buku1 = buku;
                    break;
                }
            }
        }
        if (buku1 == null) {
            for (String[] buku : bukuAgama) {
                if (buku[0].equalsIgnoreCase(judul1)) {
                    buku1 = buku;
                    break;
                }
            }
        }

        String[] buku2 = null;
        for (String[] buku : bukuFiksi) {
            if (buku[0].equalsIgnoreCase(judul2)) {
                buku2 = buku;
                break;
            }
        }
        if (buku2 == null) {
            for (String[] buku : bukuFilsafat) {
                if (buku[0].equalsIgnoreCase(judul2)) {
                    buku2 = buku;
                    break;
                }
            }
        }
        if (buku2 == null) {
            for (String[] buku : bukuPolitik) {
                if (buku[0].equalsIgnoreCase(judul2)) {
                    buku2 = buku;
                    break;
                }
            }
        }
        if (buku2 == null) {
            for (String[] buku : bukuTeknologi) {
                if (buku[0].equalsIgnoreCase(judul2)) {
                    buku2 = buku;
                    break;
                }
            }
        }
        if (buku2 == null) {
            for (String[] buku : bukuSejarah) {
                if (buku[0].equalsIgnoreCase(judul2)) {
                    buku2 = buku;
                    break;
                }
            }
        }
        if (buku2 == null) {
            for (String[] buku : bukuPsikologi) {
                if (buku[0].equalsIgnoreCase(judul2)) {
                    buku2 = buku;
                    break;
                }
            }
        }
        if (buku2 == null) {
            for (String[] buku : bukuAgama) {
                if (buku[0].equalsIgnoreCase(judul2)) {
                    buku2 = buku;
                    break;
                }
            }
        }

        if (buku1 != null && buku2 != null) {
            for (int i = 0; i < buku1.length; i++) {
                if (buku1[i].equalsIgnoreCase(buku2[i])) {
                    similarity++;
                }
            }
        }

        return similarity;
    }

    public double persentaseKesamaan(String judul1, String judul2) {
        int totalAtribut = 6;

        int kesamaan = kesamaanAtribut(judul1, judul2);
        return ((double) kesamaan / totalAtribut) * 100;
    }

}
