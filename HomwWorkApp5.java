package DZ;

public class HomwWorkApp5 {
    public static void main(String[] args) {

        Person person1 = new Person("Вася Жопов, ", "грузчик, ", "joopa@mail.ru", 6006699, 125, 60 );
        Person person2 = new Person("Изя Камушкин, ", "старший грузчик, ","aveme@mail.ru",1234567, 600, 41);
        Person person3 = new Person("Вася Васин, ", "грузчик, ", "rrr@mail.ru", 8974512, 10, 19 );
        Person person4 = new Person("Антон Грушин, ", "старший грузчик, ","123@mail.ru",1952147, 60, 1);
        Person person5 = new Person("Володя Смертин, ", "грузчик, ", "jolyd@mail.ru", 657891, 1, 80 );
        Person person6 = new Person("Дима Гризлов, ", "старший грузчик, ","ogogo@mail.ru",9147536, 99, 40);



        Person[] persons = {person1,person2,person3,person4,person5,person6};
        for (Person person:persons) {
            if ( person.age >= 40) {
            person.printInf();
            }
        }
    }
}

