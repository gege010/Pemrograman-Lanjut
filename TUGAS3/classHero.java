public class classHero {
    private String name;
    private double hp;
    private double attack;
    private double defense;

    public classHero() {

    }

    public classHero(String inputName, double inputHp, double inputAttack, double inputDefense) {
        name = inputName;
        hp = inputHp;
        attack = inputAttack;
        defense = inputDefense;
    }

    public void setName(String inputName) {
        name = inputName;
    }

    public void setHp(double inputHp) {
        hp = inputHp;
    }

    public void setAttack(double inputAttack) {
        attack = inputAttack;
    }

    public void setDefense(double inputDefense) {
        defense = inputDefense;
    }
    
    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

}
