package com.scut.demo.service.impl;

import com.scut.demo.dto.ChapterDto;
import com.scut.demo.entity.KnowledgePoint;
import com.scut.demo.mapper.KnowledgePointMapper;
import com.scut.demo.service.KnowledgePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class KnowledgePointImpl implements KnowledgePointService {
    @Autowired
    private KnowledgePointMapper knowledgePointMapper;

    @Override
    public List<ChapterDto> queryAllKnowledgePoints() {
        List<KnowledgePoint> list = knowledgePointMapper.queryAllKnowledgePoints();
        if (list.isEmpty())
            return null;
        Map<String, List<KnowledgePoint>> map = new HashMap<>();
        for (KnowledgePoint kp : list) {
            if (map.containsKey(kp.getChapter())) {
                map.get(kp.getChapter()).add(kp);
            } else {
                List<KnowledgePoint> kps = new ArrayList<>();
                kps.add(kp);
                map.put(kp.getChapter(), kps);
            }
        }
        List<ChapterDto> ret = new ArrayList<>();
        for (String key : map.keySet()) {
            ret.add(new ChapterDto(map.get(key)));
        }
        return ret;
    }

    @Override
    public boolean insertKnowledgePoint(KnowledgePoint knowledgePoint) {
        return knowledgePointMapper.insertKnowledgePoint(knowledgePoint);
    }

    @Override
    public boolean updateKnowledgePointById(KnowledgePoint knowledgePoint) {
        return knowledgePointMapper.updateKnowledgePointById(knowledgePoint);
    }

    @Override
    public boolean deleteKnowledgePointById(int id) {
        return knowledgePointMapper.deleteKnowledgePointById(id);
    }

    @Override
    public ChapterDto queryKnowledgePointByChapter(String chapter) {
        List<KnowledgePoint> list = knowledgePointMapper.queryKnowledgePointByChapter(chapter);
        if (list.isEmpty()) {
            return null;
        }
        ChapterDto chapterDto = new ChapterDto(list);
        return chapterDto;
    }
}
