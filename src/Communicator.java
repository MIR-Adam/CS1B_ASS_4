
public class Communicator extends InternetUser {

	public final static int ERROR_FLAG_NUM = 0;
	
	//private member data
	private long MAX_PQ = (long) Math.sqrt(Long.MAX_VALUE);
	private long publicKey;
	private IntPair privateKey;
	private long firstPrime;
	private long n, phi, e, d;
	
}
