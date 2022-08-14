package com.atguigu.ggkt.vod.controller;


import com.atguigu.ggkt.model.vod.Teacher;
import com.atguigu.ggkt.vod.service.TeacherService;
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
@RestController
@RequestMapping(value="/admin/vod/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //http://localhost:8301/admin/vod/teacher/findAll
    //1查询所有讲师
    @GetMapping("/findAll")
    public List<Teacher> findAllTeacher(){
        //调用service方法

        return teacherService.list();
    }

    //2逻辑删除讲师
    @DeleteMapping("remove/{id}")
    public boolean removeById(@PathVariable String id){
        //调用service方法
        return teacherService.removeById(id);
    }
}

