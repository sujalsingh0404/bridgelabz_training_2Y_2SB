import java.util.*;

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // equals & hashCode should be overridden to use as Map keys
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department that = (Department) obj;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Employee {
    String name;
    Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {

        Department d1 = new Department("IT");
        Department d2 = new Department("HR");
        Department d3 = new Department("Finance");

        List<Employee> employees = Arrays.asList(
                new Employee("John", d1),
                new Employee("Emma", d2),
                new Employee("Mike", d1),
                new Employee("Sophia", d3),
                new Employee("Lucas", d2)
        );

        Map<Department, List<Employee>> deptMap = groupByDepartment(employees);

        // Display Result
        for (Map.Entry<Department, List<Employee>> entry : deptMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<Department, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {
            map.computeIfAbsent(emp.department, d -> new ArrayList<>()).add(emp);
        }
        return map;
    }
}
