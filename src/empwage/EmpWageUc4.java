package empwage;
public class EmpWageUc4 {
    public static void main(String[] args) {
        int empRatePerHr = 20;
        int empHr = 0;
        int empCheck;
        //random check
        empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        switch (empCheck) {
            //Case statements
            case 1:
                empHr = 8;
                System.out.println("employee is present and work full time ");
                break;
            case 2:
                empHr = 4;
                System.out.println("employee is present and work part time");
                break;
            //Default case statement
            default:
                empHr = 0;
                System.out.println("employee is absent no salary");
        }
        int salary = empRatePerHr * empHr;
        System.out.println(salary);
    }
}
