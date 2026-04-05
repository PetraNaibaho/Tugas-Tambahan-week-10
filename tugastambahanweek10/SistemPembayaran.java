package tugastambahanweek10;

import java.util.Scanner;

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void process();

    public void display() {
        System.out.println("Jumlah pembayaran: " + amount);
        process();
    }
}

class CreditCard extends Payment {
    public CreditCard(double amount) {
        super(amount);
    }

    void process() {
        System.out.println("Metode: Credit Card");
    }
}

class EWallet extends Payment {
    public EWallet(double amount) {
        super(amount);
    }

    void process() {
        System.out.println("Metode: E-Wallet");
    }
}

public class SistemPembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PILIH METODE PEMBAYARAN ===");
        System.out.println("1. Credit Card");
        System.out.println("2. E-Wallet");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah pembayaran: ");
        double jumlah = input.nextDouble();

        Payment pembayaran;

        if (pilihan == 1) {
            pembayaran = new CreditCard(jumlah);
        } else if (pilihan == 2) {
            pembayaran = new EWallet(jumlah);
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        System.out.println("\n=== HASIL ===");
        pembayaran.display();
    }
}