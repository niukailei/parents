package itcast.Interface;


import itcast.controller.User;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

@EnableBinding(value = {InputInterface.class})
public class Streams {

    @StreamListener(InputInterface.INPUT1)
    public void receiveMessageFromChannel1(@Payload Message<String> payload, @Header(AmqpHeaders.CONSUMER_QUEUE) String partition){
        System.out.println("这是Client");
        System.out.println("接受到消息了");
    }

    @StreamListener(InputInterface.INPUT2)
    public void receiveMessageFromChannel2(User payload, @Header(AmqpHeaders.CONSUMER_QUEUE) String partition){
        System.out.println("这是FeignClient");
        System.out.println(payload.toString());
    }
}
