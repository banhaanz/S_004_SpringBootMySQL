package com.aekcom.testbasic.service.impl;

import com.aekcom.testbasic.entity.UserEntity;
import com.aekcom.testbasic.repository.UserRepository;
import com.aekcom.testbasic.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class HomeServiceImpl implements HomeService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> getUserList() {
        return userRepository.findAll();
    }


}
