package com.TangerineDigital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TangerineDigital.model.TaskAccount;
import com.TangerineDigital.service.TaskService;

@RestController
@RequestMapping("/bts")
public class TaskController {
   
	private final TaskService taskService;
   private TaskAccount taskAccount;
	   
   public TaskController(TaskService taskService) {
       this.taskService = taskService;
   }
   
    @PostMapping("/insert")
    public String insertValue(@RequestParam int value) {
    	return taskService.insert(taskAccount,value);
    }

    @GetMapping("/search")
    public String searchValue(@RequestParam int value) {
    	return taskService.search(taskAccount,value);
    }
    
    @PostMapping("/delete")
    public String deleteValue(@RequestParam int value) {
    	return taskService.delete(taskAccount,value);
    }
    @PostMapping("/stats")
    public String statsValue(@RequestParam int value) {
    	return taskService.statsValue(taskAccount,value);
    }

    
}