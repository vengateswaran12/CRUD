package cartProject.Cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class Control {

	@Autowired
	private Repo repo;
	
	@GetMapping("/getAll")
	public List<User> get(){
		return repo.findAll(); 
	}
}
