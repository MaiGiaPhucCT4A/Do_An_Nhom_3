/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class QuanLySinhVien {

    List<SinhVien> listsv = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    //menu chính
    public void menu() {
        System.out.println("-----------------QUẢN LÝ SINH VIÊN------------------------");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Lọc");
        System.out.println("3. Sửa");
        System.out.println("4. In danh sách");
        System.out.println("5. Tìm kiếm 1 sinh viên theo mã sinh viên");
        System.out.println("6. Xóa");
        System.out.println("7. Thoát");
        System.out.println("----------------------------------------------------------");
    }
    //menu lọc

    public void menuLoc() {
        System.out.println("  2.1. Lọc theo họ ");
        System.out.println("  2.2. Lọc theo tên ");
        System.out.println("  2.3. Lọc theo lớp học phần");
        System.out.println("  2.4. Lọc theo lớp niên chế");
        System.out.println("  2.5. Lọc theo điểm tích lũy");
        System.out.println("  2.6. Lọc top sinh viên học lại");
        System.out.println("  2.7. Lọc theo quê quán");
        System.out.println("----------------------------------------------");
    }
    //menu sửa

    public void menuSua() {
        System.out.println("  3.1. Sửa họ tên");
        System.out.println("  3.2. Sửa lớp niên chế");
        System.out.println("  3.3. Sửa ngày tháng năm sinh");
        System.out.println("  3.4. Sửa quê quán");
        System.out.println("  3.5. Sửa điểm môn học");
        System.out.println("  3.6. Thoát");
        System.out.println("-----------------------------------");
    }
//menu in

    public void menuIn() {
        System.out.println("  4.1. In danh sách thông tin sinh viên");
        System.out.println("  4.2. in danh sách điểm sinh viên");
        System.out.println("-----------------------------------");
    }
//menu in danh sách sinh viên

    public void menuInDSVS() {
        System.out.println("   4.1.1. Theo alphabet< Họ sinh viên>");
        System.out.println("   4.1.2. Theo alphabet< Tên sinh viên>");
        System.out.println("   4.1.3. Theo mã sinh viên");
        System.out.println("---------------------------------------");
    }

    // menu in danh sách điểm
    public void menuInDSDiem() {
        System.out.println("   4.2.1. In danh sách điểm");
        System.out.println("   4.2.1. In danh sách điểm từ thấp đến cao");
        System.out.println("   4.2.1. in danh sách điểm từ cao đến thấp");
    }

//Thêm sinh viên
    public void themSinhVien() {
        int i, N;
        System.out.printf("Nhập số lượng sinh viên:");
        N = sc.nextInt();
        sc.nextLine();
        for (i = 1; i <= N; i++) {
            SinhVien sv = new SinhVien();
            System.out.println("=========================");
            System.out.printf("Họ và tên: ");
            String hoTen = sc.nextLine();
            sv.setHoTen(hoTen);
            System.out.printf("Mã sinh viên: ");
            String msv = sc.nextLine();
            sv.setMaSV(msv);
            System.out.printf("lớp niên chế của sinh viên: ");
            String lopNC = sc.nextLine();
            sv.setTenLopNC(lopNC);
            System.out.printf("quê quán của sinh viên: ");
            String que = sc.nextLine();
            sv.setQueQuan(que);
            System.out.println("Ngày tháng năm sinh của sinh viên : ");
            System.out.printf("Nhập ngày sinh: ");
            int d = sc.nextInt();
            System.out.printf("Nhập tháng sinh: ");
            int m = sc.nextInt();
            System.out.printf("Nhập năm sinh: ");
            int y = sc.nextInt();
            sc.nextLine();
            sv.setNgaySinh(LocalDate.of(y, m, d));
            sv.themMonHoc();
            listsv.add(sv);
        }

    }

//lọc danh sách sinh viên
    public void locDanhSachSv() {
        menuLoc();
        System.out.println("Chọn: ");
        Collections.sort(listsv, new HoComparator());
        String str;
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                System.out.printf("Nhập họ của sinh viên cần in danh sách: ");
                sc.nextLine();
                str = sc.nextLine();
                for (SinhVien item : listsv) {
                    String[] a = item.getHoTen().split(" ");
                    if (a[0].equalsIgnoreCase(str) == true) {
                        System.out.println(item.toString());
                    }
                }
                break;
            case 2:
                System.out.printf("Nhập tên của sinh viên cần in danh sách: ");
                sc.nextLine();
                str = sc.nextLine();
                for (SinhVien item : listsv) {
                    String[] a = item.getHoTen().split(" ");
                    if (a[a.length - 1].equalsIgnoreCase(str) == true) {
                        System.out.println(item.toString());
                    }
                }
                break;
            case 3:
                System.out.printf("Nhập tên lớp học phần cần lọc: ");
                sc.nextLine();
                str = sc.nextLine();
                for (SinhVien item : listsv) {
                    for (MonHoc mon : item.getDsMonHoc()) {
                        if (mon.getTenMonHoc().equals(mon) == true) {
                            System.out.println(item.toString());
                        }
                    }
                }
                break;
            case 4:
                System.out.printf("Nhập tên lớp niên chế cần lọc: ");
                sc.nextLine();
                str = sc.nextLine();
                for (SinhVien item : listsv) {
                    if (item.getTenLopNC().equals(item) == true) {
                        System.out.println(item.toString());

                    }
                }
                break;
            case 5:
                System.out.println("   2.5.1. Lọc top sinh viên sinh viên Giỏi");
                System.out.println("   2.5.2. Lọc top sinh viên sinh viên Khá");
                System.out.println("   2.5.3. Lọc top sinh viên sinh viên TB");
                System.out.println("   2.5.4. Lọc top sinh viên sinh viên cảnh báo thôi học");
                System.out.println("-------------------------------------------------------------");
                System.out.println("Chọn: ");
                int n = sc.nextInt();
                switch (n) {

                }
                Collections.sort(listsv, new DTBComparator());
                for (int i = 0; i < n; i++) {
                    System.out.println(listsv.get(i).toString());
                }
                break;
            case 7:
                System.out.printf("Nhập quê quán sinh viên cần lọc: ");
                sc.nextLine();
                str = sc.nextLine();
                for (SinhVien item : listsv) {
                    if (item.getQueQuan().equalsIgnoreCase(str) == true) {
                        System.out.println(item.toString());
                    }
                }
                break;
            case 6:
                System.out.println("Nhập môn học cần lọc sinh viên học lại: ");
                sc.nextLine();
                str = sc.nextLine();
                int count = 0;
                for (SinhVien item : listsv) {
                    for (MonHoc mon : item.getDsMonHoc()) {
                        if (mon.getTenMonHoc().equals(str) == true && mon.getDiemMH() < 4.0) {
                            System.out.println(item.toString());
                            count++;
                        }
                    }
                }
                if (count == 0) {
                    System.out.println("Không có sinh viên học lại môn " + str);
                }
                break;
        }
    }

