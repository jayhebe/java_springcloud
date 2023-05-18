package cn.mycloudway.hotel.service.impl;

import cn.mycloudway.hotel.mapper.HotelMapper;
import cn.mycloudway.hotel.pojo.Hotel;
import cn.mycloudway.hotel.service.IHotelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelService extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {
}
