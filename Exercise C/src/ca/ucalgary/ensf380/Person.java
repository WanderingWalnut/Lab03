package ca.ucalgary.ensf380;

public abstract class Person {
	
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private int lastPersonalNumber;
	
	//Default Constructor
	public Person(String name, String phoneNumber, String emailAddress, Address address, int lastPersonalNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
		this.lastPersonalNumber = lastPersonalNumber;
	}

	// Next Personal Number Method
	protected String nextPersonalNumber(short type){
		lastPersonalNumber += 1;
		return String.valueOf(lastPersonalNumber);
	}
	
	// Valid Address Method
	public boolean hasValidAddress() {
		if (address != null && address.validate() == true){
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	// Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getLastPersonalNumber() {
        return lastPersonalNumber;
    }

    public void setLastPersonalNumber(int lastPersonalNumber) {
        this.lastPersonalNumber = lastPersonalNumber;
    }
	
	
	

}
