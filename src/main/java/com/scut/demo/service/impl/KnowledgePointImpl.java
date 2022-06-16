package com.scut.demo.service.impl;

import com.scut.demo.mapper.KnowledgePointMapper;
import com.scut.demo.entity.KnowledgePoint;
import com.scut.demo.service.KnowledgePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgePointImpl implements KnowledgePointService {
    @Autowired
    private KnowledgePointMapper knowledgePointDao;

    @Override
    public boolean insertKnowledgePoint(KnowledgePoint knowledgePoint) {
        return knowledgePointDao.insertKnowledgePoint(knowledgePoint);
    }

    @Override
    public boolean updateKnowledgePointById(KnowledgePoint knowledgePoint) {
        return knowledgePointDao.updateKnowledgePointById(knowledgePoint);
    }

    @Override
    public boolean deleteKnowledgePointById(int id) {
        return knowledgePointDao.deleteKnowledgePointById(id);
    }

    @Override
    public List<KnowledgePoint> queryKnowledgePointByChapter(String chapter) {
        return knowledgePointDao.queryKnowledgePointByChapter(chapter);
    }
}
