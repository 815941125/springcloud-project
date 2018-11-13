package com.leif.springcound.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leif.entities.Dept;
import com.leif.springcound.dao.DeptDao;
import com.leif.springcound.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptDao dao;

	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}
}
