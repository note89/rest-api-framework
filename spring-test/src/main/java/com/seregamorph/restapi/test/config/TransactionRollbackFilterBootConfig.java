package com.seregamorph.restapi.test.config;

import com.seregamorph.restapi.test.filters.TransactionRollbackFilter;
import lombok.val;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

public class TransactionRollbackFilterBootConfig {

    public static final int ORDER = -100;

    @Bean
    @ConditionalOnProperty(prefix = "web" , name = "environment", havingValue = "embedded")
    public FilterRegistrationBean transactionalRollbackFilter(ApplicationContext applicationContext) {
        val filter = new TransactionRollbackFilter(applicationContext);
        val bean = new FilterRegistrationBean(filter);
        bean.setOrder(ORDER);
        return bean;
    }

}
