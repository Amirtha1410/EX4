/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journal;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class journalinfo {
     public  void display()
     {
          Scanner obj=new Scanner(System.in);
          System.out.println("\nThe journals are\n1.ENVIRONMENTAL RESEARCH\n2.JOURNAL OF CANCER\n3.'PLOS' ONE\n4.THE BMJ\n5.THE LANCET\n");
          System.out.println("\nSelect a Journal:");
          int choice=obj.nextInt();
          switch(choice)
          {
                case 1:
                    journal j=new journal();
                    j.journal(5026,"ENVIRONMENTAL RESEARCH");
                    System.out.println("\nJOURNAL DETAILS:\n");
                    System.out.println("NAME OF THE JOURNAL:"+j.getname());
                    System.out.println("JOURNAL ID:"+j.getid());
                    break;
                    
                case 2:
                    
                    journal j1=new journal();
                    j1.journal(3182,"JOURNAL OF CANCER");
                    System.out.println("\nJOURNAL DETAILS:\n");
                    System.out.println("NAME OF THE JOURNAL:"+j1.getname());
                    System.out.println("JOURNAL ID:"+j1.getid());
                    break;
                    
                case 3:
                    
                    journal j2=new journal();
                    j2.journal(1453,"'PLOS' ONE");
                    System.out.println("\nJOURNAL DETAILS:\n");
                    System.out.println("NAME OF THE JOURNAL:"+j2.getname());
                    System.out.println("JOURNAL ID:"+j2.getid());
                    break;
                    
                case 4:
                    
                    journal j3=new journal();
                    j3.journal(8138,"THE BMJ");
                    System.out.println("\nJOURNAL DETAILS:\n");
                    System.out.println("NAME OF THE JOURNAL:"+j3.getname());
                    System.out.println("JOURNAL ID:"+j3.getid());
                    break;
                    
                case 5:
                    
                    journal j4=new journal();
                    j4.journal(6736,"THE LANCET");
                    System.out.println("\nJOURNAL DETAILS:\n");
                    System.out.println("NAME OF THE JOURNAL:"+j4.getname());
                    System.out.println("JOURNAL ID:"+j4.getid());
                    break;  
          }
     
     }

  
}


class journal
{
    int journalid;
    String name;
  
   void journal(int i,String n)
   {
       journalid=i;
       name=n;
   }
    String getname()
    {
        return name;
    }
    int getid()
    {
        return journalid;
    }
}