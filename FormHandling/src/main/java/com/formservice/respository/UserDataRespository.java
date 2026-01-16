package com.formservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formservice.entity.UserData;

@Repository
public interface UserDataRespository extends JpaRepository<UserData, Long> {

}
