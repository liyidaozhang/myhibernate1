package com.hsp.view;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import com.hsp.domain.Employee;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setId(4);
		employee.setName("liyi");
		employee.setEmail("958340060@qq.com");
		employee.setHireDate(new Date());
		session.save(employee);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
