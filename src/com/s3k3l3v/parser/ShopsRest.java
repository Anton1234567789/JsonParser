package com.s3k3l3v.parser;


public class ShopsRest {
    private int id;
    private int shop_id;
    private int product_id;
    private int qty;
    private int price;
    private int old_price;
    private int order_price;

    @Override
    public String toString() {
        return "ShopsRest{" +
                "id=" + id +
                ", shop_id=" + shop_id +
                ", product_id=" + product_id +
                ", qty=" + qty +
                ", price=" + price +
                ", old_price=" + old_price +
                ", order_price=" + order_price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOld_price() {
        return old_price;
    }

    public void setOld_price(int old_price) {
        this.old_price = old_price;
    }

    public int getOrder_price() {
        return order_price;
    }

    public void setOrder_price(int order_price) {
        this.order_price = order_price;
    }
}
