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
public class cau1 {
    private int a;
    private PrintWriter w;
    public cau1(int a, PrintWriter w) {
        this.w = w;
        this.a = a;
    }
    public void inKetQua(){
        String s = "";
        if(ktrSNT())
            s+=this.a + " là số nguyên tố!\n";
        else 
             s+=this.a + " không là số nguyên tố!\n";
        
        if(ktrSCP())
            s+=this.a + " là số chính phương \n";
        else 
            s+=this.a + " không là số chính phương \n";
        
        if(ktrSHH())
           s+=this.a + " là số hoàn hảo\n";
        else 
            s+=this.a + " không là số hoàn hảo\n";
        
        if(ktrAMS())
           s+=this.a+" là số amstrong\n";
        else 
            s+=this.a+" không là số amstrong\n";
        w.println(s);
    }
    private boolean ktrSNT(){
        if(this.a == 2 || this.a == 3)
            return true;
        if(this.a > 2 && this.a%2 != 0 && this.a%3 != 0)
            return true;
        return false;
    }
    
    private boolean ktrSCP(){
        int m = (int) Math.sqrt(this.a);
        if(Math.pow(m, 2) == this.a)
            return true;
        return false;
    }
    
    private boolean ktrSHH(){
        int s = 0;
        for(int i=2; i< this.a;i++){
            if(this.a%i==0) s+=i;
        }
        return this.a==s?true:false;
    }
    
    private boolean ktrAMS(){
        int m = this.a, tam = 0;
        while(m!=0){
            tam+=(Math.pow(m%10,3));
            m/=10;
        }
        if(tam == this.a)
            return true;
        return false;
    }
    
}
