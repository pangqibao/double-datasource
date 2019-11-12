package com.doubleDs.order.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @ClassName MasterDataSourceConfig
 * @Description 主数据源配置
 * @Author boo
 * @Date 2019/11/7 14:56
 * @Version 1.0.0
 */
@Configuration
@MapperScan(basePackages = "com.doubleDs.order.dao.slave.mapper",sqlSessionFactoryRef = "slaveSqlSessionFactory")
public class SlaveDataSourceConfig {

    @Bean("slaveDataSource")
    @ConfigurationProperties("datasource.slave")
    public DataSource masterDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("slaveSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("slaveDataSource") DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/slave/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }
}
