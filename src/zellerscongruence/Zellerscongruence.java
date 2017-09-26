/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zellerscongruence;
import java.util.*;
import java.io.*;

/**
 *
 * @author Neerav
 */
public class Zellerscongruence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  System.out.println(" WELCOME TO THE ZELLER'S CONGURENCE ");
  System.out.println("   ");
  int ch;
  Scanner input=new Scanner(System.in);
    //prompting the user to give the input 
   do
   {
    System.out.println(" 1. January     2. February");
    System.out.println(" 3. March       4. April ");
    System.out.println(" 5. May         6. June");
    System.out.println(" 7. July        8. August   ");
    System.out.println(" 9. September   10. October  ");
    System.out.println(" 11. November   12. December  ");
    System.out.println("");
    
    
    System.out.println(" Enter the year in 4 digits (eg:2008) ");
    int year=input.nextInt();
    int year1=year;
    int flag=0;
    
    // Checking for the leap year concept
    if(year1%100==0)
    {
       if(year1%400==0)
           flag=1;
       else
           flag=0;
    }
    
    else
    {
        int temp=year1%100;
        if(temp%4==0)
            flag=1;
        else
            flag=0;
    }
    
    
    
    int count=0;
    //int year1=10;
    
    while(year1>0)
    {
        year1=year1/10;
        count++;
    }    
    
    if(count==4)
    {
    System.out.println(" Enter the month  (should be:1-12) : ");
    int month=input.nextInt();
    
    int month1=month;
    count=0;
    
    while(month1>0)
    {
        month1=month1/10;
        count++;
    }    
    
    if(count==1 || count==2 && month<=12)
    {
    
       if(month==2)   
       {
           if(flag==1)
           {
               System.out.println(" You can enter the number of days (1-29) ");
              System.out.println(" as "+year+" is a leap year ");
           }    
           else
           {
              System.out.println(" You can enter the number of days (1-28) ");
              System.out.println(" as "+year+" is not a leap year ");
           }      
      }   
       
       else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
          System.out.println(" You can enter number of days till 31 ");
       
       else if(month==4 || month==6 || month==9 || month==11)
          System.out.println(" You can enter days upto 30 days ");
        
        
    System.out.println(" Enter the date of the month : ");
    int day=input.nextInt();
    
     
    
    if(flag==1 && month==2 && day>29)
      System.out.println(" You cannot enter the number of days greater than 29 ");
                 
    
    
    else if(flag==0 && month==2 && day>28)
        System.out.println(" You cannot enter the number of days greater than 28 ");        
   
    
    
    else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && day>31)
          System.out.println(" You cannot enter more than 31 days ");
    
    
    else if((month==4 || month==6 || month==9 || month==11) && day>30)
          System.out.println(" You cannot  enter  more than 30 days ");
        
 
    
    else
    {
    int day1=day;
    count=0;
    
      while(day1>0)
    {
        day1=day1/10;
        count++;
    }  
    
      
    if(count==1 || count==2 && day<=31)
      {
    
    // checking the month to be January or February 
    
    if(month==1 || month==2)
    {
        
        month=month+12;
        year--;
        
    }
    
    int y=year;
    //int k=year%7;            //The year of the century
    //int j=(int)(year/100.0);    //The century 
    
    int q=day;
    int m=month;
    int h=(q+(int)((26*(m+1))/10.0)+y+(int)(y/4.0)+6*(int)(y/100.0)+(int)(y/400.0))%7;
    String result="DAY OF THE WEEK IS : ";
    
    switch(h)
    {
        case 0:System.out.println(result+" Saturday ");
               break;
        case 1:System.out.println(result+" Sunday ");
               break;
        case 2:System.out.println(result+" Monday ");
               break;
        case 3:System.out.println(result+" Tuesday ");
               break;
        case 4:System.out.println(result+" Wednesday ");
               break;
        case 5:System.out.println(result+" Thursday ");
               break;
        default:System.out.println(result+" Friday ");
               break;
     
    }
    
      }
      
      
      
    else 
    {
       System.out.println(" Sorry invalid input  ");
        System.out.println(" The day should be entered exactly   ");
       System.out.println(" The day input is invalid ");
   
    }
    }
   
    
    }
    
    else 
    {
       System.out.println(" Sorry invalid input  ");
        System.out.println(" The month should be entered exactly   ");
        System.out.println(" The month input is invalid ");
  
    }
    
    }
    
    else
    {
        System.out.println(" Sorry invalid input  ");
        System.out.println(" The year should be entered exactly ");
        System.out.println(" The year input is invalid ");
  
        
    }            
        
  System.out.println("");
  System.out.println(" WANNA CONTINUE ( YES OR NO )");
  System.out.println(" Press 1 for continue and 0 for exit ");
  ch=input.nextInt();
  if(ch==0)
  {
     System.out.println(" Thanks for using ZELLERS CONGRUENCE ");
     System.out.println(" Hope you liked our code ");
     System.out.println(" That's all ........... ");
     System.out.println(" Thanks a lot for your patience .......");
     System.out.println("");
     System.out.println(" ");
  
     System.out.println("      ZELLERS CONGRUENCE          Presrented by: ");
     System.out.println("                                  AMOGH MISHRA  : 1PI13IS016");
     System.out.println("                                  JATEEN MITTAL : 1PI13IS044");
     System.out.println("                                  NEERAV JAIN   : 1PI13IS065 ");
  }
   }while(ch!=0);
 
   } 
}    

