/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author TRONG NGHIA
 */
public class check extends JFrame{
      public   void xuat(JLabel lbl){
            lbl.setText("ok chưa");
            MsgBox.alert(this, "thông báo");
        }
}
