import java.io.*;
import java.util.Scanner;
public class employeeSplit {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("employee.txt");
            Scanner inputFile = new Scanner(reader);
            PrintWriter ssnFile = new PrintWriter("ssn.txt");
            PrintWriter nameFile = new PrintWriter("name.txt");
            PrintWriter salaryFile = new PrintWriter("salary.txt");
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                String[] employeeData = line.split(":");
                if (employeeData.length > 0) {
                    ssnFile.println(employeeData[0]);
                } else {
                    ssnFile.println(" ");
                }
                if (employeeData.length > 1) {
                    nameFile.println(employeeData[1]);
                } else {
                    nameFile.println(" ");
                }
                if (employeeData.length > 2) {
                    salaryFile.println(employeeData[2]);
                } else {
                    salaryFile.println(" ");
                }
                if (employeeData.length != 3) {
                    //System.out.println("Error: Bad record found - " + line); // debugging line
                }
            }
            inputFile.close();
            ssnFile.close();
            nameFile.close();
            salaryFile.close();
            System.out.println("All done");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



