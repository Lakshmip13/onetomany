package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteSim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
//		Mobile mobile=entityManager.find(Mobile.class,1);
//		
//		entityManager.remove(mobile);
		
		Sim sim=entityManager.find(Sim.class,1);
		entityManager.remove(sim);
		
		
		
		entityTransaction.commit();
			}

}
