package com.xvkang.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import com.xvkang.ssm.model.Person;

public interface PersonCustomMapper {

	public List<Person> selectAll();
	
	@Update("update person set name=#{name} where id=#{id}")
	public int updatePerson(Person person);

}
