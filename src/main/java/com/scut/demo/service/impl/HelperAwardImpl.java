package com.scut.demo.service.impl;

import com.scut.demo.entity.HelperAward;
import com.scut.demo.mapper.HelperAwardMapper;
import com.scut.demo.service.HelperAwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelperAwardImpl implements HelperAwardService {

    @Autowired
    private HelperAwardMapper helperAwardMapper;

    @Override
    public boolean updateHelper(HelperAward helperAward) {
        return helperAwardMapper.updateHelper(helperAward);
    }

    @Override
    public List<HelperAward> getAllInfo(int id) {
        return helperAwardMapper.getAllInfo(id);
    }
}
