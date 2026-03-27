import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Nhap ten cua ban:");
        String strName = keyboard.nextLine();

        System.out.println("Ban bao nhieu tuoi?");
        int iAge = keyboard.nextInt();

        System.out.println("Chieu cao cua ban (m)?");
        double dHeight = keyboard.nextDouble();

        System.out.println("Ban: " + strName + ", " + iAge + " tuoi.");
        System.out.println("Chieu cao: " + dHeight + " m");

        keyboard.close();
    }
}