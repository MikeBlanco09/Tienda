
package com.tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplatesResolverConfiguration {
    
    @Bean
    public SpringResourceTemplateResolver template_0(){
        SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
        
        plantilla.setPrefix("classpath:/templates");
        plantilla.setSuffix(".html");
        plantilla.setTemplateMode(TemplateMode.HTML);
        plantilla.setCharacterEncoding("UTF-8");
        plantilla.setOrder(0);
        plantilla.setCheckExistence(true);
        
        return plantilla;
    }
    
    @Bean
    public SpringResourceTemplateResolver template_1(){
        SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
        
        plantilla.setPrefix("templates/articulo");
        plantilla.setSuffix(".html");
        plantilla.setTemplateMode(TemplateMode.HTML);
        plantilla.setCharacterEncoding("UTF-8");
        plantilla.setOrder(0);
        plantilla.setCheckExistence(true);
        
        return plantilla;
    }
    
    @Bean
    public SpringResourceTemplateResolver template_2(){
        SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
        
        plantilla.setPrefix("templates/categoria");
        plantilla.setSuffix(".html");
        plantilla.setTemplateMode(TemplateMode.HTML);
        plantilla.setCharacterEncoding("UTF-8");
        plantilla.setOrder(0);
        plantilla.setCheckExistence(true);
        
        return plantilla;
    }
    
    @Bean
    public SpringResourceTemplateResolver template_3(){
        SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
        
        plantilla.setPrefix("templates/cliente");
        plantilla.setSuffix(".html");
        plantilla.setTemplateMode(TemplateMode.HTML);
        plantilla.setCharacterEncoding("UTF-8");
        plantilla.setOrder(0);
        plantilla.setCheckExistence(true);
        
        return plantilla;
    }
    
}
