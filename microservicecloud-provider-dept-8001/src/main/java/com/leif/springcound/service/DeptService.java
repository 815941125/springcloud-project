package com.leif.springcound.service;

import java.util.List;

import com.leif.entities.Dept;

public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
