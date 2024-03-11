**Урок 6. Хранение и обработка данных ч3: множество коллекций Set**
Формат сдачи: ссылка на подписанный git-проект.

Задание

Реализуйте структуру телефонной книги с помощью HashMap.

Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.

Вывод должен быть отсортирован по убыванию числа телефонов.

метод печати void printBook() 
метод печати отсортированной книгиvoid getAllContacts() 
метод добавления контакта add(String name, Integer number)
метод добавления номера к существующему контакту void add(String name, Integer number)
метод удаления контакта void deleteContact(String name)
метод удаления номера из контакта void deleteNumber(String name, int number)
поиск List<Integer> find(String name)
