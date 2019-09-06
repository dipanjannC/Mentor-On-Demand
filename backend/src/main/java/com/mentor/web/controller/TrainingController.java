package com.mentor.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.web.model.Trainings;
import com.mentor.web.repository.MentorSkillsRepository;
import com.mentor.web.repository.TrainingsRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 36000)
@RestController
@RequestMapping("/mentorX/trainings")
public class TrainingController {

	@Autowired
	private TrainingsRepository trainingRepository;
	private MentorSkillsRepository mentorSkillstrainingRepository;
	
	

	@PostMapping(value = "/new")
	public ResponseEntity<Void> postTrainings(@RequestBody Trainings trainings) {

		trainingRepository.save(new Trainings ( trainings.getTrainingId(), trainings.getUserId(), trainings.getMentorId(), trainings.getSkillId(), trainings.getStatus(),  trainings.getProgress(),trainings.getRating(),
				trainings.getStartTime(), trainings.getEndTime(), trainings.getStartDate(), trainings.getEndDate(), trainings.getAmountReceived(), trainings.getFees(),
				trainings.getUsername(), trainings.getMentorName(), trainings.getSkillName()));
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	} 

	
	@GetMapping("/trainings/all/{trainingId}")
	public Optional<Trainings> getAllDetails(@PathVariable("trainingId") long trainingId) {
		System.out.println("List of all Details with the Training ID :");
		Optional<Trainings> trainingDetails = trainingRepository.findById(trainingId);
		return trainingDetails;
	}
	
	@GetMapping("/completed/user/{userId}")
	public List<Trainings> getAllCompletedTrainingByUser(@PathVariable("userId") long userId)
	{
			System.out.println("List of all Completed training Details of User with ID: "+ userId);
			List<Trainings> trainingDetails = trainingRepository.getAllCompletedTraining(userId);
			return trainingDetails;
	}
	@GetMapping("/completed/mentor/{mentorId}")
	public List<Trainings> getAllCompletedTrainingMentor(@PathVariable("mentorId") long mentorId)
	{
			System.out.println("Get all completed training Details of Mentors with ID: "+ mentorId);
			List<Trainings> trainingDetails = trainingRepository.getAllCompletedTrainingMentor(mentorId);
			return trainingDetails;
	}
	
	
	@GetMapping("/current/user/{userId}")
	public List<Trainings> onProgressTrainingDetailsByUser(@PathVariable("userId") long userId)
	{
			System.out.println("Get all On Progress Trainings of id...");
			List<Trainings> trainingDetails = trainingRepository.getAllOnProgress(userId);
			return trainingDetails;
	}
	

	
	@GetMapping("/current/mentor/{mentorId}")
	public List<Trainings> onProgressTrainingDetailsByMentor(@PathVariable("mentorId") long mentorId)
	{
			System.out.println("Get all On Progress Trainings of id...");
			List<Trainings> trainingDetails = trainingRepository.getAllOnProgressMentor(mentorId);
			return trainingDetails;
	}
	
	
	@GetMapping("/getFinalize/{trainingId}")
	public List<Trainings> getAllFinalize(@PathVariable("trainingId") long trainingId)
	{
			System.out.println("Get all Finalize  Trainings of id...");
			List<Trainings> trainings = trainingRepository.getAllFinalize(trainingId);
			return trainings;
	}
	
	@PutMapping("/getApprove/{trainingId}/{}")
	public ResponseEntity<Trainings> getAllApprove(@PathVariable("trainingId") long trainingId) {
		System.out.println("Update Customer with ID = " + trainingId + "...");

		Optional<Trainings> trainingsData = trainingRepository.findById(trainingId);

		if (trainingsData.isPresent()) {
			Trainings _customer = trainingsData.get();
			_customer.setStatus("approved");
			return new ResponseEntity<>(trainingRepository.save(_customer), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
