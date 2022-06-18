package com.scut.demo.service.impl;

import com.scut.demo.mapper.HelperAwardMapper;
import com.scut.demo.service.HelperAwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelperAwardImpl implements HelperAwardService {

    @Autowired
    private HelperAwardMapper helperAwardMapper;

    @Override
    public boolean updateHelper(int id) {
        return false;
    }
}
