package com.scut.demo.controller;

import com.scut.demo.entity.TestInfo;
import com.scut.demo.service.TestInfoService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestInfoController {

    @Autowired
    private TestInfoService testInfoService;

    //获取问题文本
    @GetMapping("/getQuestion/{id}")
    public Result getQuestionTextById(@PathVariable int id){
       TestInfo testInfo = testInfoService.getQuestionTextById(id);
       System.out.println(testInfo.getTestId());
       //System.out.println(testInfo.getTest_name());
       return Result.ok().put("testInfo",testInfo);
    }

    // axios base URL /test/getQuestion/
    @GetMapping("/insertChoiceQuestion")
    public Result insertChoiceQuestion(@RequestBody TestInfo testInfo){
        testInfoService.insertChoiceQuestion(testInfo);
        return Result.ok().put("插入成功",testInfo);
    }
}
