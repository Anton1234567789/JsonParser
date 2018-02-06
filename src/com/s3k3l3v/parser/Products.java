package com.s3k3l3v.parser;

public class Products {
    int id;
    String title;
    int article;
    int brend;
    int group_id;

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", article=" + article +
                ", brend=" + brend +
                ", group_id=" + group_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public int getBrend() {
        return brend;
    }

    public void setBrend(int brend) {
        this.brend = brend;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }
}
