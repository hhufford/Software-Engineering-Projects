
/**Purpose: Contains stations and tells them when to hire another detective
 * @author - Heidi Hufford and Evan Lim
 */

public class PublicSafety {
// variables
	private Station stationUniversity;
	private Station stationCity;
	
	/**
	 * Constructor uses first parameter to make the University Station and second parameter to make the City station
	 */	
	public PublicSafety(String staOne, String staTwo) {
		super();
		// TODO Auto-generated constructor stub
		this.stationUniversity = new Station(staOne);
		this.stationCity = new Station(staTwo);
		
	}
	
	/**
	 * Tells which station should hire another detective
	 */	
	public void doHire(boolean shouldHire)
	{
		if (shouldHire )
		{
			stationCity.hire();
		}
		else {
			stationUniversity.hire();
		}
	}
	
	/**
	 * Tells stations to print their lists of detectives
	 */	
	public void printDetectiveLists()
	{
		stationUniversity.printDetectives();
		stationCity.printDetectives();
	}
		
	
}
