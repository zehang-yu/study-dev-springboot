package com.scut.demo.mapper;

import com.scut.demo.entity.KnowledgePoint;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface KnowledgePointMapper {
    // 添加知识点
    boolean insertKnowledgePoint(KnowledgePoint knowledgePoint);
    // 根据id修改知识点
    boolean updateKnowledgePointById(KnowledgePoint knowledgePoint);
    // 根据id删除知识点
    boolean deleteKnowledgePointById(int id);
    // 根据章节名字查询知识点
    List<KnowledgePoint> queryKnowledgePointByChapter(String chapter);
}
