package com.TangerineDigital.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.TangerineDigital.Repository.TaskRepository;
import com.TangerineDigital.model.TaskAccount;

@Service
public class TaskService {
	 private final TaskRepository TaskRepository;
	
	 public TaskService(TaskRepository TaskRepository) {
	        this.TaskRepository = TaskRepository;
	    }
	 public Optional<TaskAccount> beforeInsert(int Value) {
	        return TaskRepository.findValue(Value);
	    }
    public String insert(TaskAccount TaskAccount,int value) {
    	if (TaskAccount.getValue() == value) {
    		return "Duplicate Value";
    	} else 
    		TaskRepository.save(TaskAccount);
    	
    	return "Successfylly added";
    }
    
    public String search(TaskAccount TaskAccount,int value) {
    	if (TaskAccount.getValue() != value) {
    		return "Value doesnot exists";
    	} 
        return "Value exists";
    }
    
    public String delete(TaskAccount TaskAccount,int value) {
    	if (TaskAccount.getValue() != value) {
    		return "Value doesnot exists";
    	} else 
    		TaskRepository.delete(TaskAccount);
        return "Successfylly deleted";
    }
    
    public String statsValue(TaskAccount TaskAccount,int value) {
    	Optional<TaskAccount>  size =  TaskRepository.getAllCount();
    	
    	// pending
    	if (TaskAccount.getValue() != value) {
    		return "Value doesnot exists";
    	} else 
    		TaskRepository.delete(TaskAccount);
        return "Successfylly deleted";
    }
  
}