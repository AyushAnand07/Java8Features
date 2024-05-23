package StreamAPI.EmployeeQuestion;

public class Employee {

    private int id;
    private int salary;

    public Employee(int id, int name) {
        this.id = id;
        this.salary = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int name) {
        this.salary = name;
    }
}