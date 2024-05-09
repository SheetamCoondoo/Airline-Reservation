import java.time.*;
import java.util.*;
public class Infor
{
    static int date[];
    static void getInfo1()
    {
        char ch;
        boolean e=false;
        Info ob=new Info();
        Calendar c=Calendar.getInstance(); 
        do
        {
            System.out.println("Enter date of departure from your destination in dd/mm/yyyy format.");
            date=new int[3];
            for(int i=0;i<3;i++){
                if(i==0){
                    do{
                        System.out.println("Enter the date");
                        date[i]=new Scanner(System.in).nextInt();
                    }while(date[i]<=0 || date[i]>31);
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
                        if((c.get(Calendar.YEAR)+6<=date[2]))
                            e=true;
                    }while(date[i]<=0 || date[i]<ob.date[i] || e);
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
        int c=1;boolean d=false;
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
            if((ob.date[1]==date[1] && ob.date[2]==date[2] && ob.date[0]==date[0])|| d){
                System.out.println("Re enter date");
                getInfo1();
            }
            else c=0;
        }while(c==1);
    }
}