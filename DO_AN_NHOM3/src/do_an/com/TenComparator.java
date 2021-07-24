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
public class TenComparator implements Comparator<SinhVien>{

    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        String [] a=o1.getHoTen().split(" ") ;
        String [] b=o2.getHoTen().split(" ") ;
        return a[a.length-1].compareTo(b[b.length-1]);
    }
    
}
