public class Employee {
    private int age;
    private String firstName;
    private String lastName;
    private double salary;
    private String position;

    public Employee(int age, String firstName, String lastName, double salary, String position) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.position = position;
    }

    public Employee(int age, String firstName, String lastName, String position) {
        this(age, firstName, lastName, 50.0, position);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean olderThan(Employee e) {
        return this.age > e.age;
    }

    public void upgrade(double salary) {
        this.salary += salary;
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        if (!firstName.equals(employee.firstName)) return false;
        return lastName.equals(employee.lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }
}
