/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th_btap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class client {

   public static void main(String arg[]) throws IOException {
    Socket socket = new Socket("localhost", 8000);
    Scanner sc = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter w = new PrintWriter(socket.getOutputStream(), true);

    String mess;
    while ((mess = reader.readLine()) != null) {
        if (mess.equals("###")) { 
            String a = sc.nextLine();
            w.println(a);
            continue;
        }
        if(mess.equals("!!!")){
            w.println();
            continue;
        }
        System.out.println(mess); 
    }

    sc.close();
    socket.close();
}

}
