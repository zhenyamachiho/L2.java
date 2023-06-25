import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
public class program1 {
    public static void main(String[] args) throws SecurityException, IOException {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        char operation = scanner.next().charAt(0);

        int res = 0;

        switch (operation){
            case '+':
                res = num1+num2;
                break;
            case '-':
                res = num1-num2;
                break;
            case '*':
                res = num1*num2;
                break;
            case '/':
                res = num1/num2;
                break;
            default:
                break;
        }

    System.out.println(res);

    Logger logger = Logger.getLogger(Logger.class.getName());
        FileHandler ch = new FileHandler("log.xml");
        logger.addHandler(ch);

        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);

        logger.log(Level.WARNING, "");
        logger.info("");

    }
}
