package com.hilanjing.user.api;

import com.hilanjing.user.core.Result;
import com.hilanjing.user.core.ResultGenerator;
import com.hilanjing.user.model.RoleInfo;
import com.hilanjing.user.service.RoleInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/04/11.
*/
@RestController
@RequestMapping("/role/info")
public class RoleInfoController {
    @Resource
    private RoleInfoService roleInfoService;

    @PostMapping
    public Result add(@RequestBody RoleInfo roleInfo) {
        roleInfoService.save(roleInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody RoleInfo roleInfo) {
        roleInfoService.update(roleInfo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        //RoleInfo roleInfo = roleInfoService.findById(id);
        RoleInfo roleInfo =roleInfoService.queryRoleInfoById(id);
        return ResultGenerator.genSuccessResult(roleInfo);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<RoleInfo> list = roleInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
