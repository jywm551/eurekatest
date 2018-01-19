package com.wecarepet.cousumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Theodore_YU on 2018/1/18.
 */
@Configuration
public class ApplicationConfiguration {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
