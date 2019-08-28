package com.hsw.item.mudo.dao;

import com.hsw.item.mudo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDAO {
    /**
     * 登陆
     *
     * @author huang.sw
     * @date 2019/8/28  20:37
     * @param name     用户名
     * @param password 密码
     * @return com.hsw.item.mudo.entity.User
     */
    User find(@Param("name")String name, @Param("password")String password);

}
