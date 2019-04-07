package com.xvkang.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xvkang.ssm.jpadao.PersonDao;
import com.xvkang.ssm.mapper.Person2Mapper;
import com.xvkang.ssm.mapper.PersonCustomMapper;
import com.xvkang.ssm.mapper.PersonMapper;
import com.xvkang.ssm.model.Person;

@Service
public class PersonService {
	@Autowired
	private PersonCustomMapper personCustomMapper;
	@Autowired
	private PersonMapper personMapper;
	@Autowired
	private Person2Mapper person2Mapper;
	@Autowired
	private PersonDao personDao;

	public void test() {

		Person person = new Person();
		person.setId(1);
		person.setName("name1name1test");
		personMapper.updateByPrimaryKey(person);

		person.setName("name1name1testtesttest");
		personCustomMapper.updatePerson(person);

		List<Person> selectAll = personCustomMapper.selectAll();
		System.out.println(selectAll);

		List<Person> selectByExample = personMapper.selectByExample(null);
		System.out.println(selectByExample);

		Page<Person> page = new Page<>(1, 1);
		IPage<Person> selectPage = person2Mapper.selectPage(page, null);
		System.out.println(selectPage);
		System.out.println("================= 相关的分页信息 ==================");
		System.out.println("总条数:" + page.getTotal());
		System.out.println("当前页码:" + page.getCurrent());
		System.out.println("总页数:" + page.getPages());
		System.out.println("每页显示条数:" + page.getSize());
		System.out.println("是否有上一页:" + page.hasPrevious());
		System.out.println("是否有下一页:" + page.hasNext());
		
		List<com.xvkang.ssm.jpamodel.Person> findAll = personDao.findAll();
		System.out.println(findAll);
	}

}
