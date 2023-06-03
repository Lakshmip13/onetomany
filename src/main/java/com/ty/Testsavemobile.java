package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testsavemobile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile mobile=new Mobile();
	    mobile.setBrand("Iphone");
		mobile.setColor("blue");
		mobile.setCost(80000);
		mobile.setRam("8gb");
		
		Mobile mobile1=new Mobile();
		mobile1.setBrand("Samsung");
		mobile1.setColor("black");
		mobile1.setCost(40000);
		mobile1.setRam("4gb");
		
		Sim sim=new Sim();
		sim.setProvider("Jio");
		sim.setType("4g");
		sim.setCost(299);
		sim.setPhno(8310155050l);
		
		Sim sim1=new Sim();
		sim1.setProvider("Airtel");
		sim1.setType("4g");
		sim1.setCost(399);
		sim1.setPhno(8710956558l);
		
		Sim sim2=new Sim();
		sim2.setProvider("BSNL");
		sim2.setType("3g");
		sim2.setCost(199);
		sim2.setPhno(797577524l);
		
		Sim sim3=new Sim();
		sim3.setProvider("VI");
		sim3.setType("4g");
		sim3.setCost(299);
		sim3.setPhno(6362453853l);
		List<Sim> list=new ArrayList<Sim>();
		list.add(sim);
		list.add(sim1);
		List<Sim> list1=new ArrayList<Sim>();
		list1.add(sim2);
		list1.add(sim3);
		
  
		mobile.setSims(list);
		mobile1.setSims(list1);
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(mobile1);

		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(sim3);
		
		entityTransaction.commit();
		
       

		
		
		
		
	}

}
