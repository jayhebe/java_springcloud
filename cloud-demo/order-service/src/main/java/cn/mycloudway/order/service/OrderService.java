package cn.mycloudway.order.service;

import cn.mycloudway.feign.clients.UserClient;
import cn.mycloudway.feign.pojo.User;
import cn.mycloudway.order.mapper.OrderMapper;
import cn.mycloudway.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);

        User user = userClient.findById(order.getUserId());

        order.setUser(user);
        // 4.返回
        return order;
    }
}
