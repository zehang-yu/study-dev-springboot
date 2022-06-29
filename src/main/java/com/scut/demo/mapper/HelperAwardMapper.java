package com.scut.demo.mapper;

import com.scut.demo.entity.HelperAward;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HelperAwardMapper {
    //獲取父表記錄
    List<HelperAward> getAllInfo(int id);

    boolean updateHelper(HelperAward helperAward);
}
