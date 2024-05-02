package TUGAS5;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String inputNama, double inputHarga, double inputBerat) {
        super(inputNama, inputHarga);
        berat = inputBerat;
    }

    public double getBerat() {
        return berat;
    }

    public double hitungharga() {
        return getHarga() * berat;
    }

    public String toString() {
        return super.toString() + "\nBerat\t\t: " + berat + " kg";
    }
}
