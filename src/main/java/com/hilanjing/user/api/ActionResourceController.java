package com.hilanjing.user.api;

import com.hilanjing.user.core.Result;
import com.hilanjing.user.core.ResultGenerator;
import com.hilanjing.user.model.ActionResource;
import com.hilanjing.user.service.ActionResourceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/04/11.
*/
@RestController
@RequestMapping("/action/resource")
public class ActionResourceController {
    @Resource
    private ActionResourceService actionResourceService;

    @PostMapping
    public Result add(@RequestBody ActionResource actionResource) {
        actionResourceService.save(actionResource);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ActionResource actionResource) {
        actionResourceService.update(actionResource);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ActionResource actionResource = actionResourceService.findById(id);
        return ResultGenerator.genSuccessResult(actionResource);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ActionResource> list = actionResourceService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
