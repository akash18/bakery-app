package com.yummy.bakery.service.impl;

import com.yummy.bakery.model.entity.Role;
import com.yummy.bakery.repository.RoleRepository;
import com.yummy.bakery.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRole(long id) {
        return roleRepository.findOne(id);
    }
}
