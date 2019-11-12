package com.doubleDs.order.service;

import com.doubleDs.order.dao.master.dto.OrderInfo;
import com.doubleDs.order.dao.master.mapper.OrderInfoMapper;
import com.doubleDs.order.dao.slave.dto.OrderInfoHistory;
import com.doubleDs.order.dao.slave.mapper.OrderInfoHistoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MoveOrderToHis
 * @Description 转移订单到历史表
 * @Author boo
 * @Date 2019/11/7 16:27
 * @Version 1.0.0
 */
@Service
public class MoveOrderToHisService {

    private static Logger logger = LoggerFactory.getLogger(MoveOrderToHisService.class);

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private OrderInfoHistoryMapper orderInfoHistoryMapper;

    public List<OrderInfo> getOrder(){
        List<OrderInfo> orderInfos = orderInfoMapper.selectAll();
        return orderInfos;
    }

    public List<OrderInfoHistory> getOrderHis(){
        List<OrderInfoHistory> orderInfos = orderInfoHistoryMapper.selectAll();
        return orderInfos;
    }

}
