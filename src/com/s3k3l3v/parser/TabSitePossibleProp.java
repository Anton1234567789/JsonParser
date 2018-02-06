package com.s3k3l3v.parser;


public class TabSitePossibleProp {
    private int id;
    private int propertyId;
    private String value;

    @Override
    public String toString() {
        return "TabSitePossibleProp{" +
                "id=" + id +
                ", propertyId=" + propertyId +
                ", value='" + value + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
