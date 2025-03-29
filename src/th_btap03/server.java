/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th_btap03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import th_btap03.cau1;

/**
 *
 * @author ASUS
 */
public class server {

    public static void menu(PrintWriter w) {
        w.println("Nhập lựa chọn !!!");

        w.println("1.Nhập vào một số, kiểm tra số đó có phải số nguyên tố, chính phương, hoàn hảo, amstrong?  ");
        w.println("2.Nhập số nguyên dương m. Sau đó in ra tổng và tích các chữ số của số nguyên dương đó.   ");
        w.println("3.Nhập hai số nguyên dương a và b. Sau đó in ra ước chung lớn nhất và bội chung nhỏ nhất của hai số nguyên dương a và b đó. ");
        w.println("4. Nhập chuỗi kí tự tùy ý và in ra chuỗi đảo của chuỗi đã cho ");
        w.println("5.Nhập vào một chuỗi ký tự tùy ý và thực hiện các công việc sau:");
        w.println(" + In ra chuỗi đảo ngược của chuỗi đã cho ");
        w.println(" + Đổi chuổi đã cho sang chữ hoa ");
        w.println(" + Đổi chuỗi đã cho sang chữ thường ");
        w.println(" + Đổi chuỗi đã cho sang vừa chữ hoa vừa chữ thường (các ký tự chữ hoa thì thành chữ thường và ngược lại).");
        w.println(" + Đếm số từ có trong chuổi đã cho. ");
        w.println(" + In ra các nguyên âm có trong chuỗi đã cho");
        w.println("6.Nhập một chuỗi ký tự tuỳ ý, sau đó thực hiện công việc sau:  ");
        w.println(" + In ra mỗi từ của chuỗi trên từng dòng  ");
        w.println(" + Đưa ra bảng tần số xuất hiện của các kí hiệu trong chuỗi.");

        w.println("###");

    }

    public static void main(String arg[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket socket = serverSocket.accept();

        BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter w = new PrintWriter(socket.getOutputStream(), true);

        cau1 c1 = null;
        cau2 c2 = null;
        cau3 c3 = null;

        int tt = 0;
        String k = "";
        menu(w);

        String mess;
        while ((mess = read.readLine()) != null) {
            System.err.println("client: " + mess);
            if (tt == 0) {
                switch (mess) {
                    case "1":
                        w.println("Nhập a: ");
                        w.println("###");
                        k = mess;
                        tt = 1;
                        break;
                    case "2":
                        w.println("Nhập m: ");
                        w.println("###");
                        k = mess;
                        tt = 1;
                        break;
                    case "3":
                        c3 = new cau3(w);
                        w.println("Nhập m: ");
                        w.println("###");
                        k = mess;
                        tt = 1;
                        break;
                    case "4":
                        w.println("Nhập chuỗi: ");
                        w.println("###");
                        k = mess;
                        tt = 1;
                        break;
                    case "5":
                        w.println("Nhập chuỗi: ");
                        w.println("###");
                        k = mess;
                        tt = 1;
                        break;
                    case "6":
                        w.println("Nhập chuỗi: ");
                        w.println("###");
                        k = mess;
                        tt = 1;
                        break;
                }
            } else if (tt == 1) {
                switch (k) {
                    case "1":
                        c1 = new cau1(Integer.parseInt(mess), w);
                        tt = 2;
                        c1.inKetQua();
                        w.println("!!!");
                        break;
                    case "2":
                        c2 = new cau2(w, Integer.parseInt(mess));
                        tt = 2;
                        c2.inKetQua();
                        w.println("!!!");
                        break;
                    case "3":
                        if (c3.getA() == null) {
                            c3.setA(Integer.parseInt(mess));
                            w.println("Nhập n: ");
                            w.println("###");
                        } else {
                            c3.setB(Integer.parseInt(mess));
                            c3.inKetQua();
                            w.println("!!!");
                            tt = 0;
                            menu(w);
                            c3 = null;
                        }
                        break;
                    case "4":
                        cau4 c4 = new cau4(w, mess);
                        tt = 2;
                        c4.inKetQua();
                        w.println("!!!");
                        break;
                    case "5":
                        cau5 c5 = new cau5(w, mess);
                        tt = 2;
                        c5.inKetQua();
                        w.println("!!!");
                        break;
                    case "6":
                        cau6 c6 = new cau6(mess, w);
                        tt = 2;
                        c6.inKetQua();
                        w.println("!!!");
                        break;
                }
            } else {
                tt = 0;
                menu(w);
            }
        }

        socket.close();
    }

}
