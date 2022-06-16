package com.scut.demo.controller;

import com.scut.demo.entity.KnowledgePoint;
import com.scut.demo.service.KnowledgePointService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kp") // Knowledge Point
public class KnowledgeController {
    @Autowired
    private KnowledgePointService knowledgePointService;

    // 根据章节得到知识点
    @GetMapping("/get/{chapter}")
    public Result getKnowledgePointsByChapter(@PathVariable String chapter) {
        List<KnowledgePoint> kps = knowledgePointService.queryKnowledgePointByChapter(chapter);
        if (kps.isEmpty()) {
            return Result.error().message("获取失败, 没有对应的章节");
        } else {
            return Result.ok().put("kps", kps);
        }
    }

    // 添加知识点
    @PostMapping("/post")
    public Result postKnowledgePoint(@RequestParam KnowledgePoint knowledgePoint) {
        boolean success = knowledgePointService.insertKnowledgePoint(knowledgePoint);
        if (success) {
            return Result.ok();
        } else {
            return Result.error().message("添加失败");
        }
    }

    // 删除知识点
    @DeleteMapping("/delete/{id}")
    public Result deleteKnowledgePointById(@PathVariable int id) {
        boolean success = knowledgePointService.deleteKnowledgePointById(id);
        if (success) {
            return Result.ok();
        } else {
            return Result.error().message("删除失败, 没有对应的id");
        }
    }

    // 修改知识点
    @PutMapping("/update")
    public Result updateKnowledgePoint(@RequestParam KnowledgePoint knowledgePoint) {
        boolean success = knowledgePointService.updateKnowledgePointById(knowledgePoint);
        if (success) {
            return Result.ok();
        } else {
            return Result.error().message("更新失败");
        }
    }
}
