package CallOfDuty;

import CallOfDuty.weapon.Weapon;

public class Player {
    private final Weapon[] weaponSlots;

    public Player(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;

    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}

