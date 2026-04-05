package tugastambahanweek10;

import java.util.Scanner;

abstract class Vehicle {
    protected String name;
    protected double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    abstract double fuel();

    public void display() {
        System.out.println("Kendaraan: " + name);
        System.out.println("Kecepatan: " + speed);
        System.out.println("Konsumsi BBM: " + fuel());
    }
}

class Car extends Vehicle {
    public Car(String name, double speed) {
        super(name, speed);
    }

    double fuel() {
        return speed * 0.1;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String name, double speed) {
        super(name, speed);
    }

    double fuel() {
        return speed * 0.05;
    }
}

public class SistemKendaraan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PILIH KENDARAAN ===");
        System.out.println("1. Avanza (Mobil)");
        System.out.println("2. Vario (Motor)");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = input.nextInt();

        Vehicle kendaraan;

        if (pilihan == 1) {
            kendaraan = new Car("Avanza", 100);
        } else if (pilihan == 2) {
            kendaraan = new Motorcycle("Vario", 80);
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        System.out.println("\n=== HASIL ===");
        kendaraan.display();
    }
}