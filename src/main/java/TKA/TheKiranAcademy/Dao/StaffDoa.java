package TKA.TheKiranAcademy.Dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import TKA.TheKiranAcademy.Entity.Staff;

@Repository
public class StaffDoa {
	@Autowired
	SessionFactory sf;
	public List showall() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		return criteria.list();
	}

	public List<Staff> GetByID(int id) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.eq("id", id));
		List<Staff> list = criteria.list();
		return list ;
	}

	public String AddRecord(Staff s) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(s);
		tr.commit();
		return "Data saved";
	}

	public List<Staff> GetSalaryGT20(String salary) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.gt("salary", salary));
		List<Staff> list = criteria.list();
		return list;
	}

	public List<Staff> GetExpb1020(String expirience) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.between("expirience", "10", "20"));
		List<Staff> list = criteria.list();
		return list;
	}

	public String updateStaffRecord(Staff s) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(s);
		tr.commit();
		return "data update ";
	}

	public List<Staff> GetBypro(String profile) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.eq("profile", profile));
		List<Staff> list = criteria.list();
		return list ;	}

	public List<Staff> GetBynoT(String profile) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.ne("profile", profile));
		List<Staff> list = criteria.list();
		return list ;
	}

	public  List<Staff> GetMax(String salary) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.setProjection(Projections.max("salary"));
		List<Staff> list = criteria.list();
		return list;
	}

	public List<Staff> GetMinS(String salary, String name) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.setProjection(Projections.min("salary"));
		List<Staff> list = criteria.list();
		return list;
	}

	public List<Staff> GetIDCount(int staffid) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.setProjection(Projections.count("staffid"));
		List<Staff> list = criteria.list();
		return list;
	}

	public String GetminSN(String salary) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.addOrder(Order.asc(salary));
		List<Staff> list = criteria.list();
		return list +" "+ list.get(0);	
	}

}
