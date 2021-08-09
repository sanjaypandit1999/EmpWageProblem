package empwage;

public class Empwageuc2 {
    public static void main(String[] args) {
        // variable declaration
        int isFullTime = 1;
        int empRatePerHr = 20;
        int empHr = 8;
        int salary = empRatePerHr * empHr;
        //random check
        double empCheck = Math.floor(Math.random() * 10) %2;
        if (empCheck == isFullTime)
            System.out.println(salary);
        else
            System.out.println("employe is absent no slary");
    }
}
