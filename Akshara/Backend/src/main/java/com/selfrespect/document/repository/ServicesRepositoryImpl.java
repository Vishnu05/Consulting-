package com.selfrespect.document.repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ServicesRepositoryImpl implements ServicesRepositoryCustom  {
	
	@PersistenceContext
	private EntityManager em;

 
	
	@Override
	public int countCustom() { 
		/*JPQLQuery query = new JPAQuery(em);
		return (int) query.from(QPerson.person).where(QPerson.person.id.isNotNull()).count();*/
		
		return 1;
	}

}
