package WithdrawSaving_Que3;

public class InsufficientBalanceException extends Throwable {

	public InsufficientBalanceException(int newBalance) {
		System.out.println(newBalance);
	}
}
