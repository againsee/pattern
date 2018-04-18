package chatting.model.event;

import chatting.model.message.Imessage;
import chatting.model.user.User;

public class Event
{
    private EventType evnetType;
    private User user;
    private Imessage message;

    public Event(EventType evnetType, User user, Imessage message)
    {
        this.evnetType = evnetType;
        this.user = user;
        this.message = message;
    }

    public EventType getEvnetType()
    {
        return evnetType;
    }

    public User getUser()
    {
        return user;
    }

    public Imessage getMessage()
    {
        return message;
    }
}