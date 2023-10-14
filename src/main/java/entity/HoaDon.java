package entity;

import java.util.Date;

public class HoaDon {

    private Integer maHoaDon;
    private Date ngayLap;
    private Double tongTien;
    private Integer maKH;
    private String maNV;

    public HoaDon() {
    }

    public HoaDon(Integer maHoaDon, Date ngayLap, Double tongTien, Integer maKH, String maNV) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.maKH = maKH;
        this.maNV = maNV;
    }

    public Integer getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Integer maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public Integer getMaKH() {
        return maKH;
    }

    public void setMaKH(Integer maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

}
