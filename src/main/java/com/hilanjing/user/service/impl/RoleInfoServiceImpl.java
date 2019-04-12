package com.hilanjing.user.service.impl;

import com.hilanjing.user.dao.RoleInfoMapper;
import com.hilanjing.user.model.RoleInfo;
import com.hilanjing.user.service.RoleInfoService;
import com.hilanjing.user.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/11.
 */
@Service
@Transactional
public class RoleInfoServiceImpl extends AbstractService<RoleInfo> implements RoleInfoService {
    @Resource
    private RoleInfoMapper tabRoleInfoMapper;

    @Override
    public RoleInfo queryRoleInfoById(int id) {

        RoleInfo roleInfo = tabRoleInfoMapper.queryRoleInfoById(id);



        return roleInfo;
    }
}
