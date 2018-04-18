package chatting.model.event;

public class MessageHanlder implements IEventHanler
{
    public String handle(Event event)
    {
        if (event.getEvnetType().toString().equals("BLOCK"))
        {
            System.out.println("상담인입차단");
            return "";
        }
        else
        {
            String contens = event.getMessage().getMessage();
            String name = event.getUser().getName();
            System.out.println(contens);
            return "";
        }
    }
}
