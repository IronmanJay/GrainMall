package com.ironmanjay.grainmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ironmanjay.grainmall.common.utils.PageUtils;
import com.ironmanjay.grainmall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-04 23:23:07
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

