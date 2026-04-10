package JAVAExample.Loops.SwitchCase;

import java.util.Scanner;

public class Java_ex_109 {
    public static void main(String[] args) {

        // Web Automation
        // I Will ask user which browser you want me to run the code
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter browser name !!, where you want to execute");
            String browserName = sc.nextLine().trim().toLowerCase();

            switch (browserName) {
                case "chrome":
                    System.out.println("Starting the chrome browser");
                    // WebDriver driver = new ChromeDriver();
                    break;

                case "firefox":
                    System.out.println("Starting the firefox browser");
                    // WebDriver driver = new FirefoxDriver();
                    break;

                case "edge":
                    System.out.println("Starting the edge browser");
                    // WebDriver driver = new EdgeDriver();
                    break;

                default:
                    System.out.println("There is no driver");
            }

            sc.close();
        }
}
