package serviceImpl;

import dao.CompanyDao;
import daoImpl.CompanyDaoImpl;
import entity.Company;
import exception.ShowException;
import org.hibernate.HibernateError;
import service.CompanyService;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    CompanyDao companyDao = new CompanyDaoImpl();

    public CompanyServiceImpl() {}

    @Override
    public boolean addCompany(Company company) {
        boolean isAdded = false;
        try {
            companyDao.addCompany(company);
            isAdded = true;
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return isAdded;
    }

    @Override
    public boolean updateCompany(Company company) {
        boolean isUpdated = false;
        try {
            companyDao.updateCompany(company);
            isUpdated = true;
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return isUpdated;
    }

    @Override
    public boolean deleteCompany(int id) {
        boolean isDeleted = false;
        try {
            companyDao.deleteCompany(id);
            isDeleted = true;
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return isDeleted;
    }

    @Override
    public List<Company> showCompanies() {
        List<Company> companies = null;
        try {
            companies = companyDao.showCompanies();
        }
        catch (HibernateError e) {
            ShowException.showNotice(e);
        }
        return companies;
    }
}
