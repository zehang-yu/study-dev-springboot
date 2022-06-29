package com.scut.demo.service;

import com.scut.demo.entity.HelperAward;

import java.util.List;

public interface HelperAwardService {
    //根據id修改助教獎勵信息
    boolean updateHelper(HelperAward helperAward);

    List<HelperAward> getAllInfo(int id);
}
