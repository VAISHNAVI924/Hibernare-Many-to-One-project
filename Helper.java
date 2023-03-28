package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Helper {
public static void name( String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("Amazonorder");
EntityManager em=emf.createEntityManager();	
EntityTransaction et=em.getTransaction();

AmazonOrder amz=new AmazonOrder();


}
}