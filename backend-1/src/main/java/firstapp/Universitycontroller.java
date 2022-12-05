package firstapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Universitycontroller {

	@Autowired
	private UniversityRepository univ;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/university")
	 public List<University> GetAll(){
		 return univ.findAll();

}
	@PostMapping("/addEtab")
	public University adduniv(@RequestBody University univer) {
	     return univ.save(univer);
	}
	
}
