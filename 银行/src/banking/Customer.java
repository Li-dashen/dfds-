package banking;

public class Customer {
	private Account  account;
	  private String   firstName;
	  private String   lastName;
	  private int      age;
	  public Customer(String f, String l,int a) {
	    firstName = f;
	    lastName = l;
	    age = a;
	  }
	  public String getFirstName() {
	    return firstName;
	  }
	  public String getLastName() {
	    return lastName;
	  }

      public int getage() {
    	  return age;
      }
	  public Account getAccount() {
	    return account;
	  }
	  public void setAccount(Account acct) {
	    account = acct;
	  }  

}
