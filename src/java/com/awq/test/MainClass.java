package com.awq.test;

import com.awq.dto.CategoryMaster;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.awq.dto.EventLogger;
import com.awq.dto.UserProfiler;
import java.util.List;
import org.hibernate.Query;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session=null;
		SessionFactory factory = null;

		EventLogger evlogger = new EventLogger();
		evlogger.setRequest_id("8860057744sadasds");

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(new Configuration().configure().getProperties()).buildServiceRegistry();
		factory = new Configuration().configure().buildSessionFactory(serviceRegistry);

		session = factory.openSession();
		session.beginTransaction();
                
                String category="BHAKTI";
                String userid="8860057744";

                UserProfiler userProfiler = new UserProfiler(category,userid);
                userProfiler.setUserProfile(session, userProfiler);

                System.out.println(userProfiler.getUserProfile(session, userid, category).getUserid());

               

                CategoryMaster categorymaster = new CategoryMaster();
                categorymaster.setCategory("BHAKTI");
                session.save(categorymaster);
                System.out.println("GetCategory ID " + categorymaster.getCategoryID(session, "BHAKTI"));
		session.save(evlogger);
		session.getTransaction().commit();
		session.close();





	}



}
