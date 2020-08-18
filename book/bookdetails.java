/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class bookdetails {
    
    public void display()
    {
       Scanner obj=new Scanner(System.in);
       System.out.println("\nThe books are\n1.WINGS OF FIRE\n2.THE FAULT IN OUR STARS\n3.THE NEVERENDING STORY\n4.GREAT EXPECTATION\n5.LORD OF RINGS");
       System.out.println("\nSelect a Book:");
       int choice=obj.nextInt();
        switch(choice)
       {
            case 1:
                  book b=new book();
                  b.book(8173,4132,"WINGS OF FIRE","A.P.J.ABDUL KALAM",1999);
                  System.out.println("\nBOOK DETAILS:\n");
                  System.out.println("NAME OF THE BOOK:"+b.getname());
                  System.out.println("AUTHOR:"+b.getauthor());
                  System.out.println("BOOK ID:"+b.getid());
                  System.out.println("ACCESSING NUMBER:"+b.getno());
                  System.out.println("PUBLICATION:"+b.getpubli());
                  break;
                  
            case 2:
                
                  book b1=new book();
                  b1.book(8817,5728,"THE FAULT IN OUR STARS","JOHN GREEN",2012);
                  System.out.println("\nBOOK DETAILS:\n");
                  System.out.println("NAME OF THE BOOK:"+b1.getname());
                  System.out.println("AUTHOR:"+b1.getauthor());
                  System.out.println("BOOK ID:"+b1.getid());
                  System.out.println("ACCESSING NUMBER:"+b1.getno());
                  System.out.println("PUBLICATION:"+b1.getpubli());
                  break;
                  
            case 3:
                
                  book b2=new book();
                  b2.book(3522,7460,"THE NEVER ENDING STORY","MICHAEL ENDE",1979);
                  System.out.println("\nBOOK DETAILS:\n");
                  System.out.println("NAME OF THE BOOK:"+b2.getname());
                  System.out.println("AUTHOR:"+b2.getauthor());
                  System.out.println("BOOK ID:"+b2.getid());
                  System.out.println("ACCESSING NUMBER:"+b2.getno());
                  System.out.println("PUBLICATION:"+b2.getpubli());
                  break;
                  
            case 4:
                
                  book b3=new book();
                  b3.book(1522,1220,"GREAT EXPECTATION","CHARLES DICKENS",1861);
                  System.out.println("\nBOOK DETAILS:\n");
                  System.out.println("NAME OF THE BOOK:"+b3.getname());
                  System.out.println("AUTHOR:"+b3.getauthor());
                  System.out.println("BOOK ID:"+b3.getid());
                  System.out.println("ACCESSING NUMBER:"+b3.getno());
                  System.out.println("PUBLICATION:"+b3.getpubli());
                  break;
                  
            case 5:
                
                  book b4=new book();
                  b4.book(5766,9092,"LORD OF RINGS","J.R.R.TOLKIEN",1954);
                  System.out.println("\nBOOK DETAILS:\n");
                  System.out.println("NAME OF THE BOOK:"+b4.getname());
                  System.out.println("AUTHOR:"+b4.getauthor());
                  System.out.println("BOOK ID:"+b4.getid());
                  System.out.println("ACCESSING NUMBER:"+b4.getno());
                  System.out.println("PUBLICATION:"+b4.getpubli());
                  break;
        }
        
     
    }
}

class book
{
    int bookid;
    int accessno;
    String name;
    String author;
    int publication;
    
    void book(int i,int n,String na,String a,int p)
    {
        bookid=i;
        accessno=n;
        name=na;
        author=a;
        publication=p;
    }
     String getname()
    {
        return name;
    }
    int getid()
    {
        return bookid;
    }
     int getno()
    {
        return accessno;
    }
     String getauthor()
    {
        return author;
    }
      int getpubli()
    {
        return publication;
    }
}

