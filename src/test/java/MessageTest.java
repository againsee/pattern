import chatting.model.chatroom.ChatRoom;
import chatting.model.event.Event;
import chatting.model.event.EventType;
import chatting.model.event.MessageHanlder;
import chatting.model.message.TextMessage;
import chatting.model.user.Agent;
import chatting.model.user.Customer;
import chatting.service.EventService;
import org.junit.Test;

public class MessageTest
{
    @Test
    public void test()
    {
        MessageHanlder hanlder = new MessageHanlder();
        EventService eventService = new EventService(hanlder);

        ChatRoom chatRoom = new ChatRoom();

        Customer customer = new Customer("khlee");
        Agent agent = new Agent("agent1");

        customer.addChatRoom(chatRoom);
        agent.addChatRoom(chatRoom);

        System.out.println(chatRoom.getId());

        TextMessage message = new TextMessage("hi");
        Event event = new Event(EventType.Message, customer, message);
        eventService.dispatch(event);

        event = new Event(EventType.Message, agent, message);
        eventService.dispatch(event);


        event = new Event(EventType.BLOCK, null, null);
        eventService.dispatch(event);
    }
}