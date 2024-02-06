package com.ironmanjay.grainmall.order.dao;

import com.ironmanjay.grainmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 12:45:43
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
