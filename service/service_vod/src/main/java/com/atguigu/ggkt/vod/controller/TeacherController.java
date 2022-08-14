package com.atguigu.ggkt.vod.controller;


import com.atguigu.ggkt.model.vod.Teacher;
import com.atguigu.ggkt.result.Result;
import com.atguigu.ggkt.vod.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-08-11
 */
@Api(tags = "讲师管理接口")
@RestController
@RequestMapping(value="/admin/vod/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //http://localhost:8301/admin/vod/teacher/findAll
    //1查询所有讲师
//    @ApiOperation("查询所有讲师")
//    @GetMapping("/findAll")
//    public List<Teacher> findAllTeacher(){
//        //调用service方法
//
//        return teacherService.list();
//    }

    //1查询所有讲师
    @ApiOperation("查询所有讲师")
    @GetMapping("/findAll")
    public Result findAllTeacher(){
        //调用service方法
        List<Teacher> list = teacherService.list();
        return Result.ok(list).message("查询成功");
    }



    //http://localhost:8301/swagger-ui.html
    //2逻辑删除讲师
    @ApiOperation("逻辑删除讲师")
    @DeleteMapping("remove/{id}")
    public Result removeById(@ApiParam(name = "id", value = "ID", required = true)
                              @PathVariable String id){
        //调用service方法
        boolean isSuccess = teacherService.removeById(id);
        if (isSuccess) {
            return Result.ok(null);
        } else {
            return Result.fail(null);
        }
    }
}

