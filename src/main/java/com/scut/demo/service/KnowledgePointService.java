package com.scut.demo.service;

import com.scut.demo.dto.ChapterDto;
import com.scut.demo.entity.KnowledgePoint;

import java.util.List;

public interface KnowledgePointService {
    // 获取所有知识点
    List<ChapterDto> queryAllKnowledgePoints();
    // 添加知识点
    boolean insertKnowledgePoint(KnowledgePoint knowledgePoint);
    // 根据id修改知识点
    boolean updateKnowledgePointById(KnowledgePoint knowledgePoint);
    // 根据id删除知识点
    boolean deleteKnowledgePointById(int id);
    // 根据章节名字查询知识点
    ChapterDto queryKnowledgePointByChapter(String chapter);
}
