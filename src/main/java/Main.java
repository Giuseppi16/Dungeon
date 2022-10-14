import fighter.FighterClass;
import fighter.MightyFighter;
import fighter.WeaponType;
import fighter.dungeonboss.Boss;
import fighter.dungeonboss.BossNature;
import fighter.specialweapon.MightyWeapon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Boss dungeonboss = new Boss("Cyril", false, BossNature.LIGHT);
        MightyWeapon belial = new MightyWeapon("Belial the death Scythe", WeaponType.FORGED);
        MightyWeapon crusher = new MightyWeapon("Crusher", WeaponType.FORGED);
        MightyFighter myrial = new MightyFighter("Myrial", FighterClass.HIGHELF, 2576, 1200, 450, 325, belial, belial.getType());
        MightyFighter lyx = new MightyFighter("Lyx", FighterClass.DWARF, 430, 1800, 400, 500, crusher, crusher.getType());

        List<MightyFighter> team1 = new ArrayList<>();

        team1.add(myrial);
        team1.add(lyx);

        System.out.println(myrial.warriorInnerPWR());
        System.out.println(lyx.warriorInnerPWR());

        System.out.println(dungeonboss.toString());

        if (team1.get(0).warriorInnerPWR() > dungeonboss.bossPWR()) {
            System.out.println("Congratulations you could defeat the boss");
        }
            for(int i = 0; i <= team1.size(); i++) {
              int combinedforces =+ team1.get(i).warriorInnerPWR();
              if(combinedforces > dungeonboss.bossPWR()){
                  System.out.println("Congratulations you could defeat the boss");
              }else {
                  System.out.println("Seems like you might need to gather more strength before trying again defeating this boss");
              }
            }
        }
}

