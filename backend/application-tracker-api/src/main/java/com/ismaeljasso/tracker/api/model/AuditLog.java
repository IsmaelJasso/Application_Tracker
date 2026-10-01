package com.ismaeljasso.tracker.api.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity 
@Table(name = "application_audit_logs")
public class AuditLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "application_id", nullable = false)
	private Application application;
	
	private String oldStatus;
	
	@Column(nullable = false)
	private String newStatus;
	
	private LocalDateTime changedAt;
	
	@PrePersist
	protected void onCreate() {
		changedAt = LocalDateTime.now();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public String getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}

	public String getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}

	public LocalDateTime getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(LocalDateTime changedAt) {
		this.changedAt = changedAt;
	}
	
	

}
