
class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayInformation() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
     
    }

    public class Employee1  {
    
        
 
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Ram", 30000);
        Employee emp2 = new Employee(102, "Shyam", 35000);
        Employee emp3 = new Employee(103, "Hari", 40000);

        emp1.displayInformation();
        emp2.displayInformation();
        emp3.displayInformation();
    }
}
}
