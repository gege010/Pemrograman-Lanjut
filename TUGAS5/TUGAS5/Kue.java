package TUGAS5;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String inputNama, double inputHarga) {
        nama = inputNama;
        harga = inputHarga;
    }

    public abstract double hitungharga();

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String toString() {
        return "Nama\t\t: " + nama + "\nHarga\t\t: Rp " + harga;
    }
}
