package com.alergiasprontuario.utils;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Utils {
	
	@PersistenceContext
	EntityManager em;
			  
    public  Object getDateTime(){
    javax.persistence.Query q =  em.createNamedQuery("DateTime.getDateTime");      
	      	   return q.getSingleResult();
	
    } 
         
}
