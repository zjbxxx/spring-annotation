package com.zhujianbiao.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;


public class Bird {
    @Value("${nickname}")
    private String nickname;

    @Override
    public String toString() {
        return "Bird{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
