package empwage;

public class EmpWageUc3 {
    public static void main(String[] args) {
        int isFullTime = 1;
        int isPartTime = 2;
        int empRatePerHr = 20;
        int empHr = 0;
        //random check
        double empCheck = Math.floor(Math.random() * 10) %3;
        if (empCheck == isFullTime) {
            empHr = 8;
        } else if (empCheck == isPartTime) {
            empHr = 4;
        } else {
            System.out.println("employe is absent");
        }
        int salary = empRatePerHr * empHr;
        System.out.println(salary);
    }
}
