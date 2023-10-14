package utils;

import entity.KhachHang;

public class Auth {
// duy trì tài khoản người dùng đăng nhập vào hệ thống

    public static KhachHang user = null;

//    khi đăng xuất sẽ clear thông tin tài khoản đăng nhập cũ 
    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return Auth.isLogin() && user.getVaiTro();
    }
}
