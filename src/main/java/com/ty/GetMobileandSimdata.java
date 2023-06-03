package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetMobileandSimdata {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query=entityManager.createQuery("select m from Mobile m where m.brand=?2")	;
		query.setParameter(2,"Samsung");
		List<Mobile> list=query.getResultList();
		
		for (Mobile mobile : list) {
			System.out.println("the Mobile id is" +" "+ mobile.getId());
			System.out.println("the Mobile brand is"+" " +mobile.getBrand() );
			System.out.println("the Mobile color is" +" "+mobile.getColor() );
			System.out.println("the Mobile cost is"+" " +mobile.getCost() );
			System.out.println("the Mobile ram is" +" "+mobile.getRam() );
			System.out.println("==============================================" );
		
		List<Sim> con=mobile.getSims();
			
		for (Sim sim1 : con) {
			System.out.println("the sim id is" +" "+ sim1.getId());
			System.out.println("the sim provider is"+" " +sim1.getProvider() );
			System.out.println("the sim cost is" +" "+sim1.getCost() );
			System.out.println("the sim type is"+" " +sim1.getType() );
			System.out.println("the sim phno is" +" "+sim1.getPhno() );
			System.out.println("==================================================");
		}
		}
	}
}
