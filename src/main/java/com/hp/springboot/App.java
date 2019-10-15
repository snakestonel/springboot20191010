package com.hp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    /**
     * 添加对jsp支持
     * 
     */
//    @Bean
//    public ViewResolver getJspViewResolver() {
//        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/WEB-INF/");//前缀
//        internalResourceViewResolver.setSuffix(".jsp");//后缀
//        internalResourceViewResolver.setOrder(0);//优先级
//        return internalResourceViewResolver;
//    }
    
    /**
     * 添加对Freemarker支持
     *
     */
//    @Bean
//    public FreeMarkerViewResolver getFreeMarkerViewResolver() {
//        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
//        freeMarkerViewResolver.setCache(false);
//        freeMarkerViewResolver.setPrefix("/WEB-INF/");//前缀
//        freeMarkerViewResolver.setSuffix(".html");//后缀
//        freeMarkerViewResolver.setRequestContextAttribute("request");
//        freeMarkerViewResolver.setOrder(1);//优先级
//        freeMarkerViewResolver.setContentType("text/html;charset=UTF-8");
//        return freeMarkerViewResolver;
//
//    }
}
