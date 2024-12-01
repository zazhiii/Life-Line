package com.zazhi.controller;

import com.zazhi.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WxLoginController {

    private final UserService userService;
    private final ObjectMapper objectMapper;

    @Value("${wechat.appid}")
    private String appid;

    @Value("${wechat.secret}")
    private String secret;

    public WxLoginController(UserService userService, ObjectMapper objectMapper) {
        this.userService = userService;
        this.objectMapper = objectMapper;
    }
//
//    @PostMapping("/login")
//    @Operation(summary = "微信登录", description = "使用微信小程序 code 登录")
//    public ResponseEntity<Map<String, Object>> login(@RequestBody Map<String, Object> requestData) {
//        String code = (String) requestData.get("code");
//        Map<String, Object> userInfo = (Map<String, Object>) requestData.get("userInfo");
//
//        try {
//            // 获取 openid 和 session_key
//            String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid +
//                    "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";
//            Map<String, Object> result = objectMapper.readValue(new URL(url), Map.class);
//
//            String openid = (String) result.get("openid");
//            String sessionKey = (String) result.get("session_key");
//
//            // 查询用户是否存在
//            Optional<User> existingUserOpt = userService.findByOpenid(openid);
//
//            User user;
//            if (existingUserOpt.isPresent()) {
//                // 用户存在，更新 session_key
//                user = existingUserOpt.get();
//                user.setSession_key(sessionKey);
//            } else {
//                // 用户不存在，创建新用户
//                user = new User();
//                user.setOpenid(openid);
//                user.setSession_key(sessionKey);
//                user.setNick_name((String) userInfo.get("nickName"));
//                user.setAvatar_url((String) userInfo.get("avatarUrl"));
//                userService.save(user);
//            }
//            // 返回成功响应
//            Map<String, Object> response = new HashMap<>();
//            response.put("userInfo", Map.of(
//                    "nickName", user.getNick_name(),
//                    "avatarUrl", user.getAvatar_url(),
//                    "openid", openid
//            ));
//            return ResponseEntity.ok(response);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(500).body(Collections.singletonMap("error", "登录失败"));
//        }
//    }
}
