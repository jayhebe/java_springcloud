package cn.mycloudway;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class SpringAMQPProducerTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSimpleQueue() {
        String queueName = "simple.queue";
        String message = "hello, spring amqp";

        rabbitTemplate.convertAndSend(queueName, message);
    }

    @Test
    public void testSendFanoutExchagne() {
        String exchangeName = "mycloudway.fanout";
        String message = "hello, everyone";

        rabbitTemplate.convertAndSend(exchangeName, "", message);
    }

    @Test
    public void testSendObject() {
        Map<String, Object> msg = new HashMap<>();
        msg.put("name", "柳岩");
        msg.put("age", 21);

        rabbitTemplate.convertAndSend("object.queue", msg);
    }
}
