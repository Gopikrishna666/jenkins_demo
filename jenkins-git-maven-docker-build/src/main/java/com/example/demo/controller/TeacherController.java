package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@GetMapping(path="/teachers")
	public String getTeacherr() {
		List<String> list = Arrays.asList("amar","swetha","sumi");
		return list.toString();		
	}
	@GetMapping("/teachers/{dept}")
	public String getTeacherByDept(@PathVariable("dept") String dept) {
		List<String> list =Arrays.asList("amar","akbar","antony");
		if (dept.equals("ece")) {
			list = Arrays.asList("shankar","salim","simaon");
		}
		return list.toString();
	}
	
	@GetMapping(path="/students")
	public String getStudents() {
		return "Gopi";
	}
}
