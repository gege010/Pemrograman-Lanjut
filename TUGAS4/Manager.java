package TUGAS4;
import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;
    
    public Manager(String inputDepartemen, double inputGaji, LocalDate inputTahunMasuk, int inputJumlahAnak, String inputNama, String inputNik, boolean inputJenisKelamin, boolean inputMenikah){
        super(inputGaji, inputTahunMasuk, inputJumlahAnak, inputNama, inputNik, inputJenisKelamin, inputMenikah);
        departemen=inputDepartemen;
    }

    public double getPendapatan(){
        return super.getPendapatan()+(super.getGaji()*0.1);
    }

    public String toString(){
        return super.toString()+"\ndepartemen     : "+departemen;
    }
}
