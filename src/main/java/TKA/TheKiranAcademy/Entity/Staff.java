package TKA.TheKiranAcademy.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	int staffid;
	String name;
	String salary;
	String profile;
	String expirience;
	
	@Id
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getExpirience() {
		return expirience;
	}
	public void setExpirience(String expirience) {
		this.expirience = expirience;
	}
	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", name=" + name + ", salary=" + salary + ", profile=" + profile
				+ ", expirience=" + expirience + "]";
	}
	
	

}
