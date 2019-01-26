
import java.util.ArrayList;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;


public class Values {

	//private String numResults;
	private int numResults;
	private int counter;
	private String eachResult;
	private ArrayList<String> lstPattern = new ArrayList<>();
	private ArrayList<String> lstOne = new ArrayList<>();
	private ArrayList<String> lstTwo = new ArrayList<>();
	private ArrayList<String> lstThree = new ArrayList<>();
	private ArrayList<String> lstFour = new ArrayList<>();
	private ArrayList<String> lstFive = new ArrayList<>();
	private ArrayList<String> lstSix = new ArrayList<>();
	private ArrayList<String> lstResults = new ArrayList<>();

	public Values (int numberOfResults) {
		numResults = numberOfResults;
	}

	//set NumResults
	public void setNumResults(int results) {
		this.numResults = results;
	}
	//get NumResults
	public int getNumResults() {
		return numResults;
	}

	//set individual result during generation
	public void setEachResult(String eachResult) {
		this.eachResult = eachResult;
	}

	//get individual result during generation
	public String getEachResult() {
		return eachResult;
	}

	//set ArrayList for possible patterns
	public void setPatternList(ArrayList<String> list) {
		this.lstPattern = list;
	}

	//get ArrayList for possible patterns
	public ArrayList<String> getPatternList() {
		return lstPattern;
	}

	//set ArrayList for List One
	public void setListOne(ArrayList<String> list) {
		this.lstOne = list;
	}

	//get ArrayList for List One
	public ArrayList<String> getListOne() {
		return lstOne;
	}

	//set ArrayList for List Two
	public void setListTwo(ArrayList<String> list) {
		this.lstTwo = list;
	}

	//get ArrayList for List Two
	public ArrayList<String> getListTwo() {
		return lstTwo;
	}

	//set ArrayList for List Three
	public void setListThree(ArrayList<String> list) {
		this.lstThree = list;
	}

	//get ArrayList for List Three
	public ArrayList<String> getListThree() {
		return lstThree;
	}
	//set ArrayList for List Four
	public void setListFour(ArrayList<String> list) {
		this.lstFour = list;
	}

	//get ArrayList for List Four
	public ArrayList<String> getListFour() {
		return lstFour;
	}
	//set ArrayList for List Five
	public void setListFive(ArrayList<String> list) {
		this.lstFive = list;
	}

	//get ArrayList for List Five
	public ArrayList<String> getListFive() {
		return lstFive;
	}
	//set ArrayList for List Six
	public void setListSix(ArrayList<String> list) {
		this.lstSix = list;
	}

	//get ArrayList for List Six
	public ArrayList<String> getListSix() {
		return lstSix;
	}

	//set ArrayList for Generator Results
	public void setLstResults(ArrayList<String> lstResults) {
		this.lstResults = lstResults;
	}

	//get ArrayList for Generator Results
	public ArrayList<String> getLstResults() {
		return lstResults;
	}

	//Generate random letter combinations based on populated arrays
	public ArrayList<String> generateWords(int numResults, ArrayList<String> lstOne, 
			ArrayList<String> lstTwo, ArrayList<String> lstThree, ArrayList<String> lstFour, 
			ArrayList<String> lstFive, ArrayList<String> lstSix, ArrayList<String> lstPatterns) {
		System.out.println("initate generateWords");
		String indResult = "";
		String selectedLetter = "";
		String selectedPattern = "";
		char patternElement;
		String[] lstElements;
		lstResults.clear();
		counter = numResults;
		int patternCounter = 0;
		int selectedLetterNum;

		System.out.println("Set Counter To " + counter);

		do {
			int selectedPatternNum = RandomUtils.nextInt(0, (lstPatterns.size() -1));
			selectedPattern = lstPatterns.get(selectedPatternNum);
			System.out.println("Selected Pattern " + selectedPattern);

			lstElements = StringUtils.split(selectedPattern);
			patternCounter = selectedPattern.length();
			//selectedPattern.replace("", " ").trim();
			System.out.println("Pattern Counter " + patternCounter);
			do {				
				patternElement = ArrayUtils.toString(lstElements).charAt(patternCounter -1);
				System.out.println("Pattern Element " + patternElement);
				{
					switch(patternElement)
					{
					case '1':
						selectedLetterNum = RandomUtils.nextInt(0, (lstOne.size() -1));
						selectedLetter = lstOne.get(selectedLetterNum);
						break;

					case '2':
						selectedLetterNum = RandomUtils.nextInt(0, (lstTwo.size() -1));
						selectedLetter = lstTwo.get(selectedLetterNum);
						break;
					case '3':
						selectedLetterNum = RandomUtils.nextInt(0, (lstThree.size() -1));
						selectedLetter = lstThree.get(selectedLetterNum);
						break;

					case '4':
						selectedLetterNum = RandomUtils.nextInt(0, (lstFour.size() -1));
						selectedLetter = lstFour.get(selectedLetterNum);
						break;

					case '5':
						selectedLetterNum = RandomUtils.nextInt(0, (lstFive.size() -1));
						selectedLetter = lstFive.get(selectedLetterNum);
						break;

					default : 
						selectedLetterNum = RandomUtils.nextInt(0, (lstSix.size() -1));
						selectedLetter = lstSix.get(selectedLetterNum);
					}	
					System.out.println("Selected letter " + selectedLetter);
					
					indResult += selectedLetter;
					selectedLetter = "";
					System.out.println("IndResult = " + indResult);
					patternCounter -= 1;
					System.out.println("Pattern Counter set to " + patternCounter);
				}
				
			} while (patternCounter > 0);

			lstResults.add(indResult);
			indResult = "";
			counter = counter - 1;
			System.out.println("Counter set to " + counter);

		} while (counter > 0);
		return lstResults;
	}


}

