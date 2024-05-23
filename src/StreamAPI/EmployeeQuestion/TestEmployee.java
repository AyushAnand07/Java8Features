package StreamAPI.EmployeeQuestion;
//Sort employees based on salary in descending order
//Fetch top 3 salary employee details
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, 500));
        employeeList.add(new Employee(2, 100));
        employeeList.add(new Employee(3, 750));
        employeeList.add(new Employee(4, 280));
        employeeList.add(new Employee(5, 125));

        //(o1,o2)->o2.getSalary()- o1.getSalary is a comparator to sort in descending order
       // List<Employee> ep= employeeList.stream().sorted((o1, o2) -> o2.getSalary()- o1.getSalary()).collect(Collectors.toList());

        //limit() helps us to get values from index 0 < N
       List<Employee> ep= employeeList.stream().sorted((o1, o2) -> o2.getSalary()- o1.getSalary()).limit(3).collect(Collectors.toList());
        System.out.println(ep);
    }
}

