package tugastambahanweek10;

import java.util.Scanner;

abstract class Character {
    abstract void attack();
}

class Warrior extends Character {
    void attack(){ System.out.println("Sword attack"); }
}

class Mage extends Character {
    void attack(){ System.out.println("Magic attack"); }
}

public class SistemGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Warrior\n2. Mage");
        int p = in.nextInt();

        Character c = (p==1)? new Warrior(): new Mage();
        c.attack();
    }
}