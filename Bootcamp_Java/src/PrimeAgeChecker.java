
public class PrimeAgeChecker {
	
	public static boolean isPrime(int empAge) {
		for (int i=2;i<empAge/2;i++){
			if (empAge%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
