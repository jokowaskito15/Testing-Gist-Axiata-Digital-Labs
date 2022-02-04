package jokowaskito.test.axiata.digital.labs.driver.strategies;

import jokowaskito.test.axiata.digital.labs.utils.Constants;

public class DriverStrategyImplemantor {
	
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			
			return new Chrome();
			
		case Constants.FIREFOX:
			
			return new Firefox();

		default:
			return null;
		}
	}
	
}
