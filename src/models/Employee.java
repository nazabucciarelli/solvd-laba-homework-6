package models;

import interfaces.IWork;

public class Employee extends Person implements IWork {
    private int entryYear;
    private double salary;

    public Employee(String id, String firstName, String lastName, Gender gender,
                    Country country, int entryYear, double salary) {
        super(id, firstName, lastName, gender, country);
        this.entryYear = entryYear;
        this.salary = salary;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void walk() {
        System.out.println("I can walk down the streets from the Zoo and "
                            +  "also enter to only-employees rooms.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        if (entryYear != employee.entryYear) return false;
        return Double.compare(salary, employee.salary) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + entryYear;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "entryYear=" + entryYear +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", country=" + country +
                '}';
    }

    @Override
    public void work() {
        System.out.println("I am an employee from the zoo!");
    }
}
