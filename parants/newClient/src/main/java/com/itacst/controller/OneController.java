package com.itacst.controller;


import com.itcast.interfaces.OutputInterface;
import com.itcast.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(value={OutputInterface.class})
public class OneController {

    @Autowired
   private OutputInterface  in;

    @RequestMapping("/get")
     public void getName(){
       User user=new User("雷雷");
        Message message = MessageBuilder.withPayload(user)
                .setHeader("partitionKey", 1)
                .build();

        in.put1().send(message);
        System.out.println("请说出你的梦想");

     }

    @StreamListener(OutputInterface.inputs)
     public void Set(User payload){
         System.out.println(payload.toString());
     }
}
