package com.s3k3l3v.parser;

public class TabSiteProperties {
    private int id;
    private String title;

    @Override
    public String toString() {
        return "TabSiteProperties{" +
                "id=" + id +
                ", title='" + title + '\'' +
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
}
