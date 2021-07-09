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

    public QuanLySV() {
        this.listSV = new ArrayList<>();
        this.listDiem = new ArrayList<>();
    }

    // Tìm kiếm thông tin sinh viên
    public void timKiemSVtheoTen() {
        System.out.printf("Nhập tên sinh viên cần tìm:");
        String hoTen = sc.nextLine();
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getHoTen().equals(hoTen) == true) {
                System.out.println("Thông tin sinh viên mà bạn yêu cầu:");
                System.out.println(listSV.get(i).toString());
                break;
            } else if (listSV.get(i).getHoTen().equals(hoTen) == false) {
                System.out.println("Không tìm được tên của sinh viên mà bạn yêu cầu!");
                break;
            }
        }
    }

    public void timKiemSVtheoMaSV() {
        System.out.printf("Nhập mã sinh viên cần tìm:");
        String masv = sc.nextLine();
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMaSV().equals(masv) == true) {
                System.out.println("Thông tin sinh viên mà bạn yêu cầu:");
                System.out.println(listSV.get(i).toString());
                break;
            } else if (listSV.get(i).getMaSV().equals(masv) == false) {
                System.out.println("Không tìm được mã sinh viên của sinh viên mà bạn yêu cầu!");
                break;
            }
        }

    }

    // thêm thông tin vào danh sách
    public void themSinhVien(SinhVien a) {
        listSV.add(a);
    }

    public void themMonHoc(DiemSV a) {
        listDiem.add(a);
    }

    // in thông tin sinh viên
    public void inDS() {
        listSV.stream().forEach(ob -> System.out.println(ob));
    }

    public void inThongTinMonHoc() {
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
        System.out.print("Please choose: ");
        System.out.println("---------------------------");
    }
}
