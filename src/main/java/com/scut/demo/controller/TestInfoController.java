package com.scut.demo.controller;

import com.scut.demo.entity.TestInfo;
import com.scut.demo.mapper.TestInfoMapper;
import com.scut.demo.service.TestInfoService;
import com.scut.demo.utils.Result;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestInfoController {

    @Autowired
    private TestInfoService testInfoService;

    //获取问题文本
    @GetMapping("/getQuestion/{id}")
    public Result getQuestionTextById(@PathVariable int id){
       TestInfo testInfo = testInfoService.getQuestionTextById(id);
       return Result.ok().put("testInfo",testInfo);
    }

}
