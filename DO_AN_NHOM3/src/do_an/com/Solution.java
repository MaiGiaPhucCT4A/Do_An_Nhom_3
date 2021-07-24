/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Solution {

    static Scanner sc = new Scanner(System.in);
// điểm môn học là điểm thi
    //điểm học phần là điểm trên lớp

    public static void main(String[] args) {

        QuanLySinhVien qlsv = new QuanLySinhVien();
        int lc;
        while (true) {
            qlsv.menu();
//            System.out.println("-----------------QUẢN LÝ SINH VIÊN------------------------");
//        System.out.println("1. Thêm sinh viên");
//        System.out.println("2. Lọc");
//        System.out.println("3. Sửa");
//        System.out.println("4. In danh sách");
//        System.out.println("5. In sinh viên");
//        System.out.println("6. Xóa");
//        System.out.println("----------------------------------------------------------");
            lc = sc.nextInt();
            sc.nextLine();
            switch (lc) {
                case 1:
                    qlsv.themSinhVien();
                    break;
                case 2:
                //    qlsv.locDanhSachSv();
                    break;
                case 3:
                //    qlsv.suaSinhVien();
                    break;
                case 4:
                    qlsv.in();
                    break;
                case 5:
                //    qlsv.inSinhVien();
                    break;
                case 6:
                //    qlsv.xoa();
                    break;
                case 7:
                    break;
            }
        }
    }
}
