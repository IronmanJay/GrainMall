package com.ironmanjay.grainmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ironmanjay.grainmall.common.utils.PageUtils;
import com.ironmanjay.grainmall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 11:32:00
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

