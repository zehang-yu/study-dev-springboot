package com.scut.demo.service.impl;

import com.scut.demo.entity.TestInfo;
import com.scut.demo.mapper.TestInfoMapper;
import com.scut.demo.service.TestInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestInfoImpl implements TestInfoService {

    @Autowired
    private TestInfoMapper testInfoMapper;

    @Override
    public TestInfo getQuestionTextById(int id) {
        return testInfoMapper.getQuestionTextById(id);
    }

    @Override
    public String getOptionTextById(int id) {
        return testInfoMapper.getOptionTextById(id);
    }

    @Override
    public String getCorrectOptionAById(int id) {
        return testInfoMapper.getCorrectOptionAById(id);
    }
}
