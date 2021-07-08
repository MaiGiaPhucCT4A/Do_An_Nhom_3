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
public class DiemSV extends SinhVien {

    private String tenMonHoc;
    private int soTC;
    private double diemMH;

    public DiemSV() {
    }

    public DiemSV(String tenMonHoc, int soTC, double diemMH, String hoTen, String maSV, String tenLopNC, LocalDate ngaySinh, String queQuan) {
        super(hoTen, maSV, tenLopNC, ngaySinh, queQuan);
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
        this.diemMH = diemMH;
    }

    public DiemSV(String tenMonHoc, int soTC, double diemMH) {
        this.tenMonHoc = tenMonHoc;
        this.soTC = soTC;
        this.diemMH = diemMH;
    }

    public double getDiemMH() {
        return diemMH;
    }

    public void setDiemMH(double diemMH) {
        this.diemMH = diemMH;
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

    @Override
    public String toString() {
        super.toString();
        return "DiemSV{" + "tenMonHoc=" + tenMonHoc + ", soTC=" + soTC + ", diemMH=" + diemMH + '}';
    }
}
