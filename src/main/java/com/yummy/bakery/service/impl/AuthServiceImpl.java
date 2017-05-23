package com.yummy.bakery.service.impl;

import com.yummy.bakery.model.entity.User;
import com.yummy.bakery.repository.AuthRepository;
import com.yummy.bakery.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthRepository authRepository;

    @Override
    public void register(User user) {
        authRepository.save(user);
    }

}
