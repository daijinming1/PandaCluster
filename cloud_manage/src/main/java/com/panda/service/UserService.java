package com.panda.service;

import com.cloud.pojo.entity.User;

import java.util.List;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/21 15:22
 **/
public interface UserService {
    /**
     * 查询
     * @return
     */
    List<User> list();

    /**
     *添加
     * @param user
     * @return
     */
    String addUser(User user);

    /**
     *删除
     * @param id
     * @return
     */
    String delUser(Integer id);

    /**
     *更新
     * @param user
     * @return
     */
    String updateUser(User user);
}
