package com.s3k3l3v.parser;

public class Ueba2 {
    private int ext_id;

    private int product_id;
    private int property_id;
    private int value_id;

    @Override
    public String toString() {
        return "Ueba2{" +
                "ext_id=" + ext_id +
                ", product_id=" + product_id +
                ", property_id=" + property_id +
                ", value_id=" + value_id +
                '}';
    }

    public int getExt_id() {
        return ext_id;
    }

    public void setExt_id(int ext_id) {
        this.ext_id = ext_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    public int getValue_id() {
        return value_id;
    }

    public void setValue_id(int value_id) {
        this.value_id = value_id;
    }
}
