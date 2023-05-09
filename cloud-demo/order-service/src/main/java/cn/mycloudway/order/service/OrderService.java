package cn.mycloudway.order.service;

import cn.mycloudway.order.mapper.OrderMapper;
import cn.mycloudway.order.pojo.Order;
import cn.mycloudway.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);

        User user = restTemplate.getForObject("http://userservice/user/" + order.getUserId(), User.class);
        order.setUser(user);
        // 4.返回
        return order;
    }
}
