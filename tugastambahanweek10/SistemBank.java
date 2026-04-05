package tugastambahanweek10;

import java.util.Scanner;

abstract class Account {
    abstract void withdraw();
}

class Saving extends Account {
    void withdraw(){ System.out.println("Withdraw OK"); }
}

class Checking extends Account {
    void withdraw(){ System.out.println("Overdraft OK"); }
}

public class SistemBank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Saving\n2. Checking");
        int p = in.nextInt();

        Account a = (p==1)? new Saving(): new Checking();
        a.withdraw();
    }
}