package hust.soict.dsai.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuilder noGarbage = new StringBuilder();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            noGarbage.append("a");
        }

        long end = System.currentTimeMillis();

        System.out.println("Length: " + noGarbage.length());
        System.out.println("Time using StringBuilder: " + (end - start) + " ms");
    }
}