package chatting.model.message;

public class TextMessage implements Imessage
{
    private MessageType messageType = MessageType.TEXT;
    private String content;

    public TextMessage(String content)
    {
        this.content = content;
    }

    public String getMessage()
    {
        return content;
    }
}
