package chatting.model.user;

import java.util.ArrayList;
import java.util.List;

import chatting.model.chatroom.ChatRoom;

public class User
{
    private List<ChatRoom> chatRoomList = new ArrayList<ChatRoom>();
    private String name;

    public User(String name)
    {
        this.name = name;
    }

    public void addChatRoom(ChatRoom chatRoom)
    {
        chatRoomList.add(chatRoom);
    }

    public ChatRoom getChatRoom(String id)
    {
        if (id == null)
        {
            return null;
        }

        ChatRoom chatRoom = null;

        for (ChatRoom room : chatRoomList)
        {
            if (id.equals(room.getId()))
            {
                return room;
            }
        }

        return chatRoom;
    }

    public String getName()
    {
        return name;
    }
}