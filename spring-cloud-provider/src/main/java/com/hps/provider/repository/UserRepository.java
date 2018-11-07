package com.hps.provider.repository;

import com.hps.provider.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    int countBy();
}
