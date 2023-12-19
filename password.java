import java.util.Scanner;
public class password
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String pssd = "robolox";
        int i;
        String warn = "you have reached the limit \nplease try gain after 30 minutes";
        System.out.println("Enter the password:");
        String a = s.next();
        if((a.compareTo(pssd))==0)
        {
            System.out.println("Welcome Tushar ");
        } 
        else
        {
            System.out.println("you are not Tushar,please call Tushar");
            for(i=1;i<=10;i++)
            {
                System.out.printf("Enter the password(trial(%d):",i);
                String str = s.next();
                if((str.compareTo(pssd))==0)
                {
                    System.out.println("Welcome Tushar ");
                    break;
                } else if(i==10)
                {
                    System.out.println(warn);
                } else
                {
                    System.out.println("you are not Tushar");
                }
            }
        }
    }
}
