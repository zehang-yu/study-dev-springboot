package com.scut.demo.controller;

import com.scut.demo.entity.TestInfo;
import com.scut.demo.service.TestInfoService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestInfoController {

    @Autowired
    private TestInfoService testInfoService;

    //获取问题文本
    @GetMapping("/getQuestion")
    public Result getQuestionTextById(){
       List<TestInfo> testInfo = testInfoService.getQuestionText();
       for(TestInfo item : testInfo){
           System.out.println(item.getTestId());
       }
       //System.out.println(testInfo.getTest_name());
       return Result.ok().put("testInfo",testInfo);
    }

    //学生答题结果

    // axios base URL /test/getQuestion/
    @PostMapping("/insertChoiceQuestion")
    public Result insertChoiceQuestion(@RequestBody TestInfo testInfo){
        System.out.println(testInfo.getTitle());
        boolean success = testInfoService.insertChoiceQuestion(testInfo);
        if(success)
            return Result.ok().put("插入成功",testInfo);
        else{
            return Result.error().message("插入选择题失败");
        }
    }
}
