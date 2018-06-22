package cn.buding.service;

import cn.buding.model.User;

/**
 * @author 嗯哥哥
 * @version 1.0
 * @description cn.buding.service
 * @email jie_del@sina.com
 * @date 2018/6/21
 */
public interface IUserService {

    /**
    * @author 嗯哥哥
    * @Description 查询用户信息
    * @Date 9:08 2018/6/21
    * @Param []
    * @return User 返回用户信息
    **/
    public User getUserInfo();

    /**
    * @author 嗯哥哥
    * @Description 查询redis中缓存的用户信息
    * @Date 9:09 2018/6/21
    * @Param []
    * @return cn.buding.model.User
    **/
    public User getCachedUserInfo();
}
