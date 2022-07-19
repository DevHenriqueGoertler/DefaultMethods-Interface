package services;

public class USAInterestService implements InterestService {
	
	private static Double InterestRate = 1.0;

	public USAInterestService() {
	}
	
	@Override
	public Double getInterestRate() {
		return InterestRate;
	}
}
