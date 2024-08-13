package com.example.travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Users {
    @TableId(type= IdType.AUTO)
    public Integer id;
    public String phone;
    public String password;
}
