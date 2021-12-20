package ch11;
import java.util.*;
class wrongpassword extends Exception
{ }

public class J1{
	
   public static void main(String args[])
   {
     Scanner scn=new Scanner(System.in);

     try {
     System.out.println("密碼輸入測試");
     System.out.print("請輸入密碼:");
     Boolean flag = true;
     while(flag) {
     int num;
     int num1;
     num=scn.nextInt();
     num1=scn.nextInt();
     if(num==num1) { 
    	 System.out.println("密碼正確");
    	 flag = false;
     }
     else {
    	 System.out.println("與第一次輸入的不同!");
    	 
    	 throw new wrongpassword();
     }
     			}
   }
     catch(wrongpassword e){
    	 
     }
     finally{
         System.out.println("輸入三次錯誤!程式停止!");
         
 }
   
}
}

