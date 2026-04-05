package tugastambahanweek10;

import java.util.Scanner;

abstract class FileProcessor {
    abstract void process();
}

class TextFile extends FileProcessor {
    void process(){ System.out.println("Proses file text"); }
}

class ImageFile extends FileProcessor {
    void process(){ System.out.println("Proses file gambar"); }
}

public class SistemFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Text\n2. Image");
        int p = in.nextInt();

        FileProcessor f = (p==1)? new TextFile(): new ImageFile();
        f.process();
    }
}