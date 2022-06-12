package HomeWorkApp11.Phonebook;

public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add(48151623, "Петя");
        phonebook.add(48151621, "Попов");
        phonebook.add(48151623, "Popov");
        phonebook.add(11111111, "Popov");
        phonebook.add(8745612, "Вася");
        phonebook.add(9632587, "Жопов");
        phonebook.add(1234567, "Ноунейм");

        phonebook.get("Попов");
        phonebook.get("Петя");
        phonebook.get("Popov");
        phonebook.get("Noname");
        phonebook.get("Жопов");
    }
}
