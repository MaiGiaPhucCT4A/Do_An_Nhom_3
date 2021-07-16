/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LaptopDT
 */
public class SinhVien {

    private String hoTen;
    private String maSV;
    private String tenLopNC;
    private LocalDate ngaySinh;
    private String queQuan;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, String tenLopNC, LocalDate ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.tenLopNC = tenLopNC;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public SinhVien(String hoTen, String maSV) {
        this.hoTen = hoTen;
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenLopNC() {
        return tenLopNC;
    }

    public void setTenLopNC(String tenLopNC) {
        this.tenLopNC = tenLopNC;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /*    @Override
    public String toString() {
        String f = getNgaySinh().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String str = String.format("Họ Tên: %s\nMã Sinh Viên: %s\nTên Lớp Niên Chế: %s\nNgày Sinh: %s\nQuê Quán: ",
                getHoTen(), getMaSV(), getTenLopNC(), f);
        return str + getQueQuan();
    }*/
    @Override
    public String toString() {
        String f = getNgaySinh().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return "SinhVien{" + "hoTen=" + hoTen + ", maSV=" + maSV + ", tenLopNC=" + tenLopNC + ", ngaySinh=" + f + ", queQuan=" + queQuan + '}';
    }

}
