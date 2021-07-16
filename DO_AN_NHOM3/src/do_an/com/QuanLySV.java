/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LaptopDT
 */
public class QuanLySV {

    static Scanner sc = new Scanner(System.in);
    List<SinhVien> listSV = new ArrayList<>();
    List<MonHoc> listDiem = new ArrayList<>();

    /*    public QuanLySV() {
        this.listSV = new ArrayList<>();
        this.listDiem = new ArrayList<>();
    }*/
    public void menu() {
        System.out.println("\t1.Them sinh vien.");
        System.out.println("\t2.Xoa sinh vien.");
        System.out.println("\t3.Sua sinh vien.");
        System.out.println("\t4.Tim kiem sinh vien.");
        System.out.println("\t5.Loc danh sach sinh vien.");
        System.out.println("\t6.In danh sach sinh vien.");
        System.out.println("\t7.Them diem sinh vien.");
        System.out.print("Nhap lua chon:");
    }

    public void menuSua() {
        System.out.println("\t3.1.Sua toan bo thong tin sinh vien.");
        System.out.println("\t3.2.Sua ten sinh vien.");
        System.out.println("\t3.3.Sua ten lop Nien Che.");
        System.out.println("\t3.4.Sua ngay sinh.");
        System.out.println("\t3.5.Sua que quan.");
        System.out.println("\t3.6.Sua diem sinh vien.");
        System.out.print("Nhap lua chon:");
    }

    public void menuSapXep() {
        System.out.println("\t7.1.Sap xep theo ma sv sinh vien.");
    }

    public void menuInDanhSach() {
        System.out.println("\t6.1.In danh sach sinh vien.");
        System.out.println("\t6.2.In danh sach thong tin sinh vien.");
        System.out.println("\t6.3.In danh sach diem sinh vien.");
        System.out.print("Nhap lua chon:");
    }

    public void menuLoc() {
        System.out.println("\t5.1.Loc theo lop nien che.");
        System.out.println("\t5.2.Loc theo lop hoc phan.");
        System.out.println("\t5.3.Loc theo hoc luc.(Gioi/Kha/Hoc lai)");
        System.out.print("Nhap lua chon:");
    }

    // Nhập thông tin sinh viên
    public void themThongTinSV(String hoTen, String msv, String lopNC, String que, int d, int y, int m) {

        int i, N;
        System.out.printf("Nhập số lượng sinh viên:");
        N = sc.nextInt();
        sc.nextLine();
        for (i = 1; i <= N; i++) {
            SinhVien sv = new SinhVien();
            System.out.println("=========================");
            System.out.printf("Họ và tên: ");
            hoTen = sc.nextLine();
            sv.setHoTen(hoTen);
            System.out.printf("Mã sinh viên: ");
            msv = sc.nextLine();
            sv.setMaSV(msv);
            System.out.printf("lớp niên chế của sinh viên: ");
            lopNC = sc.nextLine();
            sv.setTenLopNC(lopNC);
            System.out.printf("quê quán của sinh viên: ");
            que = sc.nextLine();
            sv.setQueQuan(que);
            System.out.println("Ngày tháng năm sinh của sinh viên : ");
            System.out.printf("Nhập ngày sinh:");
            d = sc.nextInt();
            System.out.printf("Nhập tháng sinh:");
            m = sc.nextInt();
            System.out.printf("Nhập năm sinh:");
            y = sc.nextInt();
            sc.nextLine();
            sv.setNgaySinh(LocalDate.of(y, m, d));
            listSV.add(sv);
        }
    }

    //Nhập điểm cho sinh viên
    public void themDiemSV(String msv) {
        MonHoc d = new MonHoc();
        d.setMaSV(msv);
        System.out.print("Ten mon hoc:");
        d.setTenMonHoc(sc.nextLine());
        System.out.print("So tin chi:");
        d.setSoTC(sc.nextInt());
        System.out.print("Diem:");
        d.setDiemMH(sc.nextDouble());
        sc.nextLine();
        listDiem.add(d);
    }

    //Tính điểm trung bình môn học
    public double diemTrungBinh(String msv) {
        int i, soTinChi = 0;
        double diemTB = 0;
        for (i = 0; i < listDiem.size(); i++) {
            if (listDiem.get(i).getMaSV().equals(msv)) {
                diemTB += listDiem.get(i).getDiemMH() * listDiem.get(i).getSoTC();
                soTinChi += listDiem.get(i).getSoTC();
            }
        }
        return diemTB / soTinChi;
    }

    public void nhapDiemSV() {
        int i;
        for (i = 0; i < listDiem.size(); i++) {
            listDiem.get(i).setDiemTB(diemTrungBinh(listDiem.get(i).getMaSV()));
        }
    }

