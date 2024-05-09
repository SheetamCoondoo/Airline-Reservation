import java.util.*;
public class Receipt
{
    void gt(String v,double c)
    {
        Info ob=new Info();
        System.out.println("                RECEIPT");
        System.out.println("               __________");
        System.out.println();
        System.out.print("NAME");
        for(int i=1;i<=ob.name.length();i++)
            System.out.print(" ");
        System.out.print("      FLIGHT              FLIGHT TYPE");
        for(int i=1;i<=v.length()+9;i++)
            System.out.print(" ");
        System.out.println("           AMOUNT");
        System.out.println();
        System.out.print(ob.name+"    Phouangng airlines            "+v);
        for(int i=1;i<=((11-v.length())+v.length()+9);i++)
            System.out.print(" ");
        System.out.println("               Rs"+c+"0  ");
        Calendar c1=Calendar.getInstance();
        if(c1.get(Calendar.HOUR)==0)
            System.out.println("                                              "+(c1.get(Calendar.HOUR)+12)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
        else
            System.out.println("                                              "+c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
        System.out.println("                                                  "+c1.get(Calendar.DATE)+"/"+(c1.get(Calendar.MONTH)+1)+"/"+c1.get(Calendar.YEAR));
        System.out.println();
        System.out.println();
    }
}
