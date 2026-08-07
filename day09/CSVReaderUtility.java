package day09;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class CSVReaderUtility {

    private static final Logger logger =
            Logger.getLogger(CSVReaderUtility.class.getName());

    public static List<String[]> readCSV(String filePath) {

        List<String[]> rows = new ArrayList<>();

        try {

            // Configure logger
            FileHandler fileHandler = new FileHandler("error.log", true); //Creates (or opens) the error.log file and enables append mode so existing logs are preserved.
            fileHandler.setFormatter(new SimpleFormatter()); //Formats log messages with details such as timestamp, log level, and message in a readable style.
            logger.addHandler(fileHandler); //Connects the logger to the file so all log messages are written to error.log.

            BufferedReader br = new BufferedReader(new FileReader(filePath));

            // Skip header
            br.readLine();

            String line;
            int lineNumber = 2;

            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");

                // Check if row is malformed
                if (values.length != 3) {

                    logger.severe("Malformed CSV at line "
                            + lineNumber + ": " + line);

                    lineNumber++;
                    continue;
                }

                rows.add(values);
                lineNumber++;
            }

            br.close();

        } catch (Exception e) {

            logger.severe(e.getMessage());

        }

        return rows;
    }

public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "\\day09\\students.csv";
        List<String[]> data = readCSV(filePath);
       for (String[] row : data) {
      System.out.println(Arrays.toString(row));
}
    }
}

