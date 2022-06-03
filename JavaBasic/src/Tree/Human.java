package Tree;

import java.util.Objects;

public class Human {
    String surname;
    String name;
    String father;
    String mother;

    public Human(String surname, String name, String father, String mother) {
        this.surname = surname;
        this.name = name;
        this.father = father;
        this.mother = mother;
    }



    public Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, father, mother);
    }

    @Override
    public String toString() {
        return "\nHuman{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                '}';
    }
}
