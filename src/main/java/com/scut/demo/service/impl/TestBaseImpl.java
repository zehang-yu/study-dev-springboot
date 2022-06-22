package com.scut.demo.service.impl;

import com.scut.demo.entity.JudgeTest;
import com.scut.demo.entity.TestBase;
import com.scut.demo.mapper.TestBaseMapper;
import com.scut.demo.service.JudgeTestService;
import com.scut.demo.service.TestBaseService;
import com.scut.demo.service.TestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestBaseImpl implements TestBaseService {
    @Autowired
    private TestBaseMapper testBaseMapper;

    @Autowired
    private JudgeTestService judgeTestService;

    @Autowired
    private TestInfoService testInfoService;

    @Override
    public void insertTestBase(TestBase testBase) {
        testBaseMapper.insertTestBase(testBase);
    }

    @Override
    public List<TestBase> getAllTestBase() {
        List<TestBase> allTest=testBaseMapper.getAllTestBase();
        return allTest;
    }

    @Override
    public Integer getMaxTestID() {
        return testBaseMapper.getMaxTestID();
    }

    @Override
    public void deleteTestBaseById(int id){
        testBaseMapper.deleteTestBaseById(id);
        //判断删除的题目是选择还是判断
        JudgeTest judgeTest = judgeTestService.getJudgeTestById(id);
        if(judgeTest==null){ //说明不是判断题,就是选择题
            testInfoService.deleteChoiceQuestionById(id);
        }
        else{ //是判断题
            judgeTestService.deleteJudgeTestById(id);
        }
    }
}
