package TKA.TheKiranAcademy.Service;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TKA.TheKiranAcademy.Dao.StaffDoa;
import TKA.TheKiranAcademy.Entity.Staff;

@Service
public class StaffService {
	@Autowired
	StaffDoa dao;
	
	public List showall() {
		return dao.showall();
	}
	public List<Staff> GetByID(int id) {
		return dao.GetByID(id);
	}
	public String AddRecord(Staff s) {
		return dao.AddRecord(s);
	}
	public List<Staff> GetSalaryGT20(String salary) {
		return dao.GetSalaryGT20(salary);
	}
	public List<Staff> GetExpb1020(String expirience) {
		return dao.GetExpb1020(expirience);
	}
	public List<Staff> GetMax(String salary) {
		return dao.GetMax(salary);
	}
	public String updateStaffRecord(Staff s) {
		return dao.updateStaffRecord(s);
	}
	public List<Staff> GetBypro(String profile) {
		return dao.GetBypro(profile);
	}
	public List<Staff> GetBynoT(String profile) {
		return dao.GetBynoT(profile) ;
	}
	public List<Staff> GetMinS(String salary , String name) {
		return dao.GetMinS(salary , name);
	}
	public List<Staff> GetIDCount(int staffid) {
		return dao.GetIDCount(staffid);
	}
	public String GetminSN(String salary) {
		return dao.GetminSN(salary);
	}

}
