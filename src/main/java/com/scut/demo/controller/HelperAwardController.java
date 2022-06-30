package com.scut.demo.controller;


import com.scut.demo.entity.HelperAward;
import com.scut.demo.entity.JudgeTest;
import com.scut.demo.service.HelperAwardService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allInfo")
public class HelperAwardController {
    @Autowired
    HelperAwardService helperAwardService;

    @GetMapping("/getInfo/{id}")
    List<HelperAward> getAllInfo(@PathVariable int id)
    {
        List<HelperAward> ans=helperAwardService.getAllInfo(id);
        return ans;
    }

    @PutMapping("/getInfo")
    public Result updateHelp(@RequestBody HelperAward helperAward){
        boolean success = helperAwardService.updateHelper(helperAward);
        if(success){
            return Result.ok().put("更新成功",helperAward);
        }
        else{
            return Result.error().message("更新失败");
        }
    }

}
