package com.ismaeljasso.tracker.api.service;

import com.ismaeljasso.tracker.api.model.Application;
import com.ismaeljasso.tracker.api.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
	
	private final ApplicationRepository repository;
	
	public ApplicationService(ApplicationRepository repository) {
		this.repository = repository;
	}
	
	public List<Application> getAllApplications(){
		return repository.findAll();
	}

	public Application createApplication(Application application) {
		return repository.save(application);
	}
}
