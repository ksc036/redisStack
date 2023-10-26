package com.redis.om.skeleton.controller;

import com.redis.om.skeleton.models.User;
import com.redis.om.skeleton.repository.UserRepository;
import com.redis.om.skeleton.vo.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Slf4j
public class UserController {
    @Autowired
    UserRepository repo;

//    @Autowired
//    RedisTemplate<String, Object> redisTemplate;

    @GetMapping("/test")
    public String status(){
        log.info("log체크");
        return "test Success";
    }

    @PostMapping("/save")
    public String save(@RequestBody UserDto user){
        log.info("name 변수체크 {}",user.getName());
        User redisUser = User.of(user.getAge(),user.getName());
        log.info("저장결과 나오는지 체크해보자. {}",repo.save(redisUser));
        return "Success save" + user.getName();
    }

    @GetMapping("/check")
    public String check(){
        log.info("뭐있는지 체크하는건가? {}" , repo.getIds());
        return "체크완료";
    }

//    @GetMapping("/keys/{key}")
//    public String save(@PathVariable String key){
//        log.info("name 변수체크 {}",key);
//        log.info("name 변수체크 {}", redisTemplate.keys(key));
//        return "Success save";
//    }
}
