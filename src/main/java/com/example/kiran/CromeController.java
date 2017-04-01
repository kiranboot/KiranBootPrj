package com.example.kiran;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Team;

@RestController
public class CromeController {
	
    private Team team;
    
    @PostConstruct
    public void init(){
    	team = new Team("Kiran");	
    }
	
	@RequestMapping("/getName")
    public Team getName(){
		System.out.println("here-2");
    	return team;
    }

}
