package com.hilanjing.user.service;
import com.hilanjing.user.model.RoleInfo;
import com.hilanjing.user.core.Service;


/**
 * Created by CodeGenerator on 2019/04/11.
 */
public interface RoleInfoService extends Service<RoleInfo> {
    RoleInfo queryRoleInfoById(int id);
}
