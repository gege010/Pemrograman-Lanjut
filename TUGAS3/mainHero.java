import java.util.Scanner;

public class mainHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        classHero hero1 = new classHero();
        String name1, name2;
        double hp1,attack1,defense1;
        double hp2,attack2,defense2;
        System.out.print("Permainan adu hero\n"+"Player 1 : Silakan masukkan hero Anda!\n"+
        "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n"+"====================================================\n");
        do{
            System.out.printf("%-15s: ", "Nama Hero");
            name1 = sc.nextLine();
            System.out.printf("%-15s: ", "Health Point");
            hp1 = sc.nextDouble();
            System.out.printf("%-15s: ", "Attack");
            attack1 = sc.nextDouble();
            System.out.printf("%-15s: ", "Defense");
            defense1 = sc.nextDouble();
            System.out.println();
            hero1.setName(name1);
            hero1.setHp(hp1);
            hero1.setAttack(attack1);
            hero1.setDefense(defense1);
            if(hp1>500||attack1>500||defense1>500){
                System.out.println("Silakan masukkan ulang!");
            }
        }while(hp1>500||attack1>500||defense1>500);
        sc.nextLine();
        System.out.print("Permainan adu hero\n"+"Player 2 : Silakan masukkan hero Anda!\n"+
        "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n"+"====================================================\n");
        do{
            System.out.printf("%-15s: ", "Nama Hero");
            name2 = sc.nextLine();
            System.out.printf("%-15s: ", "Health Point");
            hp2 = sc.nextDouble();
            System.out.printf("%-15s: ", "Attack");
            attack2 = sc.nextDouble();
            System.out.printf("%-15s: ", "Defense");
            defense2 = sc.nextDouble();
            if(hp2>500||attack2>500||defense2>500){
                System.out.println("Silakan masukkan ulang!");
            }
        }while(hp2>500||attack2>500||defense2>500);
        classHero hero2 = new classHero(name2, hp2, attack2, defense2);
        String win,lose;
        win = lose = "none";
        int round=1;

        do {
            if (hero2.getAttack() > hero1.getDefense()) {
                hp1 = hero1.getHp() - (hero2.getAttack() - hero1.getDefense());
            }
            if(hero2.getAttack() < hero1.getDefense()){
                defense1 = hero1.getDefense()-hero2.getAttack();
                hp1 = hero1.getHp();
            }
            if (hp1 < 0) {
                hp1 = 0;
            }
            hero1.setHp(hp1);
            hero1.setDefense(defense1);
            System.out.println("==========================================================\n"+"==========================================================");
            System.out.println("Round " + round++);
            System.out.println(hero2.getName() + " menyerang " + hero1.getName()+"\n");
            System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAttack());
            System.out.println(hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
            System.out.println("Health dari " + hero1.getName() + " saat ini " + hp1+"\n");
            if (hero1.getHp() == 0) {
                win = hero2.getName();
                lose = hero1.getName();
                break;
            }
            if (hero1.getAttack() > hero2.getDefense()) {
                hp2 = hero2.getHp() - (hero1.getAttack() - hero2.getDefense());
            }
            if(hero1.getAttack() < hero2.getDefense()){
                defense2 = hero2.getDefense()-hero1.getAttack();
                hp2 = hero2.getHp();
            }
            if (hp2 < 0) {
                hp2 = 0;
            }
            hero2.setHp(hp2);
            hero2.setDefense(defense2);
            System.out.println(hero1.getName() + " menyerang " + hero2.getName()+"\n");
            System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAttack());
            System.out.println(hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
            System.out.println("Health dari " + hero2.getName() + " saat ini " + hp2+"\n");
            if (hero2.getHp() == 0) {
                win = hero1.getName();
                lose = hero2.getName();
                break;
            }

        } while (hero2.getHp() > 0 && hero1.getHp() > 0);
        System.out.println("\nPertarungan telah usai!"+"\n"+lose+" telah kalah!");
        System.out.println("==========================================================");
        System.out.println(win+" adalah pemenangnya");
        sc.close();
    
    }

}
