package tugastambahanweek10;

import java.util.Scanner;

abstract class Product {
    protected double price;

    Product(double p) {
        price = p;
    }

    abstract double discount();
}

class Electronic extends Product {
    Electronic(double p) {
        super(p);
    }

    double discount() {
        return price * 0.9;
    }
}

class Clothing extends Product {
    Clothing(double p) {
        super(p);
    }

    double discount() {
        return price * 0.8;
    }
}

public class SistemProduk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Elektronik");
        System.out.println("2. Pakaian");
        int p = in.nextInt();

        System.out.print("Harga: ");
        double h = in.nextDouble();

        Product pr = (p == 1) ? new Electronic(h) : new Clothing(h);
        System.out.println("Harga setelah diskon: " + pr.discount());
    }
}