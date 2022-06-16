package com.scut.demo.dto;

import com.scut.demo.entity.KnowledgePoint;

import java.util.ArrayList;
import java.util.List;

public class ChapterDto {
    private String label;
    private List<SectionDto> children; // 小节名字

    public ChapterDto(List<KnowledgePoint> knowledgePoints) {
        this.label = knowledgePoints.get(0).getChapter();
        this.children = new ArrayList<>();
        for (KnowledgePoint k : knowledgePoints) {
            int index = indexOfSection(k);
            if (index == -1) {
                this.children.add(new SectionDto(k));
            } else {
                this.children.get(index).add(k);
            }
        }
    }

    // 查看 section 的下标, 不存在返回 -1
    private int indexOfSection(KnowledgePoint k) {
        for (int i = 0; i < this.children.size(); i++) {
            if (this.children.get(i).getLabel().equals(k.getSection())) {
                return i;
            }
        }
        return -1;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<SectionDto> getChildren() {
        return children;
    }

    public void setChildren(List<SectionDto> children) {
        this.children = children;
    }
}

class SectionDto {
    private String label;
    private List<ContentDto> children; // 知识点名字

    public void add(KnowledgePoint k) {
        this.children.add(new ContentDto(k));
    }

    public SectionDto(KnowledgePoint k) {
        this.label = k.getSection();
        this.children = new ArrayList<>();
        this.children.add(new ContentDto(k));
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<ContentDto> getChildren() {
        return children;
    }

    public void setChildren(List<ContentDto> children) {
        this.children = children;
    }
}

class ContentDto {
    private int id;
    private String label;

    public ContentDto() {
    }

    public ContentDto(KnowledgePoint k) {
        this.id = k.getId();
        this.label = k.getContent();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}