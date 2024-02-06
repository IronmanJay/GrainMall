package com.ironmanjay.grainmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ironmanjay.grainmall.common.utils.PageUtils;
import com.ironmanjay.grainmall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-04 23:23:08
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

