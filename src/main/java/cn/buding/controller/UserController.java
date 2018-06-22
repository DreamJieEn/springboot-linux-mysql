package cn.buding.controller;

import cn.buding.model.User;
import cn.buding.service.IUserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 嗯哥哥
 * @version 1.0
 * @description 用户模块，controller层。
 * @email jie_del@sina.com
 * @date 2018/6/21
 */

@Controller
public class UserController {

    @Resource
    private IUserService iUserService;

    /**
    * @author 嗯哥哥
    * @Description 获得用户信息
    * @Date 9:32 2018/6/21
    * @Param []
    * @return User 返回用户信息
    **/
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(){
        User user = iUserService.getUserInfo();
        return user;
    }

    /**
     * @author 嗯哥哥
     * @Description 从缓存中获得用户信息
     * @Date 9:32 2018/6/21
     * @Param []
     * @return User 返回用户信息
     **/
    @RequestMapping("/getCachedUserInfo")
    @ResponseBody
    public User getCachedUserInfo(){
        User user = iUserService.getCachedUserInfo();
        return user;
    }


}