//sửa thông tin sinh viên
    public void suaSinhVien() {
        System.out.printf("Nhập mã số sinh viên của sinh viên cần thay đổi: ");
        String msv = sc.nextLine();
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < listsv.size(); i++) {
            if (listsv.get(i).getMaSV().equals(msv) == true) {
                count++;
                tmp = i;
            }
        }
        if (count != 0) {
            boolean cont = true;
            do {
                menuSua();
                System.out.printf("Chọn: ");
                int chon = sc.nextInt();
                sc.nextLine();
                switch (chon) {
                    case 1:
                        System.out.printf("Nhập họ và tên mới sinh viên: ");
                        listsv.get(tmp).setHoTen(sc.nextLine());
                        break;
                    case 2:
                        System.out.printf("Nhập tên lớp mới của sinh viên: ");
                        listsv.get(tmp).setTenLopNC(sc.nextLine());
                        break;
                    case 3:
                        System.out.printf("Nhập ngày sinh mới của sinh viên: ");
                        int d = sc.nextInt();
                        System.out.printf("Nhập tháng sinh mới của sinh viên: ");
                        int m = sc.nextInt();
                        System.out.printf("Nhập năm sinh mới của sinh viên: ");
                        int y = sc.nextInt();
                        listsv.get(tmp).setNgaySinh(LocalDate.of(y, m, d));
                        break;
                    case 4:
                        System.out.printf("Nhập quê quán mới của sinh viên: ");
                        listsv.get(tmp).setQueQuan(sc.nextLine());
                        break;
                    case 5:
                        System.out.printf("Nhập môn học cần sửa điểm: ");
                        String mon = sc.nextLine();
                        SinhVien item = listsv.get(tmp);
                        for (MonHoc monHOc : item.getDsMonHoc()) {
                            if (monHOc.getTenMonHoc().equalsIgnoreCase(mon) == true) {
                                System.out.printf("Nhập lại điểm môn học: ");
                                double diemMh = sc.nextDouble();
                                monHOc.setDiemMH(diemMh);
                            }
                        }
                        break;
                    case 6:
                        cont = false;
                        break;

                }
            } while (cont);
        } else {
            System.out.println("Không tìm thấy sinh viên có mã số sinh viên: " + msv);
        }
    }

