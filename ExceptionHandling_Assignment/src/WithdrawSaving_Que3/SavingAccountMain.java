package WithdrawSaving_Que3;

public class SavingAccountMain {

		    long id ;
		    double balance;
		    double withdraw;

		    public SavingAccountMain (long id, double balance) throws InsufficientBalanceException, IllegalBanktransactionException {
		        this.id=id;
		        this.balance=balance;

		        
		    }

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public double getBalance() {
				return balance;
			}

			public void setBalance(double balance) {
				this.balance = balance;
			}

		    public void withdraw(int amt) throws InsufficientBalanceException {
		        if(amt <= balance) {
		            balance -= amt;
		        }
		        else {
		            int newBalance = (int) (amt - balance);
		            throw new InsufficientBalanceException(newBalance);
		        }

		    }
		    public static void main(String[] args) throws InsufficientBalanceException, IllegalBanktransactionException {
		    	
		    	SavingAccountMain ac = new SavingAccountMain(1234, 20000);
		    	  try {
		              ac.withdraw(15000);
		              System.out.println("successful transaction");
		          }catch(InsufficientBalanceException e)
		    	  {
		        	  System.out.println("InsufficientFundsException ");
		    
		          }


		    }
}
