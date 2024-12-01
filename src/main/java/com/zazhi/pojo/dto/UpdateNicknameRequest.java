package com.zazhi.pojo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateNicknameRequest {
    private String openid;
    private String nickname;
}
