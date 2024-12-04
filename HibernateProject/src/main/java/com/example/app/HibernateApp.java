package com.example.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Employee;

public class HibernateApp {
	public static Employee employee;
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory factory = cfg.buildSessionFactory(); // connectuion factory
		
		Session session = factory.openSession(); // connection
		
		employee = session.load(Employee.class, 1); //3 is primary key, we can't retrieve the data without primary key.
		System.out.println(employee);
		
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee(4,"Shrikant","Nagpur");
		session.save(employee);
		transaction.commit();
		
	}

}
