package com.ironmanjay.grainmall.order.dao;

import com.ironmanjay.grainmall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 12:45:43
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
