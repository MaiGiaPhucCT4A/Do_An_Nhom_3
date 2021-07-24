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
public class DTBComparator implements Comparator<SinhVien> {

  /*  
    @Override
    public int compare(MonHoc o1, MonHoc o2) {
        if (o1.getDiemTB() > o2.getDiemTB()) {
            return -1;
        } else if (o1.getDiemTB() < o2.getDiemTB()) {
            return 1;
        }
        return 0;

    }*/

   @Override
   public int compare(SinhVien o1, SinhVien o2) {
       if (o1.getDsMonHoc().get(0).getDiemTB() > o2.getDsMonHoc().get(0).getDiemTB()) {
           return -1;
      } else if (o1.getDsMonHoc().get(0).getDiemTB() < o2.getDsMonHoc().get(0).getDiemTB()) {
           return 1;
        } else {
           return 0;
        }
  }
}
