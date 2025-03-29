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
public class cau4 {
    private String s ;
    private PrintWriter w;
    public cau4(PrintWriter w ,String a) {
        this.w = w;
        this.s = a;
    }
    public void inKetQua(){
        w.println("Chuỗi đảo của "+s +" là: "+ chuoidao());
    }
    private String chuoidao(){
        int i = s.length()-1;
        String s1 = "";
        for(; i>=0; i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
}
