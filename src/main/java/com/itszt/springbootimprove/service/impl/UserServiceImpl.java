package com.itszt.springbootimprove.service.impl;

import com.itszt.springbootimprove.dao.IUserDao;
import com.itszt.springbootimprove.entity.User;
import com.itszt.springbootimprove.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public User getUser() {
        System.out.println("UserServiceImpl.getUser");
        iUserDao.addUser(new User(21,"小白","123"));
        return new User(21,"小白","123");
    }
}
