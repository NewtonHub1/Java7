import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary, bonus, totalSalary;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Enter salary of employee " + i + ": ");
            salary = input.nextDouble();

            bonus = 0;

            if (salary < 20000) {
                bonus = salary * 0.20;
            }


            

            if (salary >= 20000) {
                if (salary < 40000) {
                    bonus = salary * 0.15;
                }
            }

            if (salary >= 40000) {
                if (salary < 60000) {
                    bonus = salary * 0.10;
                }
            }

            if (salary >= 60000) {
                bonus = salary * 0.05;
            }

            totalSalary = salary + bonus;

            System.out.println("Salary: Rs. " + salary);
            System.out.println("Bonus: Rs. " + bonus);
            System.out.println("Total Salary: Rs. " + totalSalary);
            System.out.println("----------------------");
        }

        input.close();
    }
}
