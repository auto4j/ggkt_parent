package com.atguigu.ggkt.vod.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lyf
 * @date 2022/8/11 - 0:54
 * 功能描述：
 **/
@Configuration
@MapperScan(basePackages = "com.atguigu.ggkt.vod.mapper")
public class VodConfig {
}
