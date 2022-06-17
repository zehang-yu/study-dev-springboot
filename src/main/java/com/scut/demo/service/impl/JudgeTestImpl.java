package com.scut.demo.service.impl;

import com.scut.demo.entity.JudgeTest;
import com.scut.demo.entity.TestBase;
import com.scut.demo.mapper.JudgeTestMapper;
import com.scut.demo.mapper.KnowledgePointMapper;
import com.scut.demo.service.JudgeTestService;
import com.scut.demo.service.TestBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JudgeTestImpl implements JudgeTestService {
    @Autowired
    private JudgeTestMapper judgeTestMapper;

    @Override
    public boolean insertJudgeQuestion(JudgeTest judgeTest) {
        TestBaseService testBaseService = new TestBaseImpl();
        int test_id;
        Integer max_id = testBaseService.getMaxTestID();
        if(max_id==null)
            test_id=0;
        else{
            test_id= max_id+1;
        }
        testBaseService.insertTestBase(new TestBase(test_id,judgeTest.getContent(),judgeTest.getCorrect()));
        judgeTest.setID(test_id);
        return judgeTestMapper.insertJudgeQuestion(judgeTest);
    }

    @Override
    public JudgeTest getJudgeTestById(int id) {
        return judgeTestMapper.getJudgeTestById(id);
    }
}