/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import static do_an.com.QuanLySV.sc;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LaptopDT
 */
public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        QuanLySV qlsv = new QuanLySV();
        int lc, n, i;
        String hoTen = null, msv = null, lopNC = null, que = null;
        int d = 0, y = 0, m = 0;
        while (true) {
            qlsv.menu();
            lc = sc.nextInt();
            switch (lc) {
                case 1:
                    qlsv.themThongTinSV(hoTen, msv, lopNC, que, d, y, m);
                    break;
                case 2:
                    //    sc.nextLine();
                    //    System.out.print("Nhap msv can xoa:");
                    msv = sc.nextLine();
                    /*    if (qlsv.xoaSV(msv) == true) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tồn tại msv " + msv);
                    }*/
                    //    qlsv.xoaSV(msv);       
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nhap msv can sua:");
                    msv = sc.nextLine();
                    qlsv.suaThongTinSV(msv);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Nhap msv can tim kiem:");
                    msv = sc.nextLine();
                    qlsv.in1SV(msv);
                    break;
                case 5:
                    qlsv.locDanhSachSV();
                    break;
                case 6:
                    qlsv.inDS();
                    break;
                case 8:
                //    qlsv.sapXepSV();
                    break;
                case 7:
                    sc.nextLine();
                    System.out.print("Nhap msv can them diem:");
                    msv = sc.nextLine();
                    if (qlsv.timKiemSV(msv) != -1) {
                        System.out.print("Nhap so mon hoc can them diem:");
                        n = sc.nextInt();
                        sc.nextLine();
                        for (i = 0; i < n; i++) {
                            qlsv.themDiemSV(msv);
                        }
                        qlsv.nhapDiemSV();
                    } else {
                        System.out.println("Ko tim thay sinh vien");
                    }
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
