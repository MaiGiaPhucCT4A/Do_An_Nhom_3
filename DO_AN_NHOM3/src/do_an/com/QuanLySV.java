/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LaptopDT
 */
public class QuanLySV {

    static Scanner sc = new Scanner(System.in);
    List<SinhVien> listSV = new ArrayList<>();
    List<DiemSV> listDiem = new ArrayList<>();
    List<DiemSV> dsMonHoc = new ArrayList<>();

    public QuanLySV() {
        this.listSV = new ArrayList<>();
        this.listDiem = new ArrayList<>();
        this.dsMonHoc = new ArrayList<>();
    }

    // Nhập thông tin sinh viên
    public void themSinhVien() {
        SinhVien sv = new SinhVien();
        int i, N;
        System.out.printf("Nhập số lượng sinh viên:");
        N = sc.nextInt();
        sc.nextLine();
        for (i = 1; i <= N; i++) {
            System.out.println("=========================");
            System.out.printf("Nhập họ và tên sinh viên : ");
            String hoten = sc.nextLine();
            System.out.printf("Nhập mã sinh viên của sinh viên : ");
            String masv = sc.nextLine();
            System.out.printf("Nhập lớp niên chế của sinh viên : ");
            String lopNC = sc.nextLine();
            System.out.printf("Nhập quê quán của sinh viên : ");
            String que = sc.nextLine();
            System.out.println("Nhập ngày tháng năm sinh của sinh viên : ");
            System.out.printf("Nhập ngày sinh:");
            int d = sc.nextInt();
            System.out.printf("Nhập tháng sinh:");
            int m = sc.nextInt();
            System.out.printf("Nhập năm sinh:");
            int y = sc.nextInt();
            sc.nextLine();
            LocalDate birthday = LocalDate.of(y, m, d);
            sv = new SinhVien(hoten, masv, lopNC, birthday, que);
            listSV.add(sv);
        }
    }

    public void themMonHoc() {
        DiemSV ds = new DiemSV();
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nhập môn học: ");
            String monhoc = sc.nextLine();
            System.out.printf("Nhập số tín chỉ: ");
            int tc = sc.nextInt();
            sc.nextLine();
            ds = new DiemSV(monhoc, tc);
            dsMonHoc.add(ds);
        }

