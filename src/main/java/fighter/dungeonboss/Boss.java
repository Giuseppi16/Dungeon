package fighter.dungeonboss;



public class Boss {

    private String name;
    private int hp = 2000;
    private int att = 1000;
    private int def = 500;
    private boolean specialAbility;
    private BossNature nature;

    public Boss(String name, boolean specialAbility, BossNature nature) {
        this.name = name;
        this.specialAbility = specialAbility;
        this.nature = nature;
    }

    public void setSpecialAbility(boolean specialAbility) {
        this.specialAbility = specialAbility;
    }

    public BossNature getNature() {
        return nature;
    }

    public void setNature(BossNature nature) {
        this.nature = nature;
    }

    public int getHp() {
        return hp;
    }

    public int getAtt() {
        return att;
    }

    public int getDef() {
        return def;
    }

    public boolean isSpecialAbility() {
        return specialAbility;
    }

    public int bossPWR() {
        if (specialAbility == true) {
            return ((getAtt() + getDef() + getHp())*2);
        }
        return getAtt() + getDef() + getHp();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nDUNGEON BOSS APPEARS\nTime to defeat " + name + " The Devourer";
    }
}
