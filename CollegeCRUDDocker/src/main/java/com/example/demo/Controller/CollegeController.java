package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CollegeService;
import com.example.demo.model.College;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService cr;
	
	@PostMapping("/add")
	public void add(@RequestBody College collge) {
		cr.add(collge);
	}
	
	@GetMapping("/display")
	public List<College> display(){
		return cr.display();
	}
	


}
