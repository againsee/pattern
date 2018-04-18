package chatting.model.chatroom;

import java.util.UUID;

public class ChatRoom
{
    private String id = UUID.randomUUID().toString();

    public String getId()
    {
        return id;
    }
}
