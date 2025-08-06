public class EmployeeMain {
    public static void main(String[] args) {

//        Employee employee1 = new Employee();
//        Employee employee2 = new Employee();
        Employee employee1 = new Employee("John", "Doe", (byte) 22, 'M');
        Employee employee2 = new Employee("Max", "Steve", (byte) 30, 'F');
        Employee employee3 = new Employee();
//        employee.firstName = "John";
//        employee.lastName = "Doe";
//        employee.age = 22;
//        employee.gender = 'M';

        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());

        System.out.println(employee2.getAge());
        System.out.println(employee2.getGender());

        System.out.println(employee3.getAge());
        System.out.println(employee3.getGender());

        System.out.println(Employee.EMPLOYER_NAME);
    }
}
