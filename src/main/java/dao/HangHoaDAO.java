/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author TRONG NGHIA
 */
public class HangHoaDAO {
      private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {                
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
        public List<Object[]> getHoaDon() {
        String sql = "{CALL sp_Hoadon}";
        String[] clos = {"TenKH", "Sdtkh", "MaNV","NgayTao","SoLuong","tienhang","PhiVanChuyen","giagiam","tongtien","ghichu"};
        return this.getListOfArray(sql, clos);
    }
          public List<Object[]> getsanphamq() {
        String sql = "{CALL sp_cacsanpham}";
        String[] clos = {"Tensp", "giaban", "giasale","SoLuong","thanhtien"};
        return this.getListOfArray(sql, clos);
    }


}
