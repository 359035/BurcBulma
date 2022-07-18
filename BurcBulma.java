/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burcbulma;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class BurcBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int month,day;
        String burc="";
        boolean isError=false;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Dogdugunuz gun:");
        day=input.nextInt();
        
        System.out.print("Dogdugunuz ay:");
        month=input.nextInt();
        
        if(month==1&&day>=1&&day<=31){
            if(day<22){
                burc="Oglak Burcu";
            }else{
                burc="Kova Burcu";
            }
        }else if(month==2&&day>=1&&day<=29){
            if(day<20){
                burc="Kova Burcu";
            }else{
                burc="Balik Burcu";
            }
        }else if(month==3&&day>=1&&day<=31){
            if(day<21){
                burc="Balik Burcu";
            }else{
                burc="Koc Burcu";
            }
        }else if(month==4&&day>=1&&day<=30){
            if(day<21){
                burc="Koc Burcu";
            }else{
                burc="Boga Burcu";
            }
        }else if(month==5&&day>=1&&day<=31){
            if(day<22){
                burc="Boga Burcu";
            }else{
                burc="İkizler Burcu";
            }
        }else if(month==6&&day>=1&&day<=30){
            if(day<23){
                burc="İkizler Burcu";
            }else{
                burc="Yengec Burcu";
            }
        }else if(month==7&&day>=1&&day<=31){
            if(day<23){
                burc="Yengec Burcu";
            }else{
                burc="Aslan Burcu";
            }
        }else if(month==8&&day>=1&&day<=31){
            if(day<23){
                burc="Aslan Burcu";
            }else{
                burc="Basak Burcu";
            }
        }else if(month==9&&day>=1&&day<=30){
            if(day<23){
                burc="Basak Burcu";
            }else{
                burc="Terazi Burcu";
            }
        }else if(month==10&&day>=1&&day<=31){
            if(day<23){
                burc="Terazi Burcu";
            }else{
                burc="Akrep Burcu";
            }
        }else if(month==11&&day>=1&&day<=30){
            if(day<22){
                burc="Akrep Burcu";
            }else{
                burc="Yay Burcu";
            }
        }else if(month==12&&day>=1&&day<=31){
            if(day<22){
                burc="Yay Burcu";
            }else{
                burc="Oglak Burcu";
            }
        }else{
            isError=true;
        }
        
        if(isError){
            System.out.println("Hatali Giris Yaptiniz");
        }else{
            System.out.println("Burcunuz : "+burc);
                 
        }
        
}
}    
