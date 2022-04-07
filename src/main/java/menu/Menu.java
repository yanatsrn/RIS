package menu;

import entity.Person;

import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    Scanner in = new Scanner(System.in);

    public void IntroducingMenu() {
        String choice = "0";
        while (Integer.parseInt(choice) != 3) {
            String s = "Меню\n" +
                    "1. Войти\n" +
                    "2. Зарегистрироваться\n" +
                    "3. Выход\n" +
                    "Выбор: ";
            System.out.println(s);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("cool");
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Проверьте корректность ввода!");
                    choice = "0";
                    break;
            }
        }
    }

    public void AdminMenu() {
        String choice = "0";
        while (Integer.parseInt(choice) != 3) {
            String s = "Меню админа\n" +
                    "1. Работа с пользователями\n" +
                    "2. Работа с машинами\n" +
                    "3. Выход\n" +
                    "Выбор: ";
            System.out.println(s);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("user");
                    break;
                case "2":
                    System.out.println("cars and companies");
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Проверьте корректность ввода!");
                    choice = "0";
                    break;
            }
        }
    }

    public void UserMenu() {
        String choice = "0";
        while (Integer.parseInt(choice) != 5) {
            String s = "Меню пользователя\n" +
                    "1. Просмотреть все компании\n" +
                    "2. Просмотреть все модели машин\n" +
                    "3. Найти компанию по ID\n" +
                    "4. Найти модель машины по ID\n" +
                    "5. Выход\n" +
                    "Выбор: ";
            System.out.println(s);
            choice = in.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("all companies");
                    break;
                case "2":
                    System.out.println("all cars");
                    break;
                case "3":
                    System.out.println("findCompany");
                    break;
                case "4":
                    System.out.println("findCar");
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Проверьте корректность ввода!");
                    choice = "0";
                    break;
            }
        }
    }
}
