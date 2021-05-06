package com.example.demo.back.controller;


import com.example.demo.back.common.PageBean;
import com.example.demo.back.common.ResponseData;
import com.example.demo.back.entity.TUaApplication;
import com.example.demo.back.service.ITUaApplicationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * 应用表 前端控制器
 * </p>
 *
 * @author wenminhua
 * @since 2021-04-27
 */
@Api(value = "应用信息")
@RestController
@RequestMapping("/app")
public class TUaApplicationController  {

    @Autowired
    ITUaApplicationService itUaApplicationService;

    @GetMapping("/appList2")
    @ApiOperation(value = "获取应用信息列表6", notes = "分页获取应用信息")
    public ResponseData getEmployLists(@RequestParam(value = "pageNo",defaultValue = "1")
                                           @ApiParam(value = "当前页码",required = true) Integer pageNo,
                                       @RequestParam(value = "size",defaultValue = "5")
                                           @ApiParam(value = "每页显示的数量",required = true) Integer size){
        PageBean<TUaApplication> a=itUaApplicationService.getApplicationLists(pageNo,size);
        return ResponseData.success(a);
    }

    @GetMapping("/appDatailById/{id}")
    @ApiOperation(value = "根据id获取应用信息2", notes = "根据id获取应用信息")
    public ResponseData getAppliDetailById(@PathVariable("id") Integer id){
        TUaApplication tUaApplication=itUaApplicationService.getAppliDetailById(id);
        return ResponseData.success(tUaApplication);
    }

    @PutMapping("/appStatusUpdateById")
    @ApiOperation(value = "更新应用状态", notes = "更新应用状态")
    public ResponseData appliStatusUpdate(@RequestBody TUaApplication tUaApplication){
        if(itUaApplicationService.appliStatusUpdate(tUaApplication)==1)
            return ResponseData.success();
        return ResponseData.fail();
    }


    @PostMapping("/addApp")
    @ApiOperation(value = "添加应用", notes = "添加应用")
    public ResponseData addApplica(@RequestBody TUaApplication tUaApplication){
        if(itUaApplicationService.addApplica(tUaApplication)==1)
            return ResponseData.success();
        return ResponseData.fail();
    }
}
