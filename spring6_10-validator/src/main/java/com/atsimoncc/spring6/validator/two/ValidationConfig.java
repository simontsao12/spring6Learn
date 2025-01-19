package com.atsimoncc.spring6.validator.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * ClassName: ValidationConfig
 * Package: com.atsimoncc.spring6.validator.two
 * Description:
 */
@Configuration
@ComponentScan("com.atsimoncc.spring6.validator.two")
public class ValidationConfig {

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }


}
