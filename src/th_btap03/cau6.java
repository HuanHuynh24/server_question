/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th_btap03;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class cau6 {

    private String s;
    private PrintWriter w;

    public cau6(String a, PrintWriter w) {
        this.s = a;
        this.w = w;
    }

    public void inKetQua() {
        w.println("Liệt kê chuỗi: " + s);
        String[] words = s.split(" ");
        for (String word : words) {
            w.println(word);
        }
        w.println("Tần số xuất hiện của các từ trong chuỗi:");
        Map<String, Integer> list = countCharacter();
        for (Map.Entry<String, Integer> item : list.entrySet()) {
            w.println(item.getKey() + " : " + item.getValue());

        }
    }

    private Map<String, Integer> countCharacter() {
        Map<String, Integer> list = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String c = s.charAt(i) + "";
            if (list.containsKey(c)) {
                list.put(c, list.get(c) + 1);
            } else  list.put(c, 1);
        }
        return list;
    }

}
