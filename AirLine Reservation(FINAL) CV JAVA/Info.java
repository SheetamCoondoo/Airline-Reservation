import java.time.*;
import java.util.*;
public class Info
{
    static String name;
    static int date[];
    static long phone_number;
    static void getInfo()
    {
        char ch;
        System.out.println("Enter your phone number");
        phone_number=new Scanner(System.in).nextLong();
        do
        {
            System.out.println("Enter your name.");
            name=new Scanner(System.in).nextLine();
            name=name.toUpperCase();
            System.out.println("Enter date of departure in dd/mm/yyyy format.");
            date=new int[3];
            for(int i=0;i<3;i++)
            {
                if(i==0){
                    do{
                        System.out.println("Enter the date");
                        date[i]=new Scanner(System.in).nextInt();
                    }while(date[0]<=0 || date[0]>=32);
                }
                if(i==1){
                    do{
                        System.out.println("Enter the month");
                        date[i]=new Scanner(System.in).nextInt();
                    }while(date[i]>12 || date[i]<=0 );
                }
                if(i==2)
                {
                    do{
                        System.out.println("Enter the year");
                        date[i]=new Scanner(System.in).nextInt();
                    }while(date[i]<=0);
                }
            }
            check();
            System.out.println("Do you confirm(Y/N)?");
            ch=new Scanner(System.in).next().charAt(0);
            System.out.println("\u000c");
        }while(ch=='n'||ch=='N');
    }

    static void check()
    {
        Info ob=new Info();
        int c1=1;boolean d=false;
        Calendar c=Calendar.getInstance();
        k:  if(date[1]==2){
            if(Year.isLeap(date[2])){
                if(date[0]>29 || date[0]<=0){
                    d=true;
                    break k;
                }
            }
            if(date[0]>28 || date[0]<=0)
                d=true;
        }
        do{
            if(date[1]<=c.get(Calendar.DATE) && date[2]<=c.get(Calendar.MONTH) && date[0]<=c.get(Calendar.YEAR)){
                System.out.println("PLEASE ENTER A DATE TODAY ONWARDS \n Re enter date");
                getInfo();
            }
            else c1=0;
        }while(c1==1);
        do{
            if((date[2]==c.get(Calendar.YEAR) && date[1]>c.get(Calendar.MONTH)+11)|| d){
                System.out.println("PLEASE ENTER A DATE BEFORE 11 MONTHS \n Re enter details or if month is February then put releavent date");
                getInfo();  
            }
            else if(date[2]==c.get(Calendar.YEAR)+1 && date[1]>c.get(Calendar.MONTH)){
                System.out.println("PLEASE ENTER A DATE BEFORE 11 MONTHS \n Re enter date");
                getInfo();
            }
            else c1=1;
        }while(c1==0);
    }
}
