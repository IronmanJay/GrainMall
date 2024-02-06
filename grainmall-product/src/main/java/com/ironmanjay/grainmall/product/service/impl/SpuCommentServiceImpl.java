package com.ironmanjay.grainmall.product.service.impl;

import com.ironmanjay.grainmall.product.entity.SpuCommentEntity;
import com.ironmanjay.grainmall.product.service.SpuCommentService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ironmanjay.grainmall.common.utils.PageUtils;
import com.ironmanjay.grainmall.common.utils.Query;

import com.ironmanjay.grainmall.product.dao.SpuCommentDao;


@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity> implements SpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuCommentEntity> page = this.page(
                new Query<SpuCommentEntity>().getPage(params),
                new QueryWrapper<SpuCommentEntity>()
        );

        return new PageUtils(page);
    }

}