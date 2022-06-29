package com.scut.demo.controller;

import com.scut.demo.service.TeacherManageService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachermanage")
public class TeacherManageController {

    @Autowired
    private TeacherManageService teacherManageService;

    @GetMapping("/getStudentCuoTi/{id}")
    public Result getStudentCuoTi(@PathVariable("id") int Stu_id){
        return Result.ok().put("CuoTiList",this.teacherManageService.getCuoTiByStuID(Stu_id));
    }

}
