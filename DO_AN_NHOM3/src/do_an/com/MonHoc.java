/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.time.LocalDate;

/**
 *
 * @author LaptopDT
 */
public class MonHoc extends SinhVien {

    private String tenMonHoc;
    private int soTC;
    private double diemMH;
    private double diemTB;

    public MonHoc(String tenMonHoc, int soTC, double diemMH, double diemTB) {
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
        this.diemMH = diemMH;
        this.diemTB = diemTB;
    }

    public MonHoc() {
    }

    public MonHoc(String tenMonHoc, int soTC, double diemMH, String hoTen, String maSV) {
        super(hoTen, maSV);
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
        this.diemMH = diemMH;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public double getDiemMH() {
        return diemMH;
    }

    public void setDiemMH(double diemMH) {
        this.diemMH = diemMH;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "tenMonHoc=" + tenMonHoc + ", soTC=" + soTC + ", diemMH=" + diemMH + ", diemTB=" + diemTB + '}';
    }

}
