package me.jasna.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvReader {

    public static Map<Long, Integer> runReader() {
        String csvFile = "/Users/<USERNAME>/<PATH-TO-PROJECT>/src/main/resources/example.csv";
        String line = "";
        String cvsSplitBy = ",";
        // Make this whatever object types you want
        Map<Long, Integer> csvMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] record = line.split(cvsSplitBy);

                System.out.println(record[0] + " " + record[1]);
                csvMap.put(Long.parseLong(record[0]), Integer.parseInt(record[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvMap;

    }

}
