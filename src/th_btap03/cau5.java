/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th_btap03;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class cau5 {

    private String s;
private PrintWriter w;
    public cau5(PrintWriter w, String a) {
        this.s = a;
        this.w = w;
    }

    public void inKetQua() {
        String s1 = s;
        w.println("Chuỗi đảo của " + s + " là: " + chuoidao());
        w.println("Đổi chuổi đã cho sang chữ hoa từ: " + s + " sang: " + s1.toUpperCase());
        s1 = s;
        w.println("Đổi chuổi đã cho sang chữ thường từ: " + s + " sang: " + s1.toLowerCase());
        w.println("Đổi chuỗi đã cho sang vừa chữ hoa vừa chữ thường từ: " + s + " sang: " + convertStr());
        w.println("Số ký tự có trong chuỗi " + s + " là: " + s.length());
        w.println("Các nguyên âm có trong chuỗi đã cho: " + s + " là: " );

        if(s.indexOf("e") != -1){
            w.println("e ");
        }
        if(s.indexOf("u") != -1){
            w.println("u ");
        }
        if(s.indexOf("o") != -1){
            w.println("o ");
        }
        if(s.indexOf("a") != -1){
            w.println("a ");
        }
        if(s.indexOf("i") != -1){
            w.println("i ");
        }

    }

    private String chuoidao() {
        int i = s.length() - 1;
        String s1 = "";
        for (; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        return s1;
    }

    private String convertStr() {
        String str = s, strNew = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
                strNew += (char) ((int) str.charAt(i) + 32);
            } else if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
                strNew += (char) ((int) str.charAt(i) - 32);
            } else strNew += str.charAt(i);
        }
        return strNew;
    }

    private Map<String, Integer> countCharacter() {
        Map<String, Integer> list = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String c = s.charAt(i) + "";
            if (list.containsKey(c)) {
                list.put(c, list.get(c) + 1);
            }
        }
        return list;
    }
}
