package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repositories.AuthorRepository;

@Controller
public class AuthorController {

	private AuthorRepository authorRepository;
	
	
	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}


	@RequestMapping("/Authors")
	public String getAuthor(Model model) {
		
		model.addAttribute("author",authorRepository.findAll());
		return "authors";
		
	}
	
	
}
