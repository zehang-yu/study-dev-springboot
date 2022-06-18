package com.scut.demo.entity;

public class KnowledgePoint {
    // id
    private int kpId;
    // 哪一章的名字
    private String chapter;
    // 哪一节的名字
    private String section;
    // 知识点内容
    private String content;

    public KnowledgePoint(int id, String chapter, String section, String content) {
        this.kpId = id;
        this.chapter = chapter;
        this.section = section;
        this.content = content;
    }

    public KnowledgePoint(String chapter, String section, String content) {
        this.chapter = chapter;
        this.section = section;
        this.content = content;
    }

    public KnowledgePoint() {
    }

    public int getKpId() {
        return kpId;
    }

    public void setKpId(int kpId) {
        this.kpId = kpId;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
