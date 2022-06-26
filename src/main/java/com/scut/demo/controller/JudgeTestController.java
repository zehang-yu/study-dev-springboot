package com.scut.demo.controller;

import com.scut.demo.entity.JudgeTest;
import com.scut.demo.entity.StudentAnswer;
import com.scut.demo.entity.TestInfo;
import com.scut.demo.service.JudgeTestService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/judgeTest")
public class JudgeTestController {
    @Autowired
    private JudgeTestService judgeTestService;

    @GetMapping("/get/{id}")
    public Result getJudgeTestById(@PathVariable int id){
        JudgeTest judgeTest = judgeTestService.getJudgeTestById(id);
        return Result.ok().put("成功获取判断题",judgeTest);
    }
    @GetMapping("/get")
    public Result getJudgeText(){
        List<JudgeTest> judgeText= judgeTestService.getJudgeText();
        //System.out.println(testInfo.getTestename());
        return Result.ok().put("judgeText",judgeText);
    }
    @PostMapping("/studentAnswerJudge")
    public Result studentAnswer(@RequestBody StudentAnswer studentAnswer){
        //System.out.println("aaaaa"+studentAnswer.getStudentId()+ ' '+ studentAnswer.getQuestionId() );
        boolean success = judgeTestService.studentAnswerJudge(studentAnswer);
        if(success){
            return Result.ok();
        }
        else {
            return Result.error().message("插入失败");
        }

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
