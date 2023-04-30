public class Weapon extends Items{
    private int damage;
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public Weapon(String name, String desc, int value,int damage){
        super(name, desc, value);
        this.damage = damage;
    }

}

