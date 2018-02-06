package com.s3k3l3v.parser;


public class TableCategories {
    private int id;
    private String  title;
    private int parent_id;
    private int clickable;
    private int ord;

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

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getClickable() {
        return clickable;
    }

    public void setClickable(int clickable) {
        this.clickable = clickable;
    }

    public int getOrd() {
        return ord;
    }

    public void setOrd(int ord) {
        this.ord = ord;
    }
}
