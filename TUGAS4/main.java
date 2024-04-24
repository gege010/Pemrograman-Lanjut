package TUGAS4;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("A", "123",true, true);
        System.out.println(manusia1);
        Manusia manusia2 = new Manusia("B", "231",false, true);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("C", "321",true, false);
        System.out.println(manusia3);

        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("235150400111033", 2.9, "A", "123", true, true);
        System.out.println(mahasiswa1);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("235150400111033", 3.1, "B", "231", false, true);
        System.out.println(mahasiswa2);
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("235150400111033", 4.0, "C", "321", false, false);
        System.out.println(mahasiswa3);

        Pekerja pekerja1 = new Pekerja(1000, LocalDate.of(2022, 3, 2), 2, "A", "123", true, true);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja(1000, LocalDate.of(2015, 3, 2), 0, "B", "231", true, false);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja(1000, LocalDate.of(2004, 3, 2), 10, "C", "321", true, true);
        System.out.println(pekerja3);

        Manager manager1 = new Manager("HRD", 7500,LocalDate.of(2009, 1, 2), 0, "A", "123", true, false);
        System.out.println(manager1);
    }

}
