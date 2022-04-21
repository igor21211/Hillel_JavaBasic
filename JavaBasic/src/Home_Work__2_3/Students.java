package Home_Work__2_3;

public class Students {
    String name;
    String surname;
    String Fakultet;
    double age;
    double course;
    double Mathematics;
    double History;
    double Geography;
    double Chemistry;
    double Physics;

    public Students(String name, String surname, double mathematics, double history, double geography, double chemistry, double physics) {
        this.name = name;
        this.surname = surname;
        Mathematics = mathematics;
        History = history;
        Geography = geography;
        Chemistry = chemistry;
        Physics = physics;
    }

    public Students(String name, String surname, String fakultet, int age, int course) {
        this.name = name;
        this.surname = surname;
        Fakultet = fakultet;
        this.age = age;
        this.course = course;

    }

    public Students(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Students(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Fakultet='" + Fakultet + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    public static void showInfo(Students student){
        System.out.println(student.toString());
    }

    public static double showSrednieArifmeticheskoe(Students student){
        return (student.Chemistry + student.Mathematics + student.Geography + student.History + student.Physics) / 5;
    }
    public static void scholarship(double grade){
        if (grade < 5 ){
            System.out.println("Dont have any grade");
        }else if(grade < 7 && grade > 5){
            System.out.println("You'r grade is 600$");
        }else if (grade < 8 && grade > 7 ){
            System.out.println("You'r grade is 800$");
        }else if (grade > 9){
            System.out.println("You'r grade is 1000$");
        }

    }




    public static void main(String[] args) {
//        Students st1 = new Students("Игорь","Shpura","Mathematiks",32,2);
//        Students st2 = new Students("Сергей");
//        Students st3 = new Students("Виталий", "Иванов",23);
        // Создание 3 класов и вызов метода шоу инфо с методом ту стринг
//        showInfo(st1);
//        showInfo(st2);
//        showInfo(st3);
        //Создания 3 класов с значениями(оценками) по предметах
        Students st4 = new Students("Олег", "Петров",7.8,9.0,5.6,7.8,8.9);
        Students st5 = new Students("Тарас", "Обухов",8.8,10.0,9.4,9.8,10.9);
        Students st6 = new Students("Виталий", "Петросян",8.8,6.0,6.3,5.8,4.9);
        //Вызов метода для подсчета средне армифметичное для студента
        System.out.println("Имя студента: " + st4.name + " ,Фамилия студента: " + st4.surname +  " ,Среднее арифметическая оценка студента:  " + showSrednieArifmeticheskoe(st4));
        System.out.println("Имя студента: " + st5.name + " ,Фамилия студента: " + st5.surname +  " ,Среднее арифметическая оценка студента:  " + showSrednieArifmeticheskoe(st5));
        System.out.println("Имя студента: " + st6.name + " ,Фамилия студента: " + st6.surname +  " ,Среднее арифметическая оценка студента:  " + showSrednieArifmeticheskoe(st6));
        //Вызов статического метода в статическом методе, в одном методе мы определяем средне арифметическое студента во втором операясь на резульат первого метода мы начисляем ему стипендию
        scholarship(showSrednieArifmeticheskoe(st4));
        scholarship(showSrednieArifmeticheskoe(st5));
        scholarship(showSrednieArifmeticheskoe(st6));
    }
}
