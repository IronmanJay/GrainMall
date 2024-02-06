package com.ironmanjay.grainmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ironmanjay.grainmall.common.utils.PageUtils;
import com.ironmanjay.grainmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 12:45:42
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

