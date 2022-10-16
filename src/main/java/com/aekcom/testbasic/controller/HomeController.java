package com.aekcom.testbasic.controller;

import com.aekcom.testbasic.entity.UserEntity;
import com.aekcom.testbasic.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;


    @GetMapping("/alluser")
    public @ResponseBody List<UserEntity> getAllUsers() throws Exception {
        log.info("====== Request getAllUsers Started =======");
        return homeService.getUserList();
    }
}
