import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String choice;

        choice = JOptionPane.showInputDialog(
                "Chon bai toan:\n"
                        + "1. Phuong trinh bac nhat\n"
                        + "2. He phuong trinh 2 an\n"
                        + "3. Phuong trinh bac hai"
        );

        if (choice == null) {
            System.exit(0);
        }

        switch (choice) {
            case "1":
                solveLinearEquation();
                break;
            case "2":
                solveLinearSystem();
                break;
            case "3":
                solveQuadraticEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lua chon khong hop le!");
        }

        System.exit(0);
    }


    public static void solveLinearEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap b:"));

        String result;

        if (a == 0) {
            if (b == 0) {
                result = "Vo so nghiem";
            } else {
                result = "Vo nghiem";
            }
        } else {
            double x = -b / a;
            result = "Nghiem x = " + x;
        }

        JOptionPane.showMessageDialog(null, result);
    }


    public static void solveLinearSystem() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Nhap b1:"));

        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Nhap b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        String result;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            result = "Nghiem duy nhat:\n"
                    + "x1 = " + x1 + "\n"
                    + "x2 = " + x2;
        } else {
            if (D1 == 0 && D2 == 0) {
                result = "Vo so nghiem";
            } else {
                result = "Vo nghiem";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }


    public static void solveQuadraticEquation() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Nhap c:"));

        String result;

        if (a == 0) {

            if (b == 0) {
                if (c == 0) result = "Vo so nghiem";
                else result = "Vo nghiem";
            } else {
                double x = -c / b;
                result = "Nghiem x = " + x;
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                result = "Vo nghiem";
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "Nghiem kep x = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "2 nghiem:\n"
                        + "x1 = " + x1 + "\n"
                        + "x2 = " + x2;
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }
}