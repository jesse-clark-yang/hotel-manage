package com.yfc.hotel.manage.dto;

/**
 * <p>description 返回结果</p>
 *
 * @author yfc
 * @see
 * @since 1.0.0
 */
public class Result {
    private String name;
    private String mon;
    private int nights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
}
