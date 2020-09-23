package com.hope.admin.service.impl;


import com.hope.admin.service.OmsCompanyAddressService;
import com.hope.mbg.mapper.OmsCompanyAddressMapper;
import com.hope.mbg.model.OmsCompanyAddress;
import com.hope.mbg.model.OmsCompanyAddressExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by macro on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Resource
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
