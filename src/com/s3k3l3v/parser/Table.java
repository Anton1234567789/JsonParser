package com.s3k3l3v.parser;

public class Table {
    String id;
    String title;
    String article;
    String groupId;
    String description;

    @Override
    public String toString() {
        return "Table{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", article='" + article + '\'' +
                ", groupId='" + groupId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
