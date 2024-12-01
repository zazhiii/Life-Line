package com.zazhi.pojo.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private String openid;
    private String session_key;
    private String nick_name;
    private String avatar_url;

    @Override
    public String toString() {
        return "User{" +
                "openid='" + openid + '\'' +
                ", session_key='" + session_key + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", avatar_url='" + avatar_url + '\'' +
                '}';
    }
}
