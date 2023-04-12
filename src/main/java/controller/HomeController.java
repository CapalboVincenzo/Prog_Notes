package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;






@Controller
public class HomeController {
	
	
	
	@GetMapping (value = "/home")
	public String home() {
		return "index";
	}
	@PostMapping(value = "/home")
	public String createFold(@RequestParam(name = "nameFolder") String nameFolder) {
		System.out.println("Folder = " + nameFolder);
		return "index";
	}
}
