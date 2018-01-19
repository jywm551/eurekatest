package com.wecarepet.provider;

import com.wecarepet.provider.domain.User;
import com.wecarepet.provider.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Theodore_YU on 2018/1/18.
 */
@RestController
public class Controller {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userRepo.findOne(id);
    }

}
