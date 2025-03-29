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
public class cau2 {

    private int a;
    private PrintWriter w;

    public cau2(PrintWriter w,  int a) {
        this.a = a;
        this.w = w;
    }

    public void inKetQua() {

        int s = 0, t = 1, m = this.a;
        while (this.a != 0) {
            s += this.a % 10;
            t *= this.a % 10;
            this.a /= 10;
        }
        w.println("Tổng các chữ số của " + m + " là: " + s);
        w.println("Tích các chữ số của " + m + " là: " + t+"\n");

    }
}
