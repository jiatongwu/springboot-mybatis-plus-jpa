package com.xvkang.ssm.jpadao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xvkang.ssm.jpamodel.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{

}
