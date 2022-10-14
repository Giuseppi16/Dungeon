package fighter;

import fighter.specialweapon.MightyWeapon;

public class MightyFighter {

    private String name;
    private int age;
    private int hitpoints;
    private int attack;
    private int deffence;
    private MightyWeapon weapon;
    private WeaponType type;

    private FighterClass fighterClass;
    public MightyFighter(String name, FighterClass fighterClass, int age, int hitpoints, int attack, int deffence, MightyWeapon weapon, WeaponType type) {
        this.name = name;
        this.fighterClass = fighterClass;
        this.age = age;
        this.hitpoints = hitpoints;
        this.attack = attack;
        this.deffence = deffence;
        this.weapon = weapon;
    }

    public FighterClass getFighterClass() {
        return fighterClass;
    }

    public void setFighterClass(FighterClass fighterClass) {
        this.fighterClass = fighterClass;
    }

    public MightyWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(MightyWeapon weapon) {
        this.weapon = weapon;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDeffence() {
        return deffence;
    }

    public void setDeffence(int deffence) {
        this.deffence = deffence;
    }

    public int warriorInnerPWR(){
        int pwrcount = getAttack() + getDeffence() + getHitpoints();
        if (getFighterClass() == FighterClass.HIGHELF && getType() == WeaponType.STARRY || getFighterClass() == FighterClass.ORC && getType() == WeaponType.CHAOS || getFighterClass() == FighterClass.DWARF && getType() == WeaponType.FORGED) {
            return pwrcount * 2;
        } else {
            return pwrcount - getAttack();
        }
    }

    @Override
    public String toString() {
        return "The mighty warrior known as " + name +
                "\nDescendant of the " + getFighterClass() +
                "\nWielding the powerful " + weapon +
                "\nage:" + age +
                "\nhitpoints:" + hitpoints +
                "\nattack:" + attack +
                "\ndeffence:" + deffence;
    }
}
