package com.ironmanjay.grainmall.coupon.dao;

import com.ironmanjay.grainmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 11:31:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
