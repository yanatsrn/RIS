package daoImpl;

import dao.CarDao;
import entity.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sessionFactory.SessionFactoryImpl;

public class CarDaoImpl implements CarDao {

    @Override
    public boolean addCar(Car car) {
        boolean isAdded = false;
        try {
            Session session = SessionFactoryImpl.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.save(car);
            tx.commit();
            session.close();
            isAdded = true;
        }
        catch (NoClassDefFoundError e) {
            System.out.println("Error: " + e);

        }
        return isAdded;
    }
}
