//package com.bmsquare.entities;
//
//import java.util.Date;
//
//import org.hibernate.annotations.CreationTimestamp;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
//import lombok.Data;
//
//@Entity
//@Data
//@Table(name = "enquireForm")
//public class EnquireEntity {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
//
//	@Column(name = "Name",columnDefinition = "VARCHAR(70)")
//	private String name;
//
//	@Column(name = "emailId",columnDefinition = "VARCHAR(90)")
//	private String emailId;
//
//	@Column(name = "contact",columnDefinition = "VARCHAR(30)")
//	private String contact;
//
//	@Column(name = "state",columnDefinition = "VARCHAR(80)")
//	private String state;
//
//	@Column(name = "course",columnDefinition = "VARCHAR(30)")
//	private String course;
//
//	@Column(name = "IpAddress",columnDefinition = "VARCHAR(100)")
//	private String IpAddress;
//
//	@CreationTimestamp
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(nullable = false, updatable = false, insertable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
//	Date created_at;	
//}
