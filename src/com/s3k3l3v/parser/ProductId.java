package com.s3k3l3v.parser;

/**
 * Created by Антон on 30.01.2018.
 */
public class ProductId {
    private int nn;
    private int categor;
    private int u1;
    private int u2;
    private int u21;
    private int u22;
    private int u23;

    @Override
    public String toString() {
        return "ProductId{" +
                "nn=" + nn +
                ", categor=" + categor +
                ", u1=" + u1 +
                ", u2=" + u2 +
                ", u21=" + u21 +
                ", u22=" + u22 +
                ", u23=" + u23 +
                '}';
    }

    public int getNn() {
        return nn;
    }

    public void setNn(int nn) {
        this.nn = nn;
    }

    public int getCategor() {
        return categor;
    }

    public void setCategor(int categor) {
        this.categor = categor;
    }

    public int getU1() {
        return u1;
    }

    public void setU1(int u1) {
        this.u1 = u1;
    }

    public int getU2() {
        return u2;
    }

    public void setU2(int u2) {
        this.u2 = u2;
    }

    public int getU21() {
        return u21;
    }

    public void setU21(int u21) {
        this.u21 = u21;
    }

    public int getU22() {
        return u22;
    }

    public void setU22(int u22) {
        this.u22 = u22;
    }

    public int getU23() {
        return u23;
    }

    public void setU23(int u23) {
        this.u23 = u23;
    }
}
