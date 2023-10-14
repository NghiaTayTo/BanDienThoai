package entity;

public class ChiTietHoaDon {
    private Integer maCt;
    private Integer maHd;
    private String maSp;
    private Integer soLuong;
    private Double donGia;
    private Double phiVanChuyen;
    private Double tongTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(Integer maCt, Integer maHd, String maSp, Integer soLuong, Double donGia, Double phiVanChuyen, Double tongTien) {
        this.maCt = maCt;
        this.maHd = maHd;
        this.maSp = maSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.phiVanChuyen = phiVanChuyen;
        this.tongTien = tongTien;
    }

    public Integer getMaCt() {
        return maCt;
    }

    public void setMaCt(Integer maCt) {
        this.maCt = maCt;
    }

    public Integer getMaHd() {
        return maHd;
    }

    public void setMaHd(Integer maHd) {
        this.maHd = maHd;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getPhiVanChuyen() {
        return phiVanChuyen;
    }

    public void setPhiVanChuyen(Double phiVanChuyen) {
        this.phiVanChuyen = phiVanChuyen;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
