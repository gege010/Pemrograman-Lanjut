package TUGAS4;
import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double inputGaji, LocalDate inputTahunMasuk, int inputJumlahAnak, String inputNama, String inputNik, boolean inputJenisKelamin, boolean inputMenikah){
        super(inputNama, inputNik, inputJenisKelamin, inputMenikah);
        tahunMasuk=inputTahunMasuk;
        jumlahAnak=inputJumlahAnak;
        gaji=inputGaji;
    }

    public double getBonus() {
        int tahunSekarang = LocalDate.now().getYear();
        int tahunMasukPekerja = tahunMasuk.getYear();
        int tahunSelisih = tahunSekarang - tahunMasukPekerja;

        if (tahunSelisih >= 0 && tahunSelisih <= 5) {
            return gaji * 0.05;
        } else if (tahunSelisih > 5 && tahunSelisih <= 10) {
            return gaji * 0.1;
        } else if (tahunSelisih > 10) {
            return gaji * 0.15;
        } else {
            return 0;
        }
    }

    public double getGaji(){
        return gaji;
    }

    public double getPendapatan(){
        return super.getPendapatan()+(jumlahAnak*20)+(getGaji()+getBonus());
    }

    public String toString(){
        return super.toString()+"\ntahun masuk    : "+tahunMasuk+"\njumlah anak    : "+jumlahAnak+"\ngaji           : "+getGaji();
    }
    
    
}
