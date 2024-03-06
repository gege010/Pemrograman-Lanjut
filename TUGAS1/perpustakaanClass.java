public class perpustakaanClass {
    private String[][] bukuFiksi = {
        {"Laskar Pelangi", "528", "Andrea Hirata", "Bentang Pustaka", "2005"},
        {"Sang Pemimpi", "544", "Andrea Hirata", "Bentang Pustaka", "2006"},
        {"Ayat-Ayat Cinta", "488", "Habiburrahman El Shirazy", "Republika Penerbit", "2004"},
        {"Bumi", "432", "Tere Liye", "Gramedia Pustaka Utama", "2014"},
        {"Lelaki Harimau", "344", "Eka Kurniawan", "Gramedia Pustaka Utama", "2004"}
    };

    private String[][] bukuFilsafat = {
        {"Meditasi", "204", "Marcus Aurelius", "Gramedia Pustaka Utama", "2005"},
        {"Republic", "448", "Plato", "Pustaka Jaya", "2013"},
        {"Critique of Pure Reason", "800", "Immanuel Kant", "Pustaka Pelajar", "2007"},
        {"Being and Time", "532", "Martin Heidegger", "Pustaka Pelajar", "2009"},
        {"The Metaphysics of Morals", "272", "Immanuel Kant", "Pustaka Pelajar", "2012"}
    };

    private String[][] bukuPolitik = {
        {"1984", "352", "George Orwell", "Gramedia Pustaka Utama", "2023"},
        {"Animal Farm", "224", "George Orwell", "Gramedia Pustaka Utama", "2022"},
        {"Leviathan", "448", "Thomas Hobbes", "Pustaka Pelajar", "2021"},
        {"The Prince", "208", "Niccolò Machiavelli", "Mizan Pustaka", "2020"},
        {"Republic", "544", "Plato", "Kompas Gramedia", "2019"},
    };

    private String[][] bukuTeknologi = {
        {"Sapiens: Riwayat Singkat Umat Manusia", "672", "Yuval Noah Harari", "Kepustakaan Populer Gramedia", "2020"},
        {"Homo Deus: Riwayat Singkat Masa Depan", "528", "Yuval Noah Harari", "Kepustakaan Populer Gramedia", "2018"},
        {"21 Lessons for the 21st Century", "352", "Yuval Noah Harari", "Kepustakaan Populer Gramedia", "2019"},
        {"Zero to One: Notes on Startups, or How to Build the Future", "264", "Peter Thiel", "Gramedia Pustaka Utama", "2014"},
        {"The Lean Startup: How Today's Entrepreneurs Use Continuous Innovation to Create Radively Successful Businesses", "320", "Eric Ries", "Penerbit Erlangga", "2013"},
    };

    private String[][] bukuSejarah = {
        {"Peradaban Barat: Sejarah Singkat dari Yunani Kuno hingga Abad ke-21", "1024", "Norman Davies", "Pustaka Obor", "2019"},
        {"Senjata Kuman dan Baja", "880", "Jared Diamond", "Kepustakaan Populer Gramedia", "2005"},
        {"Sejarah Singkat Dunia", "544", "Bill Bryson", "Gramedia Pustaka Utama", "2004"},
        {"Indonesia dalam Arus Sejarah", "640", "Sartono Kartodirdjo", "Gramedia Pustaka Utama", "2012"},
        {"Sejarah Nasional Indonesia", "624", "Tim Penyusun Sejarah Nasional Indonesia", "Balai Pustaka", "1975"},
    };
    
    private String[][] bukuPsikologi = {
        {"Thinking, Fast and Slow", "544", "Daniel Kahneman", "Gramedia Pustaka Utama", "2012"},
        {"Man's Search for Meaning", "240", "Viktor Frankl", "Elex Media Komputindo", "2016"},
        {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "352", "Susan Cain", "Gramedia Pustaka Utama", "2013"},
        {"The Gift of Therapy", "352", "Irvin D. Yalom", "PT Gramedia Widiasarana Indonesia", "2002"},
        {"Ego is the Enemy", "240", "Ryan Holiday", "Bentang Pustaka", "2017"},
    };

    private String[][] bukuAgama = {
        {"Al-Qur'an", "604", "Nabi Muhammad SAW", "Pustaka Imam Bonjol", "2023"},
        {"Injil", "1280", "Yesus Kristus", "Yayasan Gloria", "2022"},
        {"Bhagavad Gita", "720", "Vyasa", "Pustaka Jaya", "2021"},
        {"Dhammapada", "288", "Buddha Gautama", "Vihara Bodhigiri", "2020"},
        {"Tao Te Ching", "160", "Laozi", "Spring", "2019"},
    };

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
            System.out.println("\nJudul        : " + listBuku[i][0]+"\nHalaman      : " + listBuku[i][1]+"\nPenulis      : " + listBuku[i][2]+"\nPenerbit     : " + listBuku[i][3]+"\nTahun Terbit : " + listBuku[i][4]);
        }
    }

    public int banyakBuku(String[][] listBuku) {
        return listBuku.length;
    }

}
