package cn.buding.service.impl;

import cn.buding.dao.IRedisDAO;
import cn.buding.mapper.IUserMapper;
import cn.buding.model.User;
import cn.buding.service.IUserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 嗯哥哥
 * @version 1.0
 * @description service层，UserServiceImpl实现类
 * @email jie_del@sina.com
 * @date 2018/6/21
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper iUserMapper;
    @Resource
    private IRedisDAO iRedisDAO;

    /**
     * @author 嗯哥哥
     * @Description 查询用户信息
     * @Date 9:08 2018/6/21
     * @Param []
     * @return User 返回用户信息
     **/
    @Override
    public User getUserInfo() {
        return iUserMapper.getUserInfo();

    }

    /**
     * @author 嗯哥哥
     * @Description 查询redis中缓存的用户信息
     * @Date 9:09 2018/6/21
     * @Param []
     * @return cn.buding.model.User
     **/
    @Override
    public User getCachedUserInfo() {
        iRedisDAO.set("cache_user_list","{\"name\":\"list\",\"age\":\"28\"}");

        String userJSON = iRedisDAO.get("cache_user_list");
        JSONObject userJsonObject = JSONObject.parseObject(userJSON);

        User user = new User();
        user.setName(userJsonObject.getString("name"));
        user.setAge(userJsonObject.getInteger("age"));

        return user;
    }
}
