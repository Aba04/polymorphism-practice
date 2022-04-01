package CallOfDuty;
import CallOfDuty.weapon.BigGun;
import CallOfDuty.weapon.Rpg;
import CallOfDuty.weapon.WaterPistol;
import CallOfDuty.weapon.Weapon;

import java.util.Scanner;

public class TestDriveShoting {
    public static void main(String[] args) {
        Player player = new Player(new Weapon[]{
            new WaterPistol(), new BigGun(), new Rpg()
        });

        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти\n",
                player.getSlotsCount()
        );

            int slot;
        Scanner scanner = new Scanner(System.in);

        while (true){
            slot = scanner.nextInt();
            if (slot==-1){
                break;
            }
            player.shotWithWeapon(slot -1);
        }
    }
}