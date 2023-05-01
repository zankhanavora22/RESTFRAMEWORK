package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.modelclass.model;

@Repository
@Component
public class dao {

	private HibernateTemplate hibernatetemplate;

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	@Transactional
	public void insertuser(model m) {
		this.hibernatetemplate.saveOrUpdate(m);
	}

	@Transactional
	public void deleteUser(model m) {
		this.hibernatetemplate.delete(m);
	}

	public model getUserById(int id) {
		return this.hibernatetemplate.get(model.class, id);
	}

	public List<model> getAllUser() {
		List<model> list = this.hibernatetemplate.loadAll(model.class);
		return list;
	}

	public interface UserDao {

		void register(model user);

		model validateUser(model login);
	}

}
