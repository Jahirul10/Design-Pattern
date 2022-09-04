public class NotoficationFactory{

    public Notification getNotification (String NotificationType)
    {
        if(NotificationType == null)
        {
            return null;
        }
        if(NotificationType.equalsIgnoreCase("sms")){
            return new Smsnotify();
        
        } else if(NotificationType.equalsIgnoreCase("email")){
            return new Emailnotify();
        }
        else if (NotificationType.equalsIgnoreCase("push"))
        {
             return new Pushnotify();
        }
        return null;
}
}
