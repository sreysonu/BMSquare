package com.bmsquare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//import com.bmsquare.entities.EnquireEntity;
import com.bmsquare.service.EnquireService;

@Controller
public class EnquireController {

	@Autowired
	private EnquireService enquireService;

	@GetMapping("/enquire-form")
	public String registration() {
		return "enquire_form";
	}

//	@PostMapping("/enquire_reg")
//	public String enquireRegistration(@ModelAttribute EnquireEntity enquireEntity,
//			RedirectAttributes redirectAttributes) {
//
//		String res = enquireService.saveEnquire(enquireEntity);
//
//		System.out.println("res=>" + res);
//		if ("001".equals(res)) {
//			redirectAttributes.addFlashAttribute("success", "Enquiry saved successfully!");
//		} else {
//			redirectAttributes.addFlashAttribute("error", res);
//		}
//		return "redirect:/enquire-form";
//	}

}
