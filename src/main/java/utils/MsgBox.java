package utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MsgBox {

//    hiện thông báo
    public static void alert(Component parent, String mess) {
        JOptionPane.showMessageDialog(parent, mess, "QLDienThoai", JOptionPane.INFORMATION_MESSAGE);
    }

//    chọn yes or no
    public static boolean confirm(Component parent, String mess) {
        int result = JOptionPane.showConfirmDialog(parent, mess, "QLDienThoai",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

//    điền thông tin
    public static String promt(Component parent, String mess) {
        return JOptionPane.showInputDialog(parent, mess, "QLDienThoai", JOptionPane.INFORMATION_MESSAGE);
    }
}
