package com.example.demo.Service;

import java.util.List;


import com.example.demo.model.College;

public interface CollegeService {

	
	public void add(College c);
	public List<College> display();
	public void update(College c,Integer id);
	public void delete(Integer id);
	
}
