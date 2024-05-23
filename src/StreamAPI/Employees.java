package StreamAPI;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Employees {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private String city;
    private int rank;
    private List<String> contacts;

    public Employees(int id, String name, int age, String gender, String department, String city, int rank, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }

    public static void main(String[] args) throws IOException {
        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(new Employees(1, "Ayush", 28, "Male", "Btech", "Lucknow", 25, Arrays.asList("96512212", "423334")));
        employeesList.add(new Employees(2, "Suyash", 28, "Male", "Btech", "Lucknow", 125, Arrays.asList("96512212")));
        employeesList.add(new Employees(3, "Kevin", 28, "Male", "MBA", "Kanpur", 55, Arrays.asList("4566727", "423334")));
        employeesList.add(new Employees(4, "Mridul", 28, "Male", "Biotech", "Mumbai", 205, Arrays.asList("2334663")));
        employeesList.add(new Employees(5, "Nishi", 28, "Female", "ELectonics", "Delhi", 100, Arrays.asList("937363", "22376")));

        //Find students whose ranks are between 50 and 100
        List<Employees> rank = employeesList.stream().filter(employees -> employees.getRank() > 50 && employees.getRank() < 100).toList();
        System.out.println(rank);

        //Find students staying in Lucknow and sort them by their names
        List<Employees> city = employeesList.stream().filter(name -> name.getCity().equals("Lucknow"))
                .sorted(Comparator.comparing(Employees::getName)).toList();
        System.out.println(city);

        //Find all department names
        List<String> department = employeesList.stream().map(Employees::getDepartment).distinct().toList();
        System.out.println(department);

        //Find all contact numbers
        //List<String> contact = employeesList.stream().map(Employees::getContacts).toList();
        //It will give error as one employee can have multiple contacts so map wont work as its concept is one output for one input

        List<String> contact = employeesList.stream().flatMap(employees -> employees.getContacts().stream()).toList();
        System.out.println(contact);

        //Group Employees by departments
        Map<String, List<Employees>> depgroup = employeesList.stream().collect(Collectors.groupingBy(Employees::getDepartment));
        //Used map since department names will act as key and values will be the employee list
        System.out.println(depgroup);


        //Group Employees by departments and give total count in each department
        Map<String, Long> dc = employeesList.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()));
        System.out.println(dc);

        //Find Department with max students
        Map.Entry<String, Long> maxdep = employeesList.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(maxdep);

        //Find average of male and female students
        Map<String, Double> s= employeesList.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.averagingInt(Employees::getAge)));
        System.out.println(s);

        //Find the highest rank in each department
        Map<String, Optional<Employees>> n =employeesList.stream().collect(Collectors.groupingBy(Employees::getDepartment,Collectors.minBy(Comparator.comparing(Employees::getDepartment))));
        System.out.println(n);
    }
}
