package com.example.bladebuilder.conf;

import com.example.bladebuilder.converter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*");
    }

    public void addFormatters(FormatterRegistry registry) {

        registry.addConverter(getUserResponseDTOConverter());
        registry.addConverter(getUserConverter());
        registry.addConverter(getMeasurementConverter());
        registry.addConverter(getDateConverter());

    }

    @Bean
    public UserResponseDTOConverter getUserResponseDTOConverter() {
        return new UserResponseDTOConverter();
    }

    @Bean
    public UserConverter getUserConverter() {
        return new UserConverter();
    }

    @Bean
    public MeasurementConverter getMeasurementConverter() {
        return new MeasurementConverter();
    }

    @Bean
    public MeasurementDetailsConverter getMeasurementDetailsConverter() {
        return new MeasurementDetailsConverter();
    }

    @Bean
    public DateConverter getDateConverter(){
        return new DateConverter();
    }

}
