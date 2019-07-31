package com.slov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    public ProcessedFiles fp(){
        return new ProcessedFiles();
    }

    @Bean
    public PlainValidation plainValidation(){
        return new PlainValidation();
    }

    @Bean
    public NumericValidation numericValidation(){
        return new NumericValidation();
    }

    @Bean
    public Combination un(){
        return new Combination(numericValidation(),plainValidation(),fp());
    }

    @Bean
    public Menu menu(){
        return new Menu(un());
    }
}
