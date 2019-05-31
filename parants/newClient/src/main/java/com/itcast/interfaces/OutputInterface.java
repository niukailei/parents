package com.itcast.interfaces;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;


public interface OutputInterface {


     public  final String output1="tiantian";

     public  final String output2="huihui";

      String inputs="output";

     @Output(output1)
     MessageChannel put1();


     @Output(output2)
     MessageChannel  put2();

     @Input(inputs)
     SubscribableChannel get();
}
