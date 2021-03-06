package com.hope.admin.service.impl;


import com.hope.admin.service.CmsPrefrenceAreaService;
import com.hope.mbg.mapper.CmsPrefrenceAreaMapper;
import com.hope.mbg.model.CmsPrefrenceArea;
import com.hope.mbg.model.CmsPrefrenceAreaExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品优选Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Resource
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
