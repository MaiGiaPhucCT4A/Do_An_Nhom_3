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
                case 0:
                    quanLy.themMonHoc();
                    break;
                case 1:
                    quanLy.themSinhVien();
                    break;
                case 2:
                    quanLy.themDiemSinhVien();
                    break;
                case 3:
                    quanLy.suaThongTinSinhVien();
                    break;
                case 4:
                    quanLy.timKiemSVtheoMaSV();
                    break;
                case 5:
                    quanLy.inDSthongTinSV();
                    break;
                case 6:
                    quanLy.inDanhSachDiemSinhVien();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    quanLy.inDiemSinhVien();
                    break;
                case 11:
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
