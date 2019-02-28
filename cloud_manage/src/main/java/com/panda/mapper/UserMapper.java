package com.panda.mapper;

import com.cloud.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/21 15:19
 **/
@Mapper
@Repository
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}
