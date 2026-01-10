class eData {
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

}

public class company {

  public static void main(String[] args) {

    eData employee = new eData();

    employee.id = 11;
    employee.name = "Gagan";
    employee.role = "CTO";
    employee.yoe = 1;
    employee.salary = 1000000;

    employee.showEmployeeDetails(11);

  }

}
