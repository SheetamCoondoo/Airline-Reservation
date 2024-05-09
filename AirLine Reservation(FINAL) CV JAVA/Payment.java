import java.util.*;
public class Payment
{
    double pay(double ch)
    {
        char c;byte doc;
        do
        { 
            System.out.println("================================================================================================");
            System.out.println("                                          PAYMENT ");
            System.out.println("================================================================================================");
            System.out.println();
            System.out.println("WOULD YOU LIKE TO PAY USING DEBIT CARD OR CREDIT CARD OR NET BANKING ? ");
            System.out.println("Press 1 for credit card.\nPress 2 for debit card.\nPress 3 for cash payment(*WHEN ISSUED AT OUR AIRLINES' TICKET BOOKING OFFICE*)");
            doc=new Scanner(System.in).nextByte();            
            if(doc==1)
            {
                System.out.println("Enter the type of your credit card.\nPress 1 for Mastercard \nPress 2 for American Express Credit cards\nPress 3 for Visa Credit cards");
                byte a=new Scanner(System.in).nextByte();
                long b;
                if(a==1)
                {
                    do{
                        System.out.println("Enter 13-digit card number.");
                        b=new Scanner(System.in).nextLong();
                        if(((int)Math.log10(b)+1)!=13)
                            System.out.println("Invalid.");
                    }while(((int)Math.log10(b)+1)!=13);
                    ch= (ch-ch*0.12);
                }
                else if(a==2)
                {
                    do{
                        System.out.println("Enter 15-digit card number.");
                        b=new Scanner(System.in).nextLong();
                        if(((int)Math.log10(b)+1)!=15)
                            System.out.println("Invalid.");
                    }while(((int)Math.log10(b)+1)!=15);
                    ch = (ch-ch*0.1);
                }
                else
                {
                    do{
                        System.out.println("Enter 13 or 16-digit card number.");
                        b=new Scanner(System.in).nextLong();
                        if(((int)Math.log10(b)+1)!=13&&((int)Math.log10(b)+1)!=16)
                            System.out.println("Invalid.");
                    }while(((int)Math.log10(b)+1)!=13&&((int)Math.log10(b)+1)!=16);
                    ch = (ch-ch*0.15);
                }
            }
            if(doc==2)
            {
                System.out.println("Enter the type of your debit card.\nPress 1 for Maestro Debit cards\nPress 2 for Visa Debit cards\nPress 3 for Solo(United Kingdom Debit Card)Debit cards");
                byte a=new Scanner(System.in).nextByte();
                long b;
                if(a==1)
                {
                    do{
                        System.out.println("Enter 12 or 19-digit card number.");
                        b=new Scanner(System.in).nextLong();
                        if(((int)Math.log10(b)+1)!=12&&((int)Math.log10(b)+1)!=19)
                            System.out.println("Invalid.");
                    }while(((int)Math.log10(b)+1)!=12&&((int)Math.log10(b)+1)!=19);
                    ch = (ch-ch*0.05);
                }
                else if(a==2)
                {
                    do{
                        System.out.println("Enter 13 or 16-digit card number.");
                        b=new Scanner(System.in).nextLong();
                        if(((int)Math.log10(b)+1)!=13&&((int)Math.log10(b)+1)!=16)
                            System.out.println("Invalid.");
                    }while(((int)Math.log10(b)+1)!=13&&((int)Math.log10(b)+1)!=16);
                    ch = (ch-ch*0.06);
                }
                else
                {
                    do{
                        System.out.println("Enter 16 or 18 or 19-digit card number.");
                        b=new Scanner(System.in).nextLong();
                        if(((int)Math.log10(b)+1)!=16&&((int)Math.log10(b)+1)!=19&&((int)Math.log10(b)+1)!=18)
                            System.out.println("Invalid.");
                    }while(((int)Math.log10(b)+1)!=16&&((int)Math.log10(b)+1)!=19&&((int)Math.log10(b)+1)!=18);
                    ch = (ch-ch*0.1);
                }
            }        
            System.out.println("Do you confirm?(Y/N)");
            c=new Scanner(System.in).next().charAt(0);
            if(c=='n'||c=='N')
                System.out.println("\u000c");
        }while(c=='n'||c=='N');
        return ch;
    }
}