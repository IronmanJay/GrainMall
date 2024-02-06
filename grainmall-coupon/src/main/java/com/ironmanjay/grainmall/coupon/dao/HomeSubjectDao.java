package com.ironmanjay.grainmall.coupon.dao;

import com.ironmanjay.grainmall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 11:32:00
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
