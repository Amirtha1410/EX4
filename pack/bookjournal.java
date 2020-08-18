/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
import book.*;
import journal.*;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class bookjournal {
     
    public static void main(String[]args)
    {
        student obj=new student();
        obj.display();
        staff obj1=new staff();
        obj1.display();
    }
}

class student
{
    Scanner obj=new Scanner(System.in);  
    void display()
    {
     System.out.println("STUDENT'S CHOICE\n");
     System.out.println("The choices are\n1.BOOK\n2.JOURNAL\n");
     System.out.println("Select the choice");
     int choice=obj.nextInt();
     
     switch(choice)
     {
        case 1:
             bookdetails obj=new bookdetails();
             obj.display(); 
             break;
             
        case 2:
             journalinfo obj1=new journalinfo();
             obj1.display();
             break;
     }
    }
}


class staff        
{    
    Scanner obj=new Scanner(System.in);  
    void display()
    {
     System.out.println("\n\nSTAFF'S CHOICE\n");   
     System.out.println("The choices are\n1.BOOK\n2.JOURNAL\n");
     System.out.println("Select the choice");
     int choice=obj.nextInt();
     
      switch(choice)
     {
        case 1:
             bookdetails obj=new bookdetails();
             obj.display(); 
             break;
             
        case 2:
             journalinfo obj1=new journalinfo();
             obj1.display();
             break;
     }
    }
}