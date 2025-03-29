/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th_btap03;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class cau3 {

    private Integer a, b;
    private PrintWriter w;
    public cau3(Integer a, Integer b, PrintWriter w) {
        this.w = w;
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(int a) {   
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public cau3(PrintWriter w) {
        this.w = w;
    }

    public void inKetQua() {
        w.println("UCLN = " + this.UCLN());
        w.println("BCNN = " + this.BCNN());

    }

    private int UCLN() {
        int du, m = a, n = b;
        
        while (n != 0) {
            du = m % n;
            m = n;
            n = du;
        }
        return m;
    }

    private int BCNN() {
        return Math.abs(this.a * this.b) / this.UCLN();
    }
}
