package tugastambahanweek10;

import java.util.Scanner;

abstract class Employee {
    abstract double salary();
}

class Manager extends Employee {
    double salary() {
        return 850.00;
    }
}

class Programmer extends Employee {
    double salary() {
        return 100.00;
    }
}

public class SistemPegawai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Manager");
        System.out.println("2. Programmer");
        int p = in.nextInt();

        Employee e = (p == 1) ? new Manager() : new Programmer();
        System.out.println("Gaji: " + e.salary());
    }
}