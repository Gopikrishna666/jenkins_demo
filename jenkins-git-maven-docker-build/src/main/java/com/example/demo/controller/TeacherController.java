package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@GetMapping(path="/teachers")
	public String getTeacherr() {
		List<String> list = Arrays.asList("amar","swetha","sumi");
		return list.toString();		
	}
}
