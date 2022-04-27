package DZ;
/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Person {
        String fullName;
        String position;
        String email;
        int tel;
        int salary;
        int age;
   public Person(String fullName, String position, String email, int tel, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    void printInf() {
        System.out.println(this.toString());
    }

    public String toString() {
        return String.format("Сотрудник - %s, возраст - %d, работает на должности - %s c окладом - %d \n контактные данные, телефон - %d ; email - %s", fullName, age, position, salary, tel, email);
    }
}
