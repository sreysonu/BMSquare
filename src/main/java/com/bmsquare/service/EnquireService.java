package com.bmsquare.service;

import java.net.InetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.bmsquare.entities.EnquireEntity;
//import com.bmsquare.repository.EnquireRepository;

@Service
public class EnquireService {

//	@Autowired
//	private EnquireRepository enquireRepository;
//
//	public String saveEnquire(EnquireEntity enquireEntity) {
//
//		try {
//
//			if (enquireEntity.getName().equals("") && enquireEntity.getName().isEmpty()) {
//				return "Please enter Name!";
//			}
//			if (enquireEntity.getEmailId().equals("") && enquireEntity.getEmailId().isEmpty()) {
//				return "Please enter Email-id !";
//			}
//			if (enquireEntity.getContact().equals("") && enquireEntity.getContact().isEmpty()) {
//				return "Please enter Contact Number !";
//			}
//
//			String getIp = InetAddress.getLocalHost().toString();
//			enquireEntity.setIpAddress(getIp);
//			EnquireEntity existingEnquire = enquireRepository.findByEmailId(enquireEntity.getEmailId());
//
//			if (existingEnquire != null) {
//				return "Email already exists.";
//			}
//
//			enquireRepository.save(enquireEntity);
//			return "001";
//		} catch (Exception e) {
//			return "Data Not Saved. Try Again!";
//		}

//	}

}
