package com.doubleDs.order.dao.master.mapper;

import com.doubleDs.order.dao.master.dto.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Nov 07 16:09:01 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Nov 07 16:09:01 CST 2019
     */
    int insert(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Nov 07 16:09:01 CST 2019
     */
    OrderInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Nov 07 16:09:01 CST 2019
     */
    List<OrderInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Nov 07 16:09:01 CST 2019
     */
    int updateByPrimaryKey(OrderInfo record);

    /**
     * 查询一周的待转移订单
     * @return
     */
    List<String> getWeekMoveOrderNoList();


    /**
     * 查询一个月的待转移订单
     * @return
     */
    List<String> getMonthMoveOrderNoList();

    /**
     * 根据orderNo删除订单列表
     * @param moveOrderNoList
     * @return
     */
    int deleteByOrderNo(@Param("moveOrderNoList") List<String> moveOrderNoList);
}