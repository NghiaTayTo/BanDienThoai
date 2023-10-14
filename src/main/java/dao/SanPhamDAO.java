package dao;

import entity.SanPham;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.MsgBox;
import utils.XJdbc;

public class SanPhamDAO extends PhoneDAO<SanPham, String> {

    String sql_insert = "insert into SanPham(tensanpham, giaban, ram, pin, rom,  manhinh, cpu, soluong, hedieuhanh, xuatxu, camera, phanloaihang,"
            + " tenloaihang, logo, mota, dophangiai, giaNhap) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    String sql_update = "update sanPham set tensanpham=?, giaban=?, ram=?, pin=?, rom=?,  manhinh=?, cpu=?, soluong=?, hedieuhanh=?,"
            + " xuatxu=?, camera=?, phanloaihang=?, tenloaihang=?, logo=?, mota=?, dophangiai=?, gianhap=? where masanpham=?";
    String sql_delete = "delete from sanpham where masanpham=?";
    String selectbyId = "select * from sanpham where masanpham=?";
    String selectByAll = "select * from sanpham";

    @Override
    public void insert(SanPham sp) {
        try {
            XJdbc.update(sql_insert,    
                    sp.getTenSanPham(),
                    sp.getGiaBan(),
                    sp.getRam(),
                    sp.getPin(),
                    sp.getRom(),
                    sp.getManHinh(),
                    sp.getCpu(),
                    sp.getSoLuong(),
                    sp.getHeDieuHanh(),
                    sp.getXuatXu(),
                    sp.getCamera(),
                    sp.getPhanLoaiHang(),
                    sp.getTenLoaiHang(),
                    sp.getLogo(),
                    sp.getMoTa(),
                    sp.getDoPhanGiai(),
                    sp.getGiaNhap()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(SanPham sp) {
        try {
            XJdbc.update(sql_update,
                    sp.getTenSanPham(),
                    sp.getGiaBan(),
                    sp.getRam(),
                    sp.getPin(),
                    sp.getRom(),
                    sp.getManHinh(),
                    sp.getCpu(),
                    sp.getSoLuong(),
                    sp.getHeDieuHanh(),
                    sp.getXuatXu(),
                    sp.getCamera(),
                    sp.getPhanLoaiHang(),
                    sp.getTenLoaiHang(),
                    sp.getLogo(),
                    sp.getMoTa(),
                    sp.getDoPhanGiai(),
                    sp.getGiaNhap(),
                    sp.getMaSanPham()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(String key) {
        try {
            XJdbc.update(sql_delete, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(selectByAll);
    }

    @Override
    public SanPham selectById(String key) {
        List<SanPham> list = this.selectBySql(selectbyId, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<SanPham>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                SanPham sp = new SanPham();

                sp.setMaSanPham(rs.getString(1));
                sp.setTenSanPham(rs.getString(2));
                sp.setGiaBan(rs.getDouble(3));
                sp.setRam(rs.getString(4));
                sp.setPin(rs.getString(5));
                sp.setRom(rs.getString(6));
                sp.setManHinh(rs.getString(7));
                sp.setCpu(rs.getString(8));
                sp.setSoLuong(rs.getInt(9));
                sp.setHeDieuHanh(rs.getString(10));
                sp.setXuatXu(rs.getString(11));
                sp.setCamera(rs.getString(12));
                sp.setPhanLoaiHang(rs.getString(13));
                sp.setTenLoaiHang(rs.getString(14));
                sp.setLogo(rs.getString(15));
                sp.setMoTa(rs.getString(16));
                sp.setDoPhanGiai(rs.getString(17));
                sp.setGiaNhap(rs.getDouble(18));
                
                list.add(sp);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
