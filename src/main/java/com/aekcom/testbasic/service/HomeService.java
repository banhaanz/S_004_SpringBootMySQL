package com.aekcom.testbasic.service;

import com.aekcom.testbasic.entity.UserEntity;
import com.aekcom.testbasic.model.UserM;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HomeService {
    List<UserEntity> getUserList() throws Exception;
}
