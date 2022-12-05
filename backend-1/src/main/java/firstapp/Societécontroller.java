package firstapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class Societécontroller {

	@Autowired
	private SocietéRepository soc;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/societé")
	 public List<Sociéte> GetAll(){
		 return soc.findAll();
//public String getAll() {
	//return("hello");	
}
	
}
