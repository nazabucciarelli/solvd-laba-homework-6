package models;

import java.util.Arrays;

public class Zoo {
    private static final int CUSTOMERS_CAPACITY = 50; // Using final var.
    private String name;
    private AnimalRoom[] animalRooms;
    private Department[] departments;

    static{ // Using a static block
        System.out.println("The capacity of the zoo is of "
                            + CUSTOMERS_CAPACITY + " customers");
    }

    public Zoo(String name, AnimalRoom[] animalRooms, Department[] departments){
        this.name = name;
        this.animalRooms = animalRooms;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalRoom[] getAnimalRooms() {
        return animalRooms;
    }

    public void setAnimalRooms(AnimalRoom[] animalRooms) {
        this.animalRooms = animalRooms;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zoo zoo = (Zoo) o;

        if (!name.equals(zoo.name)) return false;
        if (!Arrays.equals(animalRooms, zoo.getAnimalRooms())) return false;
        return Arrays.equals(departments, zoo.getDepartments());
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Arrays.hashCode(animalRooms);
        result = 31 * result + Arrays.hashCode(departments);
        return result;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", animalRooms=" + Arrays.toString(animalRooms) +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}
