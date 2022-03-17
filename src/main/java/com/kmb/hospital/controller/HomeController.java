package com.kmb.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.kmb.hospital.model.Hospital;
import com.kmb.hospital.repository.HospitalRepository;

@Controller
public class HomeController {

	@Autowired
	HospitalRepository hr;

	@GetMapping("hospital")
	public String hospList(@RequestParam("page") int page, Model model) {

		int startPage = (page - 1) / 10 * 10 + 1;
		int endPage = startPage + 9;
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", page);

		Pageable pa = PageRequest.of(page - 1, 10);

		List<Hospital> listh = hr.findAll(pa).getContent();
		model.addAttribute("list", listh);
		return "home";
	}

}
