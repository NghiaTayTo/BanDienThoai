/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author kle99
 */
public class VaiTro {
    public String maVT;
    public String tenVaiTro;

    public VaiTro() {
    }

    public VaiTro(String maVT, String tenVaiTro) {
        this.maVT = maVT;
        this.tenVaiTro = tenVaiTro;
    }

    public String getMaVT() {
        return maVT;
    }

    public void setMaVT(String maVT) {
        this.maVT = maVT;
    }

    public String getTenVaiTro() {
        return tenVaiTro;
    }

    public void setTenVaiTro(String tenVaiTro) {
        this.tenVaiTro = tenVaiTro;
    }
    
}