//in điểm sinh viên
    public void inDiem(SinhVien sv) {
        double diem = 0;
        int tin = 0;
        System.out.println("Sinh viên: " + sv.getHoTen() + " -Mã sinh viên: " + sv.getMaSV() + " {");
        for (int i = 0; i < 2; i++) {
            System.out.println("  " + sv.getDsMonHoc().get(i).toString());
            if (i == 1) {
                System.out.println(" =>Điểm trung bình các môn: " + sv.getDsMonHoc().get(i).getDiemTB());

            }
        }

        System.out.println("}\n");
    }
//in

    public void in() {
        menuIn();
        System.out.printf("Chọn: ");
        int t = sc.nextInt();
        switch (t) {
            case 1:
                menuInDSVS();
                System.out.printf("Chọn: ");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        Collections.sort(listsv, new HoComparator().thenComparing(new TenComparator()));
                        for (int i = 0; i < listsv.size(); i++) {
                            System.out.println(listsv.get(i).toString());
                        }
                        break;
                    case 2:
                        Collections.sort(listsv, new TenComparator().thenComparing(new HoComparator()));
                        for (int i = 0; i < listsv.size(); i++) {
                            System.out.println(listsv.get(i).toString());
                        }
                        break;
                    case 3:
                        Collections.sort(listsv, new MSVComparator());
                        for (int i = 0; i < listsv.size(); i++) {
                            System.out.println(listsv.get(i).toString());
                        }
                        break;
                    case 4:
                        Collections.sort(listsv, new DTBComparator().thenComparing(new HoComparator()));
                        for (int i = 0; i < listsv.size(); i++) {
                            System.out.println(listsv.get(i).toString());
                        }
                        break;
                }
                break;
            case 2:
                Collections.sort(listsv, new DTBComparator().thenComparing(new HoComparator()));
                for (SinhVien item : listsv) {
                    inDiem(item);
                }
                break;
        }
    }
//in sinh viên

    public void timKiemTheoMsv() {
        System.out.printf("Nhập mã sinh viên: ");
        String msv = sc.nextLine();
        int count = 0;
        for (int i = 0; i < listsv.size(); i++) {
            if (listsv.get(i).getMaSV().equals(msv) == true) {
                count++;
                SinhVien item = listsv.get(i);
                System.out.println("  5.1. Thông tin");
                System.out.println("  5.2. Điểm");
                System.out.println("-------------------------------");
                System.out.println("Chọn: ");
                int chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println(item.toString());
                        break;
                    case 2:
                        for (MonHoc mon : item.getDsMonHoc()) {
                            System.out.println(mon.toString());
                        }
                        break;
                }
            }
        }
        if (count != 0) {
            System.out.println("Không tìm thấy sinh viên có mã sinh viên: " + msv);
        }
    }

//xóa
    public void xoa() {
        System.out.println("  6.1. Xóa sinh viên khỏi danh sách");
        System.out.println("  6.2. Xóa môn học của sinh viên");
        System.out.println("--------------------------------------");
        System.out.printf("Chọn: ");
        int chon = sc.nextInt();
        sc.nextLine();
        switch (chon) {
            case 1:
                System.out.printf("Nhập mã sinh viên của sinh viên cần xóa: ");
                String msv = sc.nextLine();
                for (int i = 0; i < listsv.size(); i++) {
                    if (listsv.get(i).getMaSV().equals(msv) == true) {
                        listsv.remove(i);
                    }
                }
                break;
            case 2:
                System.out.printf("Nhập mã sinh viên của sinh viên cần xóa môn học: ");
                String masv = sc.nextLine();
                int count = 0;
                for (int i = 0; i < listsv.size(); i++) {
                    if (listsv.get(i).getMaSV().equals(masv) == true) {
                        System.out.printf("Nhập tên môn học cần xóa: ");
                        String mon = sc.nextLine();
                        for (int j = 0; j < listsv.get(i).getDsMonHoc().size(); j++) {
                            if (listsv.get(i).getDsMonHoc().get(j).getTenMonHoc().equals(mon) == true) {
                                listsv.get(i).getDsMonHoc().remove(j);
                            }
                        }
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("Không tìm thấy sinh viên trong danh sách");
                }
                break;
        }
    }
}
