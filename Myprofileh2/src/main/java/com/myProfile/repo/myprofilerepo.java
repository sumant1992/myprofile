package com.myProfile.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myProfile.model.Myprofile;

public interface myprofilerepo extends JpaRepository<Myprofile, Integer>{

}
