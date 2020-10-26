package com.capgemini.IPL;

import model.IPLMostRuns;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class CricketAnalysis {
    public static int loadData(String filePath) throws IOException {
        int totalRecords = 0;
        try (Reader reader = Files.newBufferedReader(Paths.get(filePath))) {
            CSVReader csvReader = new CSVReader(reader);
            CsvToBean<IPLMostRuns> csvToBean = new CsvToBeanBuilder<IPLMostRuns>(csvReader).
                    withType(IPLMostRuns.class)
                    .build();
            Iterator<IPLMostRuns> csvRecords = csvToBean.iterator();
            while (csvRecords.hasNext()) {
                totalRecords++;
                csvRecords.next();
            }
        }
        return totalRecords;
    }
}
