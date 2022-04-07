package daoImpl;

import com.mysql.cj.jdbc.exceptions.SQLError;
import dao.CompanyDao;
import entity.Company;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sessionFactory.SessionFactoryImpl;

import java.sql.SQLException;
import java.util.List;

public class CompanyDaoImpl implements CompanyDao {

    public CompanyDaoImpl() {
    }

    @Override
    public boolean addCompany(Company company) {
        boolean isAdded = false;
        try {
            Session session = SessionFactoryImpl.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();
            session.save(company);
            tx1.commit();
            session.close();
            isAdded = true;
        }
        catch (NoClassDefFoundError e) {
            System.out.println("Exception: " + e);
        }
        return isAdded;
    }

    @Override
    public boolean updateCompany(Company company) {
        boolean isUpdated = false;
        try {
            Session session = SessionFactoryImpl.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.update(company);
            tx.commit();
            session.close();
            isUpdated = true;
        }
        catch (NoClassDefFoundError e) {
            System.out.println("Exception: " + e);
        }
        return isUpdated;
    }

    @Override
    public boolean deleteCompany(int id) {
        boolean isDeleted = false;
        try {
            Session session = SessionFactoryImpl.getSessionFactory().openSession();
            Company company = session.load(Company.class, id);
            Transaction tx = session.beginTransaction();
            session.delete(company);
            tx.commit();
            session.close();

            isDeleted = true;
        }
        catch (NoClassDefFoundError e) {
            System.out.println("Exception: " + e);
        }
        return isDeleted;
    }

    @Override
    public List<Company> showCompanies() {
        List<Company> companies = (List<Company>)SessionFactoryImpl.getSessionFactory().openSession().createQuery("From Company").list();
        return companies;
    }
}
