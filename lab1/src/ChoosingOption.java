import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {

        int option = JOptionPane.showConfirmDialog(
                null,
                "Ban co muon chuyen sang ve hang thuong gia khong?"
        );

        JOptionPane.showMessageDialog(
                null,
                "Ban chon: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No")
        );

        System.exit(0);
    }
}