package lesson05;

public class Person {

// Атрибуты класса
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

// "скелет" объекта
    public Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    //метод, который выводит информацию об объекте в консоль
    public void info(){
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        persArray();
    }

// создаем массив из объектов, тут же присваиваем параметры атрибутам
    private static void persArray() {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Nikita", "Senior manager", "n.sidelnik@efko.ru", "79051780880", 66800, 31);
        persArray[1] = new Person("Sergey", "Boss", "s.drozd@efko.ru", "79107425321", 105123, 41);
        persArray[2] = new Person("Pavel", "Director", "p.mezenov@efko.ru", "79051234565", 150000, 40);
        persArray[3] = new Person("Danil", "Junior manager", "d.plehanov@efko.ru", "7321654988", 42000, 22);
        persArray[4] = new Person("Oleg", "Junior manager", "o.anrdiyashkin@efko.ru", "79059874422", 42000, 25);
        ageCheck(persArray);
    }
// получился метод внутри метода, хотя наверное это не имеет особого смысла
    // метод перебора объектов массива и проверки атрибута "age" на выполнение условий
    // если условия выполняются, инфа об объекте выводится в консоль
    private static void ageCheck(Person[] persArray) {
        for (int i = 0; i < 5; i++) {
          if (persArray[i].age >= 40){
              persArray[i].info();
          }
        }
    }


}


