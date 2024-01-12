package OOPs.Inheritence.Person_Prob;

public class Main {

    public static void main(String[] args) {
      Employee employee1 = new Employee("Anthony", "Gonzales", 4451, "HR Manager");
      System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
	  Employee employee2 = new Employee("Saksham", "Kaushik", 4452, "Software Manager");
      System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
}


