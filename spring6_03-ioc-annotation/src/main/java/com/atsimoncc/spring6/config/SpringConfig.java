package com.atsimoncc.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SpringConfig
 * Package: com.atsimoncc.spring6.config
 * Description:
 */
@Configuration // 表示為一個配置類
@ComponentScan("com.atsimoncc.spring6") // 開啟組件掃描
public class SpringConfig {
}
