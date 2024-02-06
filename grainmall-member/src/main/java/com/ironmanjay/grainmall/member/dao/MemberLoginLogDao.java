package com.ironmanjay.grainmall.member.dao;

import com.ironmanjay.grainmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 12:32:34
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
