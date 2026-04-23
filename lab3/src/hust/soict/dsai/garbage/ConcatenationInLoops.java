package hust.soict.dsai.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        long startTime;
        long endTime;

        String s = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            s += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String using + operator: " + (endTime - startTime) + " ms");

        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            stringBuffer.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - startTime) + " ms");

        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            stringBuilder.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + " ms");
    }
}