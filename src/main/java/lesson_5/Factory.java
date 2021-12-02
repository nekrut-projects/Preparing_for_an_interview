package lesson_5;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
    public final static SessionFactory getFactory(){
        Configuration conf = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = conf.buildSessionFactory();
        return sessionFactory;
    }
}
