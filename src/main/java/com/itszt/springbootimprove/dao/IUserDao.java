package com.itszt.springbootimprove.dao;

import com.itszt.springbootimprove.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    @Insert("insert into user values(null,#{username},#{userpwd})")
    int addUser(User user);
}
