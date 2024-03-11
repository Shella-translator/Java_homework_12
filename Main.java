import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Создание и добавление
        PhoneBook phoneBook = new PhoneBook("Вася", new ArrayList<>(Arrays.asList(8001123, 8001111)));
        phoneBook.add("Пушкин", 890080077);
        phoneBook.add("Лермонтов", 890081177);
        phoneBook.add("Пелевин", 890082000);
        phoneBook.add("Пелевин", 900000);
        phoneBook.add("Пелевин", 890022220);

        //Вывод и отсортированный вывод
        phoneBook.printBook();
        System.out.println("-------------");
        phoneBook.getAllContacts();
        System.out.println("-------------");

        //Удалине котакта и удаление номера
        phoneBook.deleteContact("Пушкин");
        phoneBook.deleteNumber("Пелевин", 900000);

        //Добавление номера
        phoneBook.add("Вася",98798777);

        //Поиск по имени
        System.out.println("phoneBook.find(\"Вася\") = " + phoneBook.find("Вася"));

        //Вывод отсортированной книги
        System.out.println("-------------");
        phoneBook.getAllContacts();



    }
}
