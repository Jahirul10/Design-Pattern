import java. util. Scanner;
public class Service{
    public static void main(String arg[])
    {
        NotoficationFactory notify = new NotoficationFactory();
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine(); 
        if(str.equalsIgnoreCase("sms"))
        {
            Notification sms = notify.getNotification(str);
            sms.status();
        }
        else if(str.equalsIgnoreCase("email"))
        {
            Notification email = notify.getNotification(str);
            email.status();
        }
        else if(str.equalsIgnoreCase("push"))
        {
            Notification push = notify.getNotification(str);
            push.status();
        }
        else System.out.println("Invaild Input");
    }
}