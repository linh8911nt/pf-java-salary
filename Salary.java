import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập hệ số lương (1-5): ");
        double coefficientSalary = input.nextDouble();
        System.out.println("Nhập số năm làm việc: ");
        int yearWorks = input.nextInt();

        if (coefficientSalary < 5 && coefficientSalary > 0){
            double salary = coefficientSalary * 4000000 + yearWorks * 500000;
            System.out.println("Lương tháng:" + salary);
        }else {
            System.out.println("Hệ số lương nhập không hợp lệ");
        }
    }
}