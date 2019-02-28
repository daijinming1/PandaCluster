package com.panda.service;


import com.panda.pojo.entity.SysUser;

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
    List<SysUser> list();

    /**
     *添加
     * @param sysUser
     * @return
     */
    String addUser(SysUser sysUser);

    /**
     *删除
     * @param id
     * @return
     */
    String delUser(Integer id);

    /**
     *更新
     * @param sysUser
     * @return
     */
    String updateUser(SysUser sysUser);
}
