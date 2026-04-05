package tugastambahanweek10;

import java.util.Scanner;

abstract class Transport {
    protected double distance;

    Transport(double d) {
        distance = d;
    }

    abstract double fare();
}

class Gojek extends Transport {
    Gojek(double d) {
        super(d);
    }

    double fare() {
        return distance * 2000;
    }
}

class Grab extends Transport {
    Grab(double d) {
        super(d);
    }

    double fare() {
        return distance * 2500;
    }
}

public class SistemTransport {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Gojek");
        System.out.println("2. Grab");
        int p = in.nextInt();

        System.out.print("Jarak: ");
        double d = in.nextDouble();

        Transport t = (p == 1) ? new Gojek(d) : new Grab(d);
        System.out.println("Tarif: " + t.fare());
    }
}