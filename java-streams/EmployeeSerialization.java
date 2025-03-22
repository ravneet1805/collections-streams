// 4. Serialization - Save and Retrieve an Object
import java.io.*;
class Employee implements Serializable {
    int id;
    String name, department;
    double salary;
    Employee(int id, String name, String department, double salary) {
        this.id = id; this.name = name; this.department = department; this.salary = salary;
    }
}
class EmployeeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e1 = new Employee(1, "John Doe", "HR", 50000);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(e1);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            Employee emp = (Employee) ois.readObject();
            System.out.println("Employee: " + emp.name + ", Department: " + emp.department);
        }
    }
}