package com.capgemini.IPL;

import org.junit.Assert;
import org.junit.Test;
import com.google.gson.Gson;
import model.*;

public class CricketAnalysisTest {
	CricketAnalysis cricketAnalysis;
	public static final String PATH_OF_CSV_FILE = "D:\\Capg_Bridgelabz\\IPL\\src\\main\\java\\resources\\MostRunsData.csv";
	public static final String PATH_OF_MOST_WICKETS_CSV_FILE = "D:\\Capg_Bridgelabz\\IPL\\src\\main\\java\\resources\\MostWktsData.csv";

	@Test
	public void givenTheCSVFile_WhenNoOfRecordMatch_ShouldReturnTrue() {
		try {
			int noOfRecords = cricketAnalysis.loadDataForRuns(PATH_OF_CSV_FILE);
			Assert.assertEquals(100, noOfRecords);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnBestBattingAverage() {
		try {
			cricketAnalysis.loadDataForRuns(PATH_OF_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getAverageWiseSorted();
			IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
			double runs = censusCsv[0].Avg;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("MS Dhoni", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedStrikeRate() {
		try {
			cricketAnalysis.loadDataForRuns(PATH_OF_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getStrikerateWiseSorted();
			IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
			double runs = censusCsv[0].SR;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Ishant Sharma", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedFours() {
		try {
			cricketAnalysis.loadDataForRuns(PATH_OF_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getFoursWiseSorted();
			IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
			String runs = censusCsv[0].fours;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Shikhar Dhawan", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedSixes() {
		try {
			cricketAnalysis.loadDataForRuns(PATH_OF_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getSixesWiseSorted();
			IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
			String runs = censusCsv[0].sixs;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Andre Russell", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedStrikeRateWithFoursAndSixes() {
		try {
			cricketAnalysis.loadDataForRuns(PATH_OF_CSV_FILE);
			String sortedCensusData = cricketAnalysis.get4sn6sWiseSorted();
			IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
			double runs = censusCsv[0].SR;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Ishant Sharma", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedAverageWithBestSR() {
		try {
			cricketAnalysis.loadDataForRuns(PATH_OF_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getAverageWithBestSRWiseSorted();
			IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("MS Dhoni", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedRunsWithBestAvg() {
		try {
			cricketAnalysis.loadDataForRuns(PATH_OF_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getBestAverageWithRunsWiseSorted();
			IPLMostRuns[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostRuns[].class);
			String runs = censusCsv[0].Runs;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("David Warner", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenFilePathGForWickets_WhenNoOfRecordMatches_ThenReturnTrue() {
		try {
			int noOfRecords = cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			Assert.assertEquals(99, noOfRecords);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedWithTopBowlingAvg() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getAverageBowlingWiseSorted();
			IPLMostWickets[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostWickets[].class);
			double runs = censusCsv[0].Avg;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Krishnappa Gowtham", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedWithStrikeRate() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getBestStrikingRateWiseSorted();
			IPLMostWickets[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostWickets[].class);
			double runs = censusCsv[0].Avg;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Krishnappa Gowtham", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedWithBestEconomy() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getBestEconomyWiseSorted();
			IPLMostWickets[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostWickets[].class);
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Ben Cutting", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedWithStrikeRate4w() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getWicketsWithBestStrikingRate4wWiseSorted();
			IPLMostWickets[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostWickets[].class);
			String runs = censusCsv[0].FourWickets;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Imran Tahir", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedWithStrikeRate5w() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getWicketsWithBestStrikingRate5wWiseSorted();
			IPLMostWickets[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostWickets[].class);
			String runs = censusCsv[0].FiveWickets;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Alzarri Joseph", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedWithTopStrikingRateAndAvg() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getAverageBowlingWiseSorted();
			IPLMostWickets[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostWickets[].class);
			double runs = censusCsv[0].Avg;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Krishnappa Gowtham", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnSortedWithTopWickets() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getWicketsWithBestWicketsWiseSorted();
			IPLMostWickets[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostWickets[].class);
			double runs = censusCsv[0].Avg;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Imarn Tahir", name);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnBestBowlingAndBattingAvg() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedCensusData = cricketAnalysis.getAverageBowlingWiseSorted();
			IPLMostWickets[] censusCsv = new Gson().fromJson(sortedCensusData, IPLMostWickets[].class);
			double runs = censusCsv[0].Avg;
			String name = censusCsv[0].getPLAYER();
			Assert.assertEquals("Krishnappa Gowtham", name);

			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedData = cricketAnalysis.getAverageWiseSorted();
			IPLMostRuns[] censusCsvs = new Gson().fromJson(sortedData, IPLMostRuns[].class);
			double run = censusCsvs[0].Avg;
			String names = censusCsvs[0].getPLAYER();
			Assert.assertEquals("MS Dhoni", names);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenCricketData_WhenSorted_ShouldReturnTopRuns() {
		try {
			cricketAnalysis.loadDataForWickets(PATH_OF_MOST_WICKETS_CSV_FILE);
			String sortedData = cricketAnalysis.getWicketsWithBestRunsWiseSorted();
			IPLMostRuns[] censusCsv = new Gson().fromJson(sortedData, IPLMostRuns[].class);
			String names = censusCsv[0].getPLAYER();
			Assert.assertEquals("Deepak chahar", names);
		} catch (Exception e) {
		}
	}
}
