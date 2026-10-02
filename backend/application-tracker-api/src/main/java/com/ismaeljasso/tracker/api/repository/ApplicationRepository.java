package com.ismaeljasso.tracker.api.repository;

import com.ismaeljasso.tracker.api.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Long>{

}
