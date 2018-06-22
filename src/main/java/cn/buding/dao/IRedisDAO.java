package cn.buding.dao;

/**
 * @author 嗯哥哥
 * @version 1.0 redis dao层
 * @description cn.buding.dao
 * @email jie_del@sina.com
 * @date 2018/6/21
 */
public interface IRedisDAO {

    /**
    * @author 嗯哥哥
    * @Description 往redis里存储数据
    * @Date 9:12 2018/6/21
    * @Param [key, value]
    * @return void
    **/
    void set(String key,String value);

    /**
    * @author 嗯哥哥
    * @Description 根据key值获取值
    * @Date 9:13 2018/6/21
    * @Param [key]
    * @return java.lang.String
    **/
    String get(String key);
}
