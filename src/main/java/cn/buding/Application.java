package cn.buding;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @author 嗯哥哥
 * @version 1.0
 * @description cn.buding
 * @email jie_del@sina.com
 * @date 2018/6/20
 */

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("cn.buding.mapper")
public class Application {

    /**
    * @author 嗯哥哥
    * @Description  创建资源池
    * @Date 8:51 2018/6/21
    * @Param
    * @return
    **/
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource(){
        return new DataSource();
    }

    /**
    * @author 嗯哥哥
    * @Description 都取mybatis配置文件
    * @Date 8:58 2018/6/21
    * @Param []
    * @return org.apache.ibatis.session.SqlSessionFactory
    **/
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources("classpath:/mybatis/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    /**
    * @author 嗯哥哥
    * @Description springboot启动器
    * @Date 8:58 2018/6/21
    * @Param
    * @return
    **/
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
