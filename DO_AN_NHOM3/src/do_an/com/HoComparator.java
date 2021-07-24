/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.util.Comparator;

/**
 *
 * @author ACER
 */
public class HoComparator implements Comparator<SinhVien>{

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());//To change body of generated methods, choose Tools | Templates.
    }
    
}
