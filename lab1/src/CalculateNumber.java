import javax.swing.JOptionPane;
public class CalculateNumber{
    public static void main(String[] args) {

        String strNum1, strNum2;
        double num1, num2;

        strNum1 = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        strNum2 = JOptionPane.showInputDialog("Nhập số thứ hai:");


        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);


        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;

        String result;

        if (num2 != 0) {
            double quotient = num1 / num2;
            result = "Tổng: " + sum +
                    "\nHiệu: " + diff +
                    "\nTích: " + product +
                    "\nThương: " + quotient;
        } else {
            result = "Tổng: " + sum +
                    "\nHiệu: " + diff +
                    "\nTích: " + product +
                    "\nKhông thể chia cho 0!";
        }


        JOptionPane.showMessageDialog(null, result);

        System.exit(0);
    }
}