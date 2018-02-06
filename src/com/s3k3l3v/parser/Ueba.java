package com.s3k3l3v.parser;


public class Ueba {
    private int id;
    private int product_id;
    private int category_id;
    private int is_main;

    @Override
    public String toString() {
        return "Ueba{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", category_id=" + category_id +
                ", is_main=" + is_main +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getIs_main() {
        return is_main;
    }

    public void setIs_main(int is_main) {
        this.is_main = is_main;
    }
}
