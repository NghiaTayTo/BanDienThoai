/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author kle99
 */
public class MauSac {
    public String maMau;
    public String tenMau;
    public String maSanPham;

    public MauSac(String maMau, String tenMau, String maSanPham) {
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.maSanPham = maSanPham;
    }

    public MauSac() {
    }

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }
    
    
}
