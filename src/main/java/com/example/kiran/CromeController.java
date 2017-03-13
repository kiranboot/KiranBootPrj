package com.example.kiran;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CromeController {
	
	@RequestMapping("/getName")
    public @ResponseBody String getName(){
    	return "Kiran";
    }

}
