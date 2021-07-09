/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import static do_an.com.QuanLySV.sc;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author LaptopDT
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon, i, j;
        QuanLySV quanLy = new QuanLySV();
        while (true) {
            quanLy.showMenu();
            System.out.printf("Chọn mục: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    SinhVien sv = new SinhVien();
                    int N;
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
                        quanLy.themSinhVien(sv);
                    }
                    break;
                case 2:
                    DiemSV diemSV = new DiemSV();
                    Double diemTB = 0.0d;
                    for (j = 0; j < 3; j++) {
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
                        quanLy.themMonHoc(diemSV);
                        if (j == 2) {
                            System.out.println("Điểm trung binh cộng GPA = " + diemTB);
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    quanLy.timKiemSVtheoTen();
                    break;
                case 5:
                    quanLy.timKiemSVtheoMaSV();
                    break;
                case 6:
                    quanLy.inDS();
                    break;
            }
        }
    }
}

/*    ql.nhapSinhVien();
        ql.inDS();
        ql.timKiemSVtheoMaSV();
        ql.timKiemSVtheoTen();
        ql.timKiemSVtheoTen();
        ql.nhapThongTinMonHoc();
        ql.inThongTinMonHoc();*/
