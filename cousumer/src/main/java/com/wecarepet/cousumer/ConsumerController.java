package com.wecarepet.cousumer;

import com.wecarepet.cousumer.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Theodore_YU on 2018/1/18.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:8000/"+id,User.class);
    }
}
