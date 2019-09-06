package com.mentor.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.web.model.MentorSkills;
import com.mentor.web.repository.MentorSkillsRepository;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 36000)
@RestController
@RequestMapping("/mentorX")
public class MentorController {

	@Autowired
	private MentorSkillsRepository repository;
	
	@GetMapping("/skills/getAllskill")
	public List<MentorSkills> getAllSkills()
	{
			
			List<MentorSkills> skills = (List<MentorSkills>) repository.findAll();
			
			return skills;
	}
}
