package com.hilanjing.user.dao;

import com.hilanjing.user.core.Mapper;
import com.hilanjing.user.model.RoleInfo;

public interface RoleInfoMapper extends Mapper<RoleInfo> {

    RoleInfo queryRoleInfoById(int id);

}