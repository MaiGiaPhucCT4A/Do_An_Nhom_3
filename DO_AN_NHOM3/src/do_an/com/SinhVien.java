/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SinhVien {

    private String hoTen;
    private String maSV;
    private String tenLopNC;
    private LocalDate ngaySinh;
    private String queQuan;
    private ArrayList<MonHoc> dsMonHoc = new ArrayList<>();

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, String tenLopNC, LocalDate ngaySinh, String queQuan, ArrayList<MonHoc> dsMonHoc) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.tenLopNC = tenLopNC;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.dsMonHoc = new ArrayList<>();
    }

    public SinhVien(String hoTen, String maSV, String tenLopNC, LocalDate ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.tenLopNC = tenLopNC;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public ArrayList<MonHoc> getDsMonHoc() {
        return dsMonHoc;
    }

    public void setDsMonHoc(ArrayList<MonHoc> dsMonHoc) {
        this.dsMonHoc = dsMonHoc;
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

    @Override
    public String toString() {
        String f = getNgaySinh().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return "Sinh viên{" + "Họ tên=" + hoTen + ", Mã SV=" + maSV + ", Lớp niên chế=" + tenLopNC + ", Ngày sinh=" + f + ", Quê quán=" + queQuan + '}';
    }

    public void themMonHoc() {
        double diem = 0;
        int tin = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số môn sinh viên đăng ký: ");
        int n = sc.nextInt();
        sc.nextLine();
        MonHoc monHoc = null;
        for (int i = 0; i < 2; i++) {
            monHoc = new MonHoc();
            System.out.printf("Nhập tên môn học: ");
            monHoc.setTenMonHoc(sc.nextLine());
            System.out.printf("Nhập số tín chỉ: ");
            monHoc.setSoTinChi(sc.nextInt());
            System.out.printf("Nhập điểm môn học: ");
            monHoc.setDiemMH(sc.nextDouble());
            diem += monHoc.getDiemMH() * monHoc.soTinChi;
            tin += monHoc.soTinChi;
            monHoc.setDiemTB(diem / tin);
            sc.nextLine();
            dsMonHoc.add(monHoc);
        }

    }
}
