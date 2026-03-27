import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String monthInput;
        int year;
        int month;

        while (true) {
            System.out.print("Nhap thang: ");
            monthInput = sc.nextLine().trim();

            System.out.print("Nhap nam: ");
            while (!sc.hasNextInt()) {
                System.out.println("Nam khong hop le. Nhap lai!");
                sc.next();
                System.out.print("Nhap nam: ");
            }
            year = sc.nextInt();
            sc.nextLine();

            month = getMonth(monthInput);

            if (month == -1 || year < 0) {
                System.out.println("Thang hoac nam khong hop le. Nhap lai!\n");
            } else {
                break;
            }
        }

        int days = getDaysInMonth(month, year);

        System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");

        sc.close();
    }

    public static int getMonth(String m) {
        m = m.trim().toLowerCase();

        switch (m) {
            case "1":
            case "jan":
            case "jan.":
            case "january":
                return 1;

            case "2":
            case "feb":
            case "feb.":
            case "february":
                return 2;

            case "3":
            case "mar":
            case "mar.":
            case "march":
                return 3;

            case "4":
            case "apr":
            case "apr.":
            case "april":
                return 4;

            case "5":
            case "may":
                return 5;

            case "6":
            case "jun":
            case "jun.":
            case "june":
                return 6;

            case "7":
            case "jul":
            case "jul.":
            case "july":
                return 7;

            case "8":
            case "aug":
            case "aug.":
            case "august":
                return 8;

            case "9":
            case "sep":
            case "sep.":
            case "sept":
            case "sept.":
            case "september":
                return 9;

            case "10":
            case "oct":
            case "oct.":
            case "october":
                return 10;

            case "11":
            case "nov":
            case "nov.":
            case "november":
                return 11;

            case "12":
            case "dec":
            case "dec.":
            case "december":
                return 12;

            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}