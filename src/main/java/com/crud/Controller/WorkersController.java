package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.Entity.Workers;
import com.crud.services.WorkersService;

@Controller
public class WorkersController {
	
	
	@Autowired
	private WorkersService workersService;
	
	
	//http://localhost:8080/createWorkers
	
	@RequestMapping("/createWorkers")
	public String createWorkersForm() {
		return"create_registration";
	}
	
	
	@RequestMapping("/saveWorkers")
	public String saveWorkers(Workers workers, ModelMap model) {
		workersService.saveWorkers(workers);
		model.addAttribute("msg" , "Record is saved!");
		return"create_registration";
	}
	
	//http://localhost:8080/listWorkers
	@RequestMapping("/listWorkers")
	public String listWorkers(ModelMap model) {
		List<Workers> workers = workersService.findAllWorkers();
		 model.addAttribute("workers", workers);
		return"list_registration";
	}
	
	@RequestMapping("/delete")
	public String deleteWorkers(@RequestParam("id")long id,ModelMap model) {
		workersService.deleteWorkersbyId(id);
		List<Workers> workers = workersService.findAllWorkers();
		 model.addAttribute("workers", workers);
		return"list_registration";
	}
	
	@RequestMapping("/update")
	public String findWorkersById(@RequestParam("id")long id,ModelMap model) {
		Workers workers = workersService.findById(id);
		model.addAttribute("works", workers);
		return"update";
	}
	
	@RequestMapping("/updateWork")
	public String updateWorkers(Workers work, ModelMap model) {
		workersService.updateWorkers(work);
		List<Workers> workers = workersService.findAllWorkers();
		 model.addAttribute("workers", workers);
		return"list_registration";
		
		
	}
	
	

}
