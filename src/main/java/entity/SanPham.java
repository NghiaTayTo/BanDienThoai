/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author kle99
 */
public class SanPham {

    public String maSanPham;
    public String tenSanPham;
    public Double giaBan;
    public String ram;
    public String pin;
    public String rom;
    public String manHinh;
    public String cpu;
    public Integer soLuong;
    public String heDieuHanh;
    public String xuatXu;
    public String camera;
    public String phanLoaiHang;
    public String tenLoaiHang;
    private String logo;
    private String moTa;
    private String doPhanGiai;
    private Double giaNhap;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, Double giaBan, String ram, String pin, String rom, String manHinh, String cpu, Integer soLuong, String heDieuHanh, String xuatXu, String camera, String phanLoaiHang, String tenLoaiHang, String logo, String moTa, String doPhanGiai, Double giaNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.ram = ram;
        this.pin = pin;
        this.rom = rom;
        this.manHinh = manHinh;
        this.cpu = cpu;
        this.soLuong = soLuong;
        this.heDieuHanh = heDieuHanh;
        this.xuatXu = xuatXu;
        this.camera = camera;
        this.phanLoaiHang = phanLoaiHang;
        this.tenLoaiHang = tenLoaiHang;
        this.logo = logo;
        this.moTa = moTa;
        this.doPhanGiai = doPhanGiai;
        this.giaNhap = giaNhap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getPhanLoaiHang() {
        return phanLoaiHang;
    }

    public void setPhanLoaiHang(String phanLoaiHang) {
        this.phanLoaiHang = phanLoaiHang;
    }

    public String getTenLoaiHang() {
        return tenLoaiHang;
    }

    public void setTenLoaiHang(String tenLoaiHang) {
        this.tenLoaiHang = tenLoaiHang;
    }



    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getDoPhanGiai() {
        return doPhanGiai;
    }

    public void setDoPhanGiai(String doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
    }

    public Double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Double giaNhap) {
        this.giaNhap = giaNhap;
    }
     public String toString(){
         return this.camera +  " " + this.cpu + " " + this.doPhanGiai + " " + this.heDieuHanh + " " + this.logo + " " + this.maSanPham + " " + this.manHinh ;
     }

}
