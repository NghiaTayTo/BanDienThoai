
package entity;

import java.util.Date;


public class KhachHang {
        private Integer maKh;
        private String tenKh;
        private String sdt;
        private String email;
        private String diaChi;
        private Boolean gioiTinh;
        private Date ngaySinh;
        private Date ngayTao;
        private Integer soLanMua;
        private String moTa;
        private String tenDangNhap;
        private String matKhau;
        private String soTaiKhoan;
        private String nganHangThuHuong;
        private String vaiTro;

    public KhachHang() {
    }

    public KhachHang(Integer maKh, String tenKh, String sdt, String email, String diaChi, Boolean gioiTinh, Date ngaySinh, Date ngayTao, Integer soLanMua, String moTa, String tenDangNhap, String matKhau, String soTaiKhoan, String nganHangThuHuong, String vaiTro) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayTao = ngayTao;
        this.soLanMua = soLanMua;
        this.moTa = moTa;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.soTaiKhoan = soTaiKhoan;
        this.nganHangThuHuong = nganHangThuHuong;
        this.vaiTro = vaiTro;
    }

    public Integer getMaKh() {
        return maKh;
    }

    public void setMaKh(Integer maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Integer getSoLanMua() {
        return soLanMua;
    }

    public void setSoLanMua(Integer soLanMua) {
        this.soLanMua = soLanMua;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getNganHangThuHuong() {
        return nganHangThuHuong;
    }

    public void setNganHangThuHuong(String nganHangThuHuong) {
        this.nganHangThuHuong = nganHangThuHuong;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    

    
    
    
        
        
}