    // Tìm kiếm sinh viên theo mã sinh viên
    public int timKiemSV(String msv) {
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMaSV().equals(msv)) {
                return i;
            }
        }
        return -1;
    }

    // Tìm kiếm môn học xem môn học có trong ds không để nhập điểm
    public int timKiemMH(String msv, String tenMH) {
        for (int i = 0; i < listDiem.size(); i++) {
            if (listDiem.get(i).getTenMonHoc().equals(tenMH) && listDiem.get(i).getMaSV().equals(msv)) {
                return i;
            }
        }
        return -1;
    }

    // Xóa sinh viên
    public void xoaSV(String msv) {
        if (timKiemSV(msv) != -1) {
            listSV.remove(timKiemSV(msv));
        } else {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    // Sửa thông tin sinh viên
    public void suaThongTinSV(String msv) {
        menuSua();
        if (timKiemSV(msv) != -1) {
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.printf("Họ và tên: ");
                    listSV.get(timKiemSV(msv)).setHoTen(sc.nextLine());
                    System.out.printf("Mã sinh viên: ");
                    listSV.get(timKiemSV(msv)).setMaSV(sc.nextLine());
                    System.out.printf("lớp niên chế của sinh viên: ");
                    listSV.get(timKiemSV(msv)).setTenLopNC(sc.nextLine());
                    System.out.printf("quê quán của sinh viên: ");
                    listSV.get(timKiemSV(msv)).setQueQuan(sc.nextLine());
                    System.out.println("Ngày tháng năm sinh của sinh viên : ");
                    System.out.printf("Nhập ngày sinh:");
                    int d = sc.nextInt();
                    System.out.printf("Nhập tháng sinh:");
                    int m = sc.nextInt();
                    System.out.printf("Nhập năm sinh:");
                    int y = sc.nextInt();
                    sc.nextLine();
                    listSV.get(timKiemSV(msv)).setNgaySinh(LocalDate.of(y, m, d));
                    break;
                case 2:
                    System.out.printf("Họ và tên: ");
                    listSV.get(timKiemSV(msv)).setHoTen(sc.nextLine());
                    break;
                case 3:
                    System.out.printf("lớp niên chế của sinh viên: ");
                    listSV.get(timKiemSV(msv)).setTenLopNC(sc.nextLine());
                    break;
                case 4:
                    System.out.printf("quê quán của sinh viên: ");
                    listSV.get(timKiemSV(msv)).setQueQuan(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Ngày tháng năm sinh của sinh viên : ");
                    System.out.printf("Nhập ngày sinh:");
                    int d1 = sc.nextInt();
                    System.out.printf("Nhập tháng sinh:");
                    int m1 = sc.nextInt();
                    System.out.printf("Nhập năm sinh:");
                    int y1 = sc.nextInt();
                    sc.nextLine();
                    listSV.get(timKiemSV(msv)).setNgaySinh(LocalDate.of(y1, m1, d1));
                    break;
                case 6:
                    System.out.printf("Tên môn học:");
                    String tenMH = sc.nextLine();
                    listDiem.get(timKiemMH(msv, tenMH)).setDiemMH(sc.nextDouble());
                    break;
            }
        } else {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    // In kết quả
    public void inDS() {
        menuInDanhSach();
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                for (int i = 0; i < listSV.size(); i++) {
                    Collections.sort(listSV, new MaSVComparator());
                    System.out.println(listSV.get(i).toString());
                    for (int j = 0; j < listDiem.size(); j++) {
                        if (listDiem.get(j).getMaSV().equals(listSV.get(i).getMaSV())) {
                            System.out.println("\t" + listDiem.get(j).toString());
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < listSV.size(); i++) {
                    Collections.sort(listSV, new MaSVComparator());
                    System.out.println(listSV.get(i).toString());
                }
                break;
            case 3:
                for (int j = 0; j < listDiem.size(); j++) {
                    Collections.sort(listDiem, new MaSVComparator());
                    System.out.println(listDiem.get(j).toString());
                }
                break;
        }
    }

    // In ra thông tin 1 sinh viên
    public void in1SV(String msv) {
        int j;
        System.out.println(listSV.get(timKiemSV(msv)).toString());
        for (j = 0; j < listDiem.size(); j++) {
            if (listDiem.get(j).getMaSV().equals(listSV.get(timKiemSV(msv)).getMaSV())) {
                Collections.sort(listDiem, new MaSVComparator());
                System.out.println("\t" + listDiem.get(j).toString());
            }
        }
    }

    public void locDanhSachSV() {
        //    try {
        menuLoc();
        Collections.sort(listSV, new MaSVComparator());
        int i, j;
        String str;
//            FileWriter fw = null;
        //           fw = new FileWriter("E:\\Projects\\Java\\Quickly\\src\\luutru.txt");
        int lc = sc.nextInt();
        switch (lc) {
            case 1:
                sc.nextLine();
                System.out.print("nhap ten lop nien che can in danh sach:");
                str = sc.nextLine();
                for (i = 0; i < listSV.size(); i++) {
                    if (listSV.get(i).getTenLopNC().equals(str)) {
                        //    fw.write(listSV.get(i).toString());
                        //    fw.write("\n");
                        System.out.println(listSV.get(i).toString());
                    }
                }
                //    fw.close();
                break;
            case 2:
                sc.nextLine();
                System.out.print("Nhap ten lop hoc phan can in danh sach:");
                str = sc.nextLine();
                for (i = 0; i < listDiem.size(); i++) {
                    if (listDiem.get(i).getTenMonHoc().equals(str)) {
                        for (j = 0; j < listSV.size(); j++) {
                            if (listSV.get(j).getMaSV().equals(listDiem.get(i).getMaSV())) {
                                //    fw.write(listSV.get(j).toString());
                                //    fw.write("\n");
                                System.out.println(listSV.get(i).toString());
                            }
                        }
                    }
                }
                //    fw.close();
                break;
            case 3:
                int count;
                sc.nextLine();
                System.out.print("Nhap Loai hoc luc/ Hoc lai can in danh sach:");
                str = sc.nextLine();
                if ("Gioi".equals(str)) {
                    count = 0;
                    for (i = 0; i < listDiem.size(); i++) {
                        if (listDiem.get(i).getDiemTB() >= 9.0) {
                            //    fw.write(listSV.get(i).toString());
                            //    fw.write("\n");
                            System.out.println(listDiem.get(i).toString());
                            count++;
                            if (count == 10) {
                                break;
                            }
                        }
                    }
                } else if ("Kha".equals(str)) {
                    count = 0;
                    for (i = 0; i < listDiem.size(); i++) {
                        if (listDiem.get(i).getDiemTB() >= 7.0 && listDiem.get(i).getDiemTB() < 9.0) {
                            //    fw.write(listSV.get(i).toString());
                            //    fw.write("\n");
                            System.out.println(listDiem.get(i).toString());
                            count++;
                            if (count == 20) {
                                break;
                            }
                        }
                    }
                } else if ("Hoc lai".equals(str)) {
                    System.out.print("Nhap ten lop hoc phan can in danh sach:");
                    str = sc.nextLine();
                    for (i = 0; i < listDiem.size(); i++) {
                        if (listDiem.get(i).getTenMonHoc().equals(str)) {
                            for (j = 0; j < listDiem.size(); j++) {
                                if (listSV.get(j).getMaSV().equals(listDiem.get(i).getMaSV()) && listDiem.get(j).getDiemTB() < 4.0) {
                                    //    fw.write(listSV.get(j).toString());
                                    //    fw.write("\n");
                                    System.out.println(listDiem.get(i).toString());
                                }
                            }
                        }
                    }
                }
            //    fw.close();
            }
        /*    } catch (IOException ex) {
            Logger.getLogger(QuanLiSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    }

    // In danh sách lên bảng
    public void inThongTinSVTable(DefaultTableModel tblModel) {
        tblModel.setColumnCount(0); // xóa trắng nội dung được hiển thị ở trong bảng
        for (SinhVien s : listSV) {
            Object[] row = new Object[]{
                s.getMaSV(), s.getHoTen(), s.getTenLopNC(), s.getNgaySinh(), s.getQueQuan()
            };
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged(); // Cập nhật lại dữ liệu đc hiển thị trong table
    }

    //**************************
    public SinhVien timKiemMaSV(String msv) {
        for (SinhVien sv : listSV) {
            if (sv.getMaSV().equals(msv)) {
                return sv;
            }
        }
        return null;
    }

    public boolean xoaMaSV(String msv) {
        for (SinhVien sv : listSV) {
            if (sv.getMaSV().equals(msv)) {
                listSV.remove(sv);
                return true;
            }
        }
        return false;
    }

    // cập nhật thông tin của sinh viên trong ds
    public boolean update(SinhVien sv) {
        SinhVien existedSV = timKiemMaSV(sv.getMaSV());
        boolean flag = false;
        if (existedSV != null) {
            existedSV.setHoTen(sv.getHoTen());
            existedSV.setMaSV(sv.getMaSV());
            existedSV.setTenLopNC(sv.getTenLopNC());
            existedSV.setQueQuan(sv.getQueQuan());
            existedSV.setNgaySinh(sv.getNgaySinh());
            flag = true;
        }
        return flag;
    }
}
