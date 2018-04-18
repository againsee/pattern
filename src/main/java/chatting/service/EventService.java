package chatting.service;

import chatting.model.event.Event;
import chatting.model.event.IEventHanler;

public class EventService
{
    private final IEventHanler handler;

    public EventService(IEventHanler handler)
    {
        this.handler = handler;
    }

    public void dispatch(Event event)
    {
        handler.handle(event);
    }
}
