package TUGAS4;

public class Manusia {
    private String nama, nik;
    private boolean jenisKelamin, menikah ;

    public Manusia(String inputNama, String inputNik, boolean inputJenisKelamin, boolean inputMenikah) {
        nama = inputNama;
        nik = inputNik;
        jenisKelamin = inputJenisKelamin;
        menikah = inputMenikah;
    }

    public double getTunjangan(){
        if (menikah==true){
            if(jenisKelamin==true){
                return 25;
            } else{
                return 20;
            }
        }else{
            return 15.0;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString(){
        return "\nnama           : "+nama+"\nnik            : "+nik+"\njenisKelamin   : "+(jenisKelamin?"Laki-laki":"Perempuan")+"\npendapatan     : "+getPendapatan();
    }
}
