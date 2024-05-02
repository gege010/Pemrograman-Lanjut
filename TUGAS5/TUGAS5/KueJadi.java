package TUGAS5;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String inputNama, double inputHarga, double inputJumlah) {
        super(inputNama, inputHarga);
        jumlah = inputJumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double hitungharga() {
        return jumlah * getHarga() * 2;
    }

    public String toString() {
        return super.toString() + "\nJumlah\t\t: " + jumlah;
    }

}
