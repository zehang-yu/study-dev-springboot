package com.scut.demo.service.impl;

import com.scut.demo.entity.TestBase;
import com.scut.demo.mapper.TestBaseMapper;
import com.scut.demo.service.TestBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestBaseImpl implements TestBaseService {
    @Autowired
    private TestBaseMapper testBaseMapper;

    @Override
    public void insertTestBase(TestBase testBase) {
        testBaseMapper.insertTestBase(testBase);
    }

    @Override
    public List<TestBase> getAllTestBase() {
        return testBaseMapper.getAllTestBase();
    }

    @Override
    public Integer getMaxTestID() {
        return testBaseMapper.getMaxTestID();
    }
}
