package com.iotek.model;

public class Comment {
    private Integer id;
    private String name;
    private String content;
    private Integer uid;

    public Comment() {
    }

    public Comment(String name, String content, Integer uid) {
        this.name = name;
        this.content = content;
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "ID=" + id +
                ", 标题='" + name + '\'' +
                ", 内容='" + content + '\'' +
                ", 发帖人ID=" + uid +
                '}';
    }
}
