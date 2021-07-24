/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class MonHoc extends Diem {

    String tenMonHoc;
    int soTinChi;

    public MonHoc() {
    }

    public MonHoc(String tenMonHoc, int soTinChi) {
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public MonHoc(String tenMonHoc, int soTinChi, double diemMH, double DTB) {
        super(diemMH, DTB);
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return "Môn học: " + tenMonHoc + "{ Số tín chỉ= " + soTinChi
                + ", Điểm môn học= " + getDiemMH() + "}";
    }

}
