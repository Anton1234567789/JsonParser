package com.s3k3l3v.parser;


public class Shops {
    private int id;
    private int city_id;
    private String title;
    private String phone;
    private String address;
    private int visible;

    @Override
    public String toString() {
        return "Shops{" +
                "id=" + id +
                ", city_id=" + city_id +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", visible=" + visible +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }
}
