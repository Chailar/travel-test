package com.example.travel.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.travel.entity.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<Users> {

}
