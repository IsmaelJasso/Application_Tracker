package com.ismaeljasso.tracker.api.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "emails")
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "application_id", nullable = false)
	private Application application;
	
	@Column(unique = true, nullable = false)
	private String gmailMessageId;
	
	private String subject;
	private LocalDateTime recievedDate;
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public String getGmailMessageId() {
		return gmailMessageId;
	}
	public void setGmailMessageId(String gmailMessageId) {
		this.gmailMessageId = gmailMessageId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public LocalDateTime getRecievedDate() {
		return recievedDate;
	}
	public void setRecievedDate(LocalDateTime recievedDate) {
		this.recievedDate = recievedDate;
	}
	
	
}
