package cn.buding.mapper;

import cn.buding.model.User;

import org.springframework.stereotype.Repository;

/**
 * @author 嗯哥哥
 * @version 1.0
 * @description  user的mapper层
 * @email jie_del@sina.com
 * @date 2018/6/21
 */
public interface IUserMapper {

    /**
    * @author 嗯哥哥
    * @Description 查询用户信息
    * @Date 9:05 2018/6/21
    * @Param 传过来的key值
    * @return cn.buding.model.User
    **/
    public User getUserInfo();
}
