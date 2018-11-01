package Package;

public class CollegeClass {
	
	//fields 
	private String name;
	private int credits;
	private String[] roster;
	
	//methods
	
	//Default Constructor 
	public CollegeClass() {
		name = "not set";
		credits = 0;
		roster = new String[60];
	}
	//Overloaded Constructor
	public CollegeClass(String name, int credits, String[] roster) {
		this.name = name;
		this.credits = credits;
		this.roster = roster;
	}
	
	//Accessors 
	public String getName() {
		return name;
	}
	//mutator
	public void setName(String name) {
		this.name = name;
	}

}
