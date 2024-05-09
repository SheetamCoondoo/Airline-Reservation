import java.util.*;
public class Phohuangngairlines
{
    static char ch;
    static void go()
    {
        String s="";
        System.out.println("                                     WELCOME TO Phouangng airlines.in");
        System.out.println("                                         Aap ki seva me har samay ");
        System.out.println("==================================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("If you want to reserve a flight through our airlines then signup with us and continue.");
        System.out.println("Are you an old customer(Y/N)");
        ch=new Scanner(System.in).next().charAt(0);
        String a="";
        System.out.println("Enter your Email ID");
        String z=new Scanner(System.in).nextLine();
        System.out.println("Enter your password.");
        s=new Scanner(System.in).next();

        do
        {
            System.out.println("What flight type would you like to avail?\n< ONE WAY\n< ROUND TRIP");
            a=new Scanner(System.in).nextLine();
            a=a.toLowerCase();
            if(!(a.equals("one way"))&&!(a.equals("round trip")))
                System.out.println("FLIGHT TYPE UNAVAILABLE.");
        }while(!(a.equals("one way"))&&!(a.equals("round trip")));
        if(a.equals("one way"))
        {
            System.out.println("\u000c");
            new OneWay().manipulate1();
        }
        else
        {
            System.out.println("\u000c");
            new RoundTrip().manipulate();
        }
    }
}