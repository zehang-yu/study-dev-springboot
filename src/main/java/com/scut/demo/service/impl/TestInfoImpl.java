package com.scut.demo.service.impl;

import com.scut.demo.entity.StudentAnswer;
import com.scut.demo.entity.TestBase;
import com.scut.demo.entity.TestInfo;
import com.scut.demo.mapper.TestInfoMapper;
import com.scut.demo.service.TestBaseService;
import com.scut.demo.service.TestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestInfoImpl implements TestInfoService {

    @Autowired
    private TestInfoMapper testInfoMapper;

    @Autowired
    private TestBaseService testBaseService;

    @Override
    public boolean insertChoiceQuestion(TestInfo testInfo){
        int test_id;
        Integer max_id = testBaseService.getMaxTestID();
        if(max_id==null)
            test_id=0;
        else{
            test_id= max_id+1;
        }
        testBaseService.insertTestBase(new TestBase(test_id,testInfo.getTestName(),testInfo.getCorrect()));
        testInfo.setTestId(test_id);
        return testInfoMapper.insertChoiceQuestion(testInfo);
    }

    @Override
    public List<TestInfo> getQuestionText() {
        return testInfoMapper.getQuestionText();
    }

    @Override
    public boolean studentAnswer(StudentAnswer studentAnswer){

        return testInfoMapper.studentAnswer(studentAnswer);
    }

    @Override
    public void deleteChoiceQuestionById(int id) { testInfoMapper.deleteChoiceQuestionById(id);}
}
