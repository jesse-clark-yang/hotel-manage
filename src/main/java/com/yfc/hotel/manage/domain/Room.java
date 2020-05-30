package com.yfc.hotel.manage.domain;

/**
 * <p>description客房</p>
 *
 * @author yfc
 * @see
 * @since 1.0.0
 */
public class Room {
    private String mon;
    private int profiled;
    private int nights;

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getProfiled() {
        return profiled;
    }

    public void setProfiled(int profiled) {
        this.profiled = profiled;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }
}
