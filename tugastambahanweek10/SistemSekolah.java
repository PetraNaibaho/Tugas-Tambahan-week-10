package tugastambahanweek10;

import java.util.Scanner;

abstract class Person {
    abstract void role();
}

class Teacher extends Person {
    void role(){ System.out.println("Mengajar"); }
}

class Student extends Person {
    void role(){ System.out.println("Belajar"); }
}

public class SistemSekolah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Guru\n2. Siswa");
        int p = in.nextInt();

        Person ps = (p==1)? new Teacher(): new Student();
        ps.role();
    }
}