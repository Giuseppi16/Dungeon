package fighter.specialweapon;

import fighter.WeaponType;

public class MightyWeapon {

    protected String weaponused;
    protected WeaponType type;

    public MightyWeapon(String weaponused, WeaponType type) {
        this.weaponused = weaponused;
        this.type = type;
    }

    public String getWeaponused() {
        return weaponused;
    }

    public WeaponType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MightyWeapon " + weaponused;
    }
}
