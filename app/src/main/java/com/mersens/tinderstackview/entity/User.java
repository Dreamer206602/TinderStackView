package com.mersens.tinderstackview.entity;

/**
 * Created by Mersens on 2016/12/2.
 */

public class User {
    private String name;
    private String avatarUrl;

    public User(String name, String avatarUrl) {
        this.name = name;
        this.avatarUrl = avatarUrl;
    }
    public User() {

    }
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
