package com.ironmanjay.grainmall.order.dao;

import com.ironmanjay.grainmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 12:45:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
