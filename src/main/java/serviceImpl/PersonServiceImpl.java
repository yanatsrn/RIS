package serviceImpl;

import dao.PersonDao;
import daoImpl.PersonDaoImpl;
import entity.Person;
import service.PersonService;

public class PersonServiceImpl implements PersonService {

    PersonDao personDao = new PersonDaoImpl();

    public PersonServiceImpl() {}

    @Override
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }
}
