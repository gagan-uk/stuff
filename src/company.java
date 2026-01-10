import java.util.Scanner;

class eData {

  Scanner sc = new Scanner(System.in);

  int id;
  String name;
  String role;
  int yoe;
  int salary;

  void showEmployeeDetails(int id) {
    System.out.println(name);
    System.out.println(role);
    System.out.println(yoe);
    System.out.println(salary);
  }

  void inputEmployeeDetails() {
    System.out.println("Enter 2 digit ID:");
    id = sc.nextInt();
    System.out.println("Enter Name:");
    name = sc.next();
    System.out.println("Enter Role:");
    role = sc.next();
    System.out.print("Enter Years of Exprience:");
    yoe = sc.nextInt();
    System.out.print("Enter Salary:");
    salary = sc.nextInt();
  }

}

public class company {

  public static void main(String[] args) {

    eData employee = new eData();

    employee.inputEmployeeDetails();

    employee.showEmployeeDetails(11);

  }

}
