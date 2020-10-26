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
import java.util.*;
import java.io.*;
import com.google.gson.Gson;
import builder.*;
import exception.CSVBuilderException;

public class CricketAnalysis {
	List<IPLMostRuns> censusCSVList = null;

	public int loadData(String filePath) throws IOException {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
			ICSVBuilder csvBuilder = CSVBuilderFactory.createCSVBuilder();
			censusCSVList = csvBuilder.getCSVFileList(reader, IPLMostRuns.class);
			System.out.println(censusCSVList);
			return censusCSVList.size();
		} catch (IOException e) {
			throw new CSVBuilderException(e.getMessage(), CSVBuilderException.ExceptionType.FILE_NOT_FOUND);
		} catch (RuntimeException e) {
			throw new CSVBuilderException(e.getMessage(), CSVBuilderException.ExceptionType.INCORRECT_FILE);
		}
	}

	public String getAverageWiseSorted() {
		if (censusCSVList.size() == 0 || censusCSVList == null)
			throw new CSVBuilderException("No Census Data", CSVBuilderException.ExceptionType.NO_CENSUS_DATA);
		Comparator<IPLMostRuns> iplMostRunsComparator = Comparator.comparing(census -> census.Avg);
		this.sort(iplMostRunsComparator);
		String sortedCensusJson = new Gson().toJson(censusCSVList);
		return sortedCensusJson;
	}

	public String getStrikerateWiseSorted() {
		if (censusCSVList.size() == 0 || censusCSVList == null)
			throw new CSVBuilderException("No Census Data", CSVBuilderException.ExceptionType.NO_CENSUS_DATA);
		Comparator<IPLMostRuns> iplMostRunsComparator = Comparator.comparing(census -> census.SR);
		this.sort(iplMostRunsComparator);
		String sortedCensusJson = new Gson().toJson(censusCSVList);
		return sortedCensusJson;
	}

	public String getFoursWiseSorted() {
		if (censusCSVList.size() == 0 || censusCSVList == null)
			throw new CSVBuilderException("No Census Data", CSVBuilderException.ExceptionType.NO_CENSUS_DATA);
		Comparator<IPLMostRuns> iplMostRunsComparator = Comparator.comparing(census -> census.fours);
		this.sort(iplMostRunsComparator);
		String sortedCensusJson = new Gson().toJson(censusCSVList);
		return sortedCensusJson;
	}

	public String getSixesWiseSorted() {
		if (censusCSVList.size() == 0 || censusCSVList == null)
			throw new CSVBuilderException("No Census Data", CSVBuilderException.ExceptionType.NO_CENSUS_DATA);
		Comparator<IPLMostRuns> iplMostRunsComparator = Comparator.comparing(census -> census.sixs);
		this.sort(iplMostRunsComparator);
		String sortedCensusJson = new Gson().toJson(censusCSVList);
		return sortedCensusJson;
	}

	private void sort(Comparator<IPLMostRuns> iplMostRunsComparator) {
		for (int i = 0; i < censusCSVList.size() - 1; i++) {
			for (int j = 0; j < censusCSVList.size() - i - 1; j++) {
				IPLMostRuns census1 = censusCSVList.get(j);
				IPLMostRuns census2 = censusCSVList.get(j + 1);
				if (iplMostRunsComparator.compare(census1, census2) < 0) {
					censusCSVList.set(j, census2);
					censusCSVList.set(j + 1, census1);
				}
			}
		}
	}
	  public String get4sn6sWiseSorted()  {
	        if(censusCSVList.size()==0 || censusCSVList==null)
	            throw new CSVBuilderException("No Census Data", CSVBuilderException.ExceptionType.NO_CENSUS_DATA);
	        Comparator<IPLMostRuns> iplMostRunsComparator = Comparator.comparing(census -> census.SR);
	        this.sort(iplMostRunsComparator);
	        String sortedCensusJson = new Gson().toJson(censusCSVList);
	        return sortedCensusJson;
	    }
	  
	  public String getAverageWithBestSRWiseSorted(){
	        if(censusCSVList.size()==0 || censusCSVList==null)
	           throw new CSVBuilderException("No Census Data", CSVBuilderException.ExceptionType.NO_CENSUS_DATA);
	        Comparator<IPLMostRuns> iplMostRunsComparator = Comparator.comparing(census -> census.Avg);
	        this.sort(iplMostRunsComparator);
	        String sortedCensusJson = new Gson().toJson(censusCSVList);
	        return sortedCensusJson;
	    }
}