        for (int i = 0; i < dsMonHoc.size(); i++) {
            System.out.printf("%d. ", i + 1);
            dsMonHoc.get(i).inDSMonHoc();
        }
    }

    public void themDiemSinhVien() {
        System.out.printf("Nhập mã sinh viên của sinh viên cần thêm môn học: ");
        String msv = sc.nextLine();
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMaSV().equals(msv) == true) {
                count++;
                tmp = i;
            }
        }
        if (count != 0) {

            System.out.printf("Nhập tên môn học: ");
            listDiem.get(tmp).setTenMonHoc(sc.nextLine());
            System.out.printf("Nhập số tín chỉ môn học: ");
            listDiem.get(tmp).setSoTC(sc.nextInt());
            System.out.printf("Nhập điểm môn học: ");
            listDiem.get(tmp).setDiemMH(sc.nextDouble());
            sc.nextLine();

        } else {
            System.out.println("Không tìm thấy sinh viên có mã sinh viên trong danh sách:");
            System.out.println(" 1.Thêm mới sinh viên:");
            System.out.println(" 2.Thoát");
            System.out.println("------------------------------");
            System.out.println("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("Nhập họ và tên sinh viên");
                    String hoten = sc.nextLine();
                    System.out.printf("Nhập mã sinh viên của sinh viên : ");
                    String masv = sc.nextLine();
                    System.out.printf("Nhập lớp niên chế của sinh viên : ");
                    String lopNC = sc.nextLine();
                    System.out.printf("Nhập quê quán của sinh viên : ");
                    String que = sc.nextLine();
                    System.out.println("Nhập ngày tháng năm sinh của sinh viên : ");
                    System.out.printf("Nhập ngày sinh:");
                    int d = sc.nextInt();
                    System.out.printf("Nhập tháng sinh:");
                    int m = sc.nextInt();
                    System.out.printf("Nhập năm sinh:");
                    int y = sc.nextInt();
                    LocalDate birthday = LocalDate.of(y, m, d);
                    SinhVien sv = new SinhVien(hoten, masv, lopNC, birthday, que);
                    listSV.add(sv);
                    sc.nextLine();
                    System.out.println("Nhập tên môn học:");
                    String tenMonHoc = sc.nextLine();
                    System.out.println("Nhập số tín chỉ môn học:");
                    int soTinChi = sc.nextInt();
                    System.out.println("Nhập điểm môn học:");
                    double diemMonHoc = sc.nextDouble();
                    DiemSV diemSinhVien = new DiemSV(tenMonHoc, soTinChi, diemMonHoc, hoten, masv, lopNC, birthday, que);
                    listDiem.add(diemSinhVien);
                    break;
                case 2:
                    break;

            }

        }
    }

    // Tìm kiếm thông tin sinh viên
    public void timKiemSVtheoMaSV() {
        int count = 0;
        System.out.printf("Nhập mã sinh viên cần tìm:");
        String masv = sc.nextLine();
        for (SinhVien sv : listSV) {
            if (sv.getMaSV().equalsIgnoreCase(masv)) {
                System.out.println(sv.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm được mã sinh viên của sinh viên mà bạn yêu cầu!");
        }
    }

    //sửa thông tin sinh viên
    public void suaThongTinSinhVien() {
        System.out.println("Nhập mã số sinh viên của sinh viên cần thay đổi: ");
        String msv = sc.nextLine();
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMaSV().equals(msv) == true) {
                count++;
                tmp = i;
            }
        }
        if (count != 0) {
            boolean cont = true;
            do {
                System.out.println("1.Thay đổi tên sinh viên");
                System.out.println("2.Thay đổi lớp niên chế");
                System.out.println("3.Thay đổi ngày sinh");
                System.out.println("4.Thay đổi quê quán");
                System.out.println("5.Thoát");
                System.out.println("-----------------------------------");
                System.out.println("Chọn: ");
                int chon = sc.nextInt();
                sc.nextLine();
                switch (chon) {
                    case 1:
                        System.out.println("Nhập họ và tên mới sinh viên: ");
                        listSV.get(tmp).setHoTen(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Nhập tên lớp mới của sinh viên: ");
                        listSV.get(tmp).setTenLopNC(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Nhập ngày sinh mới của sinh viên:");
                        int d = sc.nextInt();
                        System.out.println("Nhập tháng sinh mới của sinh viên:");
                        int m = sc.nextInt();
                        System.out.println("Nhập năm sinh mới của sinh viên:");
                        int y = sc.nextInt();
                        listSV.get(tmp).setNgaySinh(LocalDate.of(y, m, d));
                        break;
                    case 4:
                        System.out.println("Nhập quê quán mới của sinh viên:");
                        listSV.get(tmp).setQueQuan(sc.nextLine());
                        break;
                    case 5:
                        cont = false;
                        break;

                }
            } while (cont);
        } else {
            System.out.println("Không tìm thấy sinh viên có mã số sinh viên: " + msv);
        }
    }

    // in thông tin sinh viên
    public void inDSthongTinSV() {
        listSV.stream().forEach(ob -> System.out.println(ob));
    }

    public void inDiemSinhVien() {
        for (DiemSV diemSV : listDiem) {
            System.out.println("Họ tên sinh viên: " + diemSV.getHoTen() + " -Mã sinh viên: " + " -" + diemSV.getMaSV() + diemSV.toString());
        }
    }

    // menu
    public static void showMenu() {
        System.out.println("-----------MENU------------");
        System.out.println("0. Tạo thông tin môn học");
        System.out.println("1. Thêm thông tin sinh viên vào danh sách");
        System.out.println("2. Thêm thông tin môn học của sinh viên vào danh sách");
        System.out.println("3. Sửa thông tin sinh viên trong danh sách");
        System.out.println("4. Tìm kiếm thông tin sinh viên theo mã sinh viên");
        System.out.println("5. In danh sách thông tin cá nhân sinh viên");
        System.out.println("6. In danh sách điểm của sinh viên");
        System.out.println("7. In danh sách sinh viên theo lớp niên chế");
        System.out.println("8. In danh sách sinh viên theo lớp học phần");
        System.out.println("9. In danh sách học lực của sinh viên");
        System.out.println("10. Thoát");
        System.out.print("Please choose: ");
        System.out.println("---------------------------");
    }
}
/*    public void themDiemSinhVien() {
        DiemSV diemSV = new DiemSV();
        Double diemTB = 0.0d;
        System.out.println("Nhập mã sinh viên cần thêm điểm:");
        String msv = sc.nextLine();
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMaSV().compareTo(msv) == 0) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("=========================");
                    System.out.printf("Nhập tên môn học:");
                    String monHoc = sc.nextLine();
                    System.out.printf("Nhập số tín chỉ:");
                    int tc = sc.nextInt();
                    System.out.printf("Nhập điểm của môn học:");
                    double diem = sc.nextDouble();
                    diemTB = diemTB + diem;
                    sc.nextLine();
                    diemSV = new DiemSV(monHoc, tc, diem);
                    listDiem.add(diemSV);
                }
                break;
            } else {
                System.out.println("Không tìm được mã sinh viên của sinh viên mà bạn yêu cầu!");
                break;
            }
        }
    }*/
