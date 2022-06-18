package com.scut.demo.controller;

import com.scut.demo.entity.TestBase;
import com.scut.demo.service.TestBaseService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//涉及对题目父表进行操作的控制器

@RestController
@RequestMapping("/alltest")
public class TestBaseController {
    @Autowired
    TestBaseService testBaseService;

    @GetMapping("/get")
    Result getAllTestBase(){
        List<TestBase> res = testBaseService.getAllTestBase();
        return Result.ok().put("question",res);
    }
}
