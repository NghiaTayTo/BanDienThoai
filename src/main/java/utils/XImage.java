package utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class XImage {
//    logo trên thanh tiêu đề của hệ thống

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("/IMG/fpt2.png");
        return new ImageIcon(url).getImage();
    }
   

    public static void save(File src) {
        File dst = new File("Ảnh", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
            //            tạo thư mục Ảnh nếu chưa tồn tại
        }
        //            tạo thư mục logo nếu chưa tồn tại
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            //            copy file vào thư mục Ảnh
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ImageIcon read(String fileName, JLabel lblHinh) {
        File path = new File("Ảnh", fileName);
        if (!path.exists()) {
            return null;
        }
        ImageIcon originalIcon = new ImageIcon(path.getAbsolutePath());
        Image originalImage = originalIcon.getImage();

        // Lấy kích thước của JLabel
        int lblWidth = lblHinh.getWidth();
        int lblHeight = lblHinh.getHeight();

        // Scale ảnh để vừa với kích thước của JLabel
        Image scaledImage = originalImage.getScaledInstance(lblWidth, lblHeight, Image.SCALE_SMOOTH);

        // Tạo ImageIcon mới từ ảnh đã được scale
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        return scaledIcon;
    }

}
