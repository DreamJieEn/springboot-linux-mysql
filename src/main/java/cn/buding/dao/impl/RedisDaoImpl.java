package cn.buding.dao.impl;

import cn.buding.dao.IRedisDAO;
import org.springframework.stereotype.Repository;

/**
 * @author 嗯哥哥
 * @version 1.0 dao层，RedisDaoImpl实现类
 * @description cn.buding.dao
 * @email jie_del@sina.com
 * @date 2018/6/21
 */
@Repository("redisDao")
public class RedisDaoImpl implements IRedisDAO {

    /**
     * @author 嗯哥哥
     * @Description 往redis里存储数据
     * @Date 9:12 2018/6/21
     * @Param [key, value]
     * @return void
     **/
    @Override
    public void set(String key, String value) {

    }

    /**
     * @author 嗯哥哥
     * @Description 查询用户信息
     * @Date 9:05 2018/6/21
     * @Param 传过来的key值
     * @return cn.buding.model.User
     **/
    @Override
    public String get(String key) {
        return null;
    }
}
