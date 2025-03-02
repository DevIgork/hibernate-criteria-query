package ma.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory instance = initSessionFactory();

    private static SessionFactory initSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}
