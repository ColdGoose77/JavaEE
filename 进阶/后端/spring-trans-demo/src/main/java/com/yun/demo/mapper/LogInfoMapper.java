package com.yun.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogInfoMapper {

    @Insert("insert into log_info(user_name,op) values (#{name},#{op})")
    public Integer insert(String name, String op);

}
