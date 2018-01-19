package com.wecarepet.provider.dao;

import com.wecarepet.provider.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Theodore_YU on 2018/1/18.
 */
@Repository
public interface UserRepo extends JpaRepository<User,Long>{

}
