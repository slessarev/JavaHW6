public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee(30, "Ivan", "Ivanov", 50000.0, "Manager");
        Employee worker2 = new Employee(28, "Petr", "Sidorov", "Engineer");

        System.out.println(worker1.getFullName());
        System.out.println(worker2.getFullName());
        System.out.println(worker1.olderThan(worker2));

        worker1.upgrade(2000.0);
        System.out.println(worker1.getSalary());

        System.out.println(worker1.equals(worker2));
        System.out.println(worker1.hashCode() == worker2.hashCode());

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());

    }
}