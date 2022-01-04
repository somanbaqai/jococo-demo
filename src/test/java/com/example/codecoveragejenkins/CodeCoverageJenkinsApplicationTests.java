package com.example.codecoveragejenkins;

import com.example.codecoveragejenkins.services.Palindrome;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class CodeCoverageJenkinsApplicationTests {
	@Autowired
	Palindrome palindrome;

	@Autowired
	CodeCoverageJenkinsApplication codeCoverageJenkinsApplication;

	@Test
	public void checkPalindromeViaService() {

		assertTrue(palindrome.isPalindrome(""));
	}

	@Test
	public void checkPalindromeViaController() {
		assertTrue(codeCoverageJenkinsApplication.checkPalindrome(""));
	}

}
