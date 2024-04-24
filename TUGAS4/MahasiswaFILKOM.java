package TUGAS4;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String inputNim, double inputIpk, String inputNama, String inputNik, boolean inputJenisKelamin, boolean inputMenikah) {
        super(inputNama, inputNik, inputJenisKelamin, inputMenikah);
        nim = inputNim;
        ipk = inputIpk;
    }

    public String getStatus(){
        if (nim.charAt(6)=='2'){
            return "Teknik Informatika, "+"20"+nim.substring(0,2);
        }else if (nim.charAt(6)=='3') {
            return "Teknik Komputer, "+"20"+nim.substring(0,2);
        }else if (nim.charAt(6)=='4') {
            return "Sistem Informasi, "+"20"+nim.substring(0,2);
        }else if (nim.charAt(6)=='6') {
            return "Pendidikan Teknologi Informasi, "+"20"+nim.substring(0,2);
        }else if (nim.charAt(6)=='7') {
            return "Teknologi Informasi, "+"20"+nim.substring(0,2);
        }else{
            return "-";
        }
    }

    public double getBeasiswa(){
        if (ipk>=3.0&&ipk<=3.5){
            return 50;
        } else if(ipk>3.5&&ipk<=4.0){
            return 75;
        } else{
            return 0;
        }
    }

    public double getPendapatan(){
        return super.getPendapatan()+getBeasiswa();
    }

    public String toString(){
        return super.toString()+"\nnim            : "+nim+"\nipk            : "+ipk+"\nstatus         : "+getStatus();
    }
}
