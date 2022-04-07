import entity.Company;
import entity.Person;
import menu.Menu;
import service.CompanyService;
import service.PersonService;
import serviceImpl.CompanyServiceImpl;
import serviceImpl.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonServiceImpl();
        Person person = new Person("Shimboretskaya", "Ksu", 21, "+375295673344", "wef123@gmail.com");
        personService.addPerson(person);
//        Menu startMenu = new Menu();
//        startMenu.IntroducingMenu();
//        CompanyService companyService = new CompanyServiceImpl();
//        CarService carService = new CarServiceImpl();
//        Company company = new Company("BMW", "Germany");
//        companyService.addCompany(company);
//        Car car = new Car("X6", 2016, 50, "Бензин", "4.1", 5200);
//        car.setCompany(company);
//        company.addCar(car);
//        companyService.updateCompany(company);
//        List<Company> companyList = companyService.showCompanies();
//        for (Company c: companyList) {
//            System.out.println(c);
//        }
//        companyService.deleteCompany(5);
    }
}
