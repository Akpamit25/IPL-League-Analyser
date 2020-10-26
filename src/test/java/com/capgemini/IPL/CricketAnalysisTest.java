package com.capgemini.IPL;

import org.junit.Assert;
import org.junit.Test;

public class CricketAnalysisTest {
    CricketAnalysis cricketAnalysis;
    public static String PATH_OF_CSV_FILE = "D:\\Capg_Bridgelabz\\IPL\\src\\main\\java\\resources\\MostRunsData.csv";
    @Test
    public void givenTheCSVFile_WhenNoOfRecordMatch_ShouldReturnTrue() {
        try {
            int noOfRecords = CricketAnalysis.loadData(PATH_OF_CSV_FILE);
            Assert.assertEquals(100, noOfRecords);
        } catch (Exception e) {
        }
    }
}
