/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_an.com;

/**
 *
 * @author ACER
 */
public class Diem {

    private double diemMH;
    private double DiemTB;

    public Diem() {
    }

    public Diem(double diemMH, double DiemTB) {
        this.diemMH = diemMH;
        this.DiemTB = DiemTB;
    }

    public Diem(double diemMH) {
        this.diemMH = diemMH;
    }

    public double getDiemMH() {
        return diemMH;
    }

    public void setDiemMH(double diemMH) {
        this.diemMH = diemMH;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double DiemTB) {
        this.DiemTB = DiemTB;
    }

}
