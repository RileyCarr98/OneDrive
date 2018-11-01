package Package;

public class Character {
	private String name;
	private int health;
	

	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
    int getHealth()
	{
		return health;
	}
	public void setHealth(int h)
	{
		health = h;
	}
	
	Character character = new Character("John", 100);
	
	public Character(String name, int health)
	{
		this.name = name;
		this.health = health;
	}
	
	
	
	public static void main(String[] args) {
		
		SLClass myClass = new SLClass();
		CollegeClass cop2006 = new CollegeClass();
		String[] phyRoster = {"Zach"};
		//CollegeClass phy2006 = CollegeClass("Physics I", 4, phyRoster);
		
	}

	
}
