package com.doubleDs.order.ctrl;

import com.doubleDs.order.dao.master.dto.OrderInfo;
import com.doubleDs.order.dao.slave.dto.OrderInfoHistory;
import com.doubleDs.order.service.MoveOrderToHisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName MoveOrderToHisCtroller
 * @Description 转移订单到历史表
 * @Author boo
 * @Date 2019/11/8 15:48
 * @Version 1.0.0
 */
@RestController
public class OrderCtroller {
    @Autowired
    private MoveOrderToHisService moveOrderToHisService;

    @GetMapping("/getOrder")
    public List<OrderInfo> moveOrderToHis(){
        return moveOrderToHisService.getOrder();
    }

    @GetMapping("/getOrderHis")
    public List<OrderInfoHistory> getOrderHis(){
        return moveOrderToHisService.getOrderHis();
    }
}
