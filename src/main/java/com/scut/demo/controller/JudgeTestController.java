package com.scut.demo.controller;

import com.scut.demo.entity.JudgeTest;
import com.scut.demo.entity.TestInfo;
import com.scut.demo.service.JudgeTestService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/judgeTest")
public class JudgeTestController {
    @Autowired
    private JudgeTestService judgeTestService;

    @GetMapping("/get/{id}")
    public Result getJudgeTestById(@PathVariable int id){
        JudgeTest judgeTest = judgeTestService.getJudgeTestById(id);
        System.out.println(judgeTest.getID());
        //System.out.println(testInfo.getTest_name());
        return Result.ok().put("成功获取判断题",judgeTest);
    }

    @PostMapping("/insert")
    public Result insertJudgeQuestion(@RequestBody JudgeTest judgeTest){
        boolean success = judgeTestService.insertJudgeQuestion(judgeTest);
        if(success){
            return Result.ok().put("插入成功",judgeTest);
        }
        else{
            return Result.error().message("插入判断题失败");
        }
    }
}
