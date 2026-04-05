package tugastambahanweek10;

import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;
    Circle(double r){ this.r=r; }
    double area(){ return 3.14*r*r; }
}

class Square extends Shape {
    double s;
    Square(double s){ this.s=s; }
    double area(){ return s*s; }
}

public class SistemBangunDatar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Lingkaran\n2. Persegi");
        int p = in.nextInt();

        Shape s;
        if(p==1){
            System.out.print("r: ");
            s = new Circle(in.nextDouble());
        } else {
            System.out.print("s: ");
            s = new Square(in.nextDouble());
        }
        System.out.println("Luas: "+s.area());
    }
}