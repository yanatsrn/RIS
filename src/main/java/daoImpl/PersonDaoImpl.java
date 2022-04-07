package daoImpl;

import dao.PersonDao;
import entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sessionFactory.SessionFactoryImpl;

public class PersonDaoImpl implements PersonDao {

    @Override
    public void addPerson(Person person) {
        try {
            Session session = SessionFactoryImpl.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.save(person);
            tx.commit();
            session.close();
//            isAdded = true;
        }
        catch (NoClassDefFoundError e) {
            System.out.println("Exception: " + e);
        }
    }
}
