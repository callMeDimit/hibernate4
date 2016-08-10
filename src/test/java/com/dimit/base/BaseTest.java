package com.dimit.base;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.dimit.base.entity.Event;
import com.dimit.util.HibernateUtil;

public class BaseTest {

	@Test
	public void testSave() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(Event.valueOf("title", new Date()));
		session.getTransaction().commit();
		sf.close();
	}
	
	@Test
	public void testList() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		List list = session.createQuery("from Event").list();
		list.forEach((u) -> {
			System.out.println(u);
		});
		session.getTransaction().commit();
		sf.close();
	}
	
	@Test
	public void findList() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		List list = session.createQuery("select e from Event e").list();
		list.forEach((u) -> {
			System.out.println(u);
		});
		session.getTransaction().commit();
		sf.close();
	}

}
