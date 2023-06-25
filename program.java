package L2;

import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class program {
    public static void main(String[] args) throws SecurityException, IOException {
        int [] mas = {11, 3, 14, 16, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

        Logger logger = Logger.getLogger(Logger.class.getName());
        FileHandler ch = new FileHandler("log.xml");
        logger.addHandler(ch);

        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);

        logger.log(Level.WARNING, "");
        logger.info("");
    }
    }
