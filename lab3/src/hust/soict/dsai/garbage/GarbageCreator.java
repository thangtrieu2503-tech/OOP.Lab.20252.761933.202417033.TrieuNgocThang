package hust.soict.dsai.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        String garbage = "";

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            garbage += "a";
        }

        long end = System.currentTimeMillis();

        System.out.println("Length: " + garbage.length());
        System.out.println("Time using String +: " + (end - start) + " ms");
    }
}