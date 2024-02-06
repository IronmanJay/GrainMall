package com.ironmanjay.grainmall.product.service.impl;

import com.ironmanjay.grainmall.product.dao.SpuInfoDescDao;
import com.ironmanjay.grainmall.product.entity.SpuInfoDescEntity;
import com.ironmanjay.grainmall.product.service.SpuInfoDescService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ironmanjay.grainmall.common.utils.PageUtils;
import com.ironmanjay.grainmall.common.utils.Query;


@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoDescEntity> page = this.page(
                new Query<SpuInfoDescEntity>().getPage(params),
                new QueryWrapper<SpuInfoDescEntity>()
        );

        return new PageUtils(page);
    }

}