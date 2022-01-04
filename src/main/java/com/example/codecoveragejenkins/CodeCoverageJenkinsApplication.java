package com.example.codecoveragejenkins;

import com.example.codecoveragejenkins.services.Palindrome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodeCoverageJenkinsApplication {

	@Autowired
	Palindrome palindrome;


	@GetMapping(
			path = "/palindrome",
			params = {"name"})
	public Boolean checkPalindrome(
			@RequestParam final String name) {
		return palindrome.isPalindrome(name);
//		return true;
		}





	public static void main(String[] args) {
		SpringApplication.run(CodeCoverageJenkinsApplication.class, args);
	}

}
