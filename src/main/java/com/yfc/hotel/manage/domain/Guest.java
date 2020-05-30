package com.yfc.hotel.manage.domain;

/**
 * <p>description 客人</p>
 *
 * @author yfc
 * @see
 * @since 1.0.0
 */
public class Guest {
    private int profileid;
    private String name;

    public int getProfileid() {
        return profileid;
    }

    public void setProfileid(int profileid) {
        this.profileid = profileid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
