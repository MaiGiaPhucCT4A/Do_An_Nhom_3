/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.time.LocalDate;
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

    public QuanLySV() {
        this.listSV = new ArrayList<>();
        this.listDiem = new ArrayList<>();
    }

    //thêm sinh viên
    public void themSinhVien() {
        SinhVien sv = new SinhVien();
        System.out.println("Nhập họ và tên sinh viên : ");
        sv.setHoTen(sc.nextLine());
        System.out.println("Nhập mã sinh viên của sinh viên : ");
        sv.setMaSV(sc.nextLine());
        System.out.println("Nhập lớp niên chế của sinh viên : ");
        sv.setTenLopNC(sc.nextLine());
        System.out.println("Nhập quê quán của sinh viên : ");
        sv.setQueQuan(sc.nextLine());
        System.out.println("Nhập ngày sinh của sinh viên : ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        sv.setNgaySinh(LocalDate.of(y, m, d));
        listSV.add(sv);

    }

    //Quản lý điểm sinh viên
    public void nhapThongTinMonHoc() {
        DiemSV[] ds = new DiemSV[10];
        Double diemTB = null;
        for (int i = 0; i < ds.length; i++) {
            ds[i] = new DiemSV(sc.nextLine(), sc.nextInt(), sc.nextDouble());
            diemTB = diemTB + ds[i].getDiemMH();
        }

    }

    // Tìm kiếm thông tin sinh viên
    public String timKiemSVtheoTen() {
        String hoTen = sc.nextLine();
        for (int i = 0; i < listDiem.size(); i++) {
            if (listDiem.get(i).getHoTen().equals(hoTen)) {
                System.out.println("Thông tin sinh viên mà bạn yêu cầu:");
                listDiem.get(i).toString();
                break;
            } else if (listDiem.get(i).getHoTen().equals(hoTen) == false) {
                System.out.println("Không tìm được tên của sinh viên mà bạn yêu cầu!");
                break;
            }
        }
        return null;
    }

    public String timKiemSVtheoMaSV() {
        String masv = sc.nextLine();
        for (int i = 0; i < listDiem.size(); i++) {
            if (listDiem.get(i).getMaSV().equals(masv)) {
                System.out.println("Thông tin sinh viên mà bạn yêu cầu:");
                listDiem.get(i).toString();
                break;
            } else if (listDiem.get(i).getMaSV().equals(masv) == false) {
                System.out.println("Không tìm được mã sinh viên của sinh viên mà bạn yêu cầu!");
                break;
            }
        }
        return null;

    }

    // in thông tin sinh viên
    public void showDS() {
        listDiem.stream().forEach(ob -> System.out.println(ob));
    }

    // menu
    public static void showMenu() {
        System.out.println("-----------MENU------------");
        System.out.println("1. Thêm thông tin sinh viên vào danh sách");
        System.out.println("2. Thêm thông tin môn học của sinh viên vào danh sách");
        System.out.println("3. Sửa thông tin sinh viên trong danh sách");
        System.out.println("4. Tìm kiếm thông tin sinh viên theo họ tên");
        System.out.println("5. Tìm kiếm thông tin sinh viên theo mã sinh viên");
        System.out.println("6. In danh sách sinh viên theo lớp niên chế");
        System.out.println("7. In danh sách sinh viên theo lớp học phần");
        System.out.println("8. In danh sách học lực của sinh viên");
        System.out.println("0. Thoát");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
