package com.bbsstep.mapper;

import com.bbsstep.po.User;
import com.bbsstep.po.UserExample;
import java.util.List;


public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);


}