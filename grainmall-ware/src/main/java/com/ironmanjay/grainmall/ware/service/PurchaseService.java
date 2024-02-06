package com.ironmanjay.grainmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ironmanjay.grainmall.common.utils.PageUtils;
import com.ironmanjay.grainmall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author IronmanJay
 * @email 1975686676@qq.com
 * @date 2024-02-06 12:49:32
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

