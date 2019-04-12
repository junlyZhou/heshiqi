package com.hilanjing.user.service.impl;

import com.hilanjing.user.dao.ActionResourceMapper;
import com.hilanjing.user.model.ActionResource;
import com.hilanjing.user.service.ActionResourceService;
import com.hilanjing.user.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/04/11.
 */
@Service
@Transactional
public class ActionResourceServiceImpl extends AbstractService<ActionResource> implements ActionResourceService {
    @Resource
    private ActionResourceMapper tabResourceMapper;

}
