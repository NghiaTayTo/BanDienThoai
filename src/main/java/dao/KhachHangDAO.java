package dao;

import entity.KhachHang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

public class KhachHangDAO extends PhoneDAO<KhachHang, String> {

    String insert = "insert into taikhoan(tendangnhap, matkhau) values(?,?); " + "insert into khachhang(tenkh, tendangnhap, matkhau, sodienthoai, email, ngaysinh,"
            + " ngaytao, gioitinh, sotaikhoan, nganhangthuhuong, ghichu, solanmua, diachi, mavt) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    String selectAll = "select * from khachhang";
    String selectById = "select * from khachhang where makh = ?";
    String selectByTenDangNhap = "select * from khachhang where tendangnhap = ?";

    @Override
    public void insert(KhachHang kh) {
        try {
            XJdbc.update(insert,
                    kh.getTenDangNhap(),
                    kh.getMatKhau(),
                    kh.getTenKh(),
                    kh.getTenDangNhap(),
                    kh.getMatKhau(),
                    kh.getSdt(),
                    kh.getEmail(),
                    new java.sql.Date(kh.getNgaySinh().getTime()),
                    new java.sql.Date(kh.getNgayTao().getTime()),
                    kh.getGioiTinh(),
                    kh.getSoTaiKhoan(),
                    kh.getNganHangThuHuong(),
                    kh.getMoTa(),
                    kh.getSoLanMua(),
                    kh.getDiaChi(),
                    kh.getVaiTro()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<KhachHang> selectAll() {
        return this.selectBySql(selectAll);
    }

    public KhachHang selectById(Integer id) {
        List<KhachHang> list = this.selectBySql(selectById, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public KhachHang selectByTenDangNhap(String id) {
        List<KhachHang> list = this.selectBySql(selectByTenDangNhap, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<KhachHang>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKh(rs.getInt(1));
                entity.setTenKh(rs.getString(2));
                entity.setTenDangNhap(rs.getString(3));
                entity.setMatKhau(rs.getString(4));
                entity.setSdt(rs.getString(5));
                entity.setEmail(rs.getString(6));
                entity.setNgaySinh(rs.getDate(7));
                entity.setNgayTao(rs.getDate(8));
                entity.setGioiTinh(rs.getBoolean(9));
                entity.setSoTaiKhoan(rs.getString(10));
                entity.setNganHangThuHuong(rs.getString(11));
                entity.setMoTa(rs.getString(12));
                entity.setSoLanMua(rs.getInt(13));
                entity.setDiaChi(rs.getString(14));
                entity.setVaiTro(rs.getString(15));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(KhachHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public KhachHang selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
