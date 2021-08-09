package empwage;

public class EmpWageUc5 {
    public static void main(String[] args) {
        int isFullTime = 1;
        int isPartTime = 2;
        int empRatePerHr = 20;
        int empHr = 0;
        int totalWorkingDay = 20;
        //random check
        double empCheck = Math.floor(Math.random() * 10) %3;
        //Case statements
        if (empCheck == isFullTime) {
            empHr = 8;
        } else if (empCheck == isPartTime) {
            empHr = 4;
        } else {
            System.out.println("employe is absent");
        }
        int salary = totalWorkingDay*empRatePerHr * empHr;
        System.out.println(salary);
    }
}
