package empwage;

public class Emplwage {
    public static void main(String[] args) {
        // variable declaration
        int isFullTime = 1;
        //random check
        double empCheck = Math.floor(Math.random() * 10) %2;
        if (empCheck == isFullTime)
            System.out.println("employe is present");
        else
            System.out.println("employe is absent");
    }
}
