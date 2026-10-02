package com.ismaeljasso.tracker.api.controller;

import com.ismaeljasso.tracker.api.model.Application;
import com.ismaeljasso.tracker.api.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin(origins = "*")
public class ApplicationController {
	
	private final ApplicationService service;
	
	public ApplicationController(ApplicationService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Application> getAll(){
		return service.getAllApplications();
	}
	
	@PostMapping
	public Application create(@RequestBody Application application) {
		return service.createApplication(application);
	}
}
