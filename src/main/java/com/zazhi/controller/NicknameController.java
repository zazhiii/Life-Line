package com.zazhi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nickname")
public class NicknameController {

////    @Autowired
////    private UserRepository userRepository;
//
//    @PostMapping("/update")
//    @Tag(name = "更新昵称", description = "Update the nickname of a user")
//    public ResponseEntity<String> updateNickname(@RequestBody UpdateNicknameRequest request) {
//        System.out.println("Received request: " + request); // 打印接收到的请求数据
//        User user = userRepository.findById(request.getOpenid()).orElse(null);
//        if (user != null) {
//            user.setNick_name(request.getNickname());
//            userRepository.save(user);
//            return ResponseEntity.ok("Nickname updated successfully.");
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
//        }
//    }

}
