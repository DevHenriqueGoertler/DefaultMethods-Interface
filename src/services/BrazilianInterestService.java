package services;

public class BrazilianInterestService implements InterestService {
	
	private static Double InterestRate = 2.0;

	public BrazilianInterestService() {
	}
	
	@Override
	public Double getInterestRate() {
		return InterestRate;
	}
}
