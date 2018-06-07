package com.myhexin.config;

import com.myhexin.cd.CompactDisc;
import com.myhexin.cd.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "com.myhexin.cd" ,
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION ,value = Controller.class)})
public class CDPlayConfig {

   /* @Bean
    public CompactDisc returnSgtPepers() {
        return new SgtPeppers();
    }*/

}
