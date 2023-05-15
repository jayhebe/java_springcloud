package cn.mycloudway.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SpringAMQPRabbitListener {
    @RabbitListener(queues = "simple.queue")
    public void listenSimpleQueue(String message) {
        System.out.println("The message is: " + message);
    }
}
