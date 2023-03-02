package TKA.TheKiranAcademy.Controller;

import java.util.List;

import javax.xml.transform.ErrorListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import TKA.TheKiranAcademy.Entity.Staff;
import TKA.TheKiranAcademy.Service.StaffService;

@RestController
public class StaffController {
	@Autowired
	StaffService service;
	
	@GetMapping("/all")
	public List showall() {
		return service.showall();	
	}
	
	@GetMapping("/byid/{id}")
	public List<Staff> GetByID(@PathVariable int id){
		return service.GetByID(id);
	}
	
	@PostMapping("/add")
	public String AddRecord(@RequestBody Staff s){
		return service.AddRecord(s);
	}
	@GetMapping("/salg20/{salary}")
	public List<Staff> GetSalaryGT20(@PathVariable String salary){
		return service.GetSalaryGT20(salary);	
	}
	@GetMapping("/exp/{expirience}")
	public List<Staff> GetExpb1020(@PathVariable String expirience ){
		return service.GetExpb1020(expirience);	
	}
	@GetMapping("/max/{salary}")
	public List<Staff> GetMax(@PathVariable String salary){
		return service.GetMax(salary);
	}
	@PutMapping("/update")
	public String updateStaffRecord(@RequestBody Staff s) {
		return service.updateStaffRecord(s);		
	}
	@GetMapping("/bypro/{profile}")
	public List<Staff> GetBypro(@PathVariable String profile){
		return service.GetBypro(profile);
	}
	@GetMapping("/noT/{profile}")
	public List<Staff> GetBynoT(@PathVariable String profile){
		return service.GetBynoT(profile);
	}
	
	@GetMapping("/min/{salary}/{name}")
	public List<Staff> GetMinS(@PathVariable String salary , String name) {
		return service.GetMinS(salary,name);	
	}
	@GetMapping("/id/{staffid}")
	public List<Staff> GetIDCount(@PathVariable int staffid ) {
		return service.GetIDCount(staffid);
		
	}
	@GetMapping("/mins/{salary}")
	public String GetminSN(@PathVariable String salary) {
		return service.GetminSN(salary);
		
	}
	

}
