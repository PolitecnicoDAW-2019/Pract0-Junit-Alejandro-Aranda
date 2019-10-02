package PRAC1_ex1;

public class Team{

	private String shortName, longName, imageSrc, president, sponsor;
	private int members, budget, founded;
				
	public Team() throws Exception{
		this("Default", "Team Default", "./", "Dummy", "UOC",1000,1000000,2019);
	}
	
	public Team(String shortName, String longName, String imageSrc, String president, String sponsor, int members, int budget, int founded) throws Exception{
		setShortName(shortName);
		setLongName(longName);
		setImageSrc(imageSrc);
		setPresident(president);
		setSponsor(sponsor);
		setMembers(members);
		setBudget(budget);
		setFounded(founded);
	}
	
	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) throws Exception{
		if(shortName.length()>40) {
			throw new Exception("[ERROR] Short name cannot be longer than 40 characters!!");
		}
		
		this.shortName = shortName;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {		
		this.longName = longName;
	}
	
	public String getImageSrc() {
		return imageSrc;
	}
	
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public int getMembers() {
		return members;
	}

	public boolean setMembers(int members){
		if(members<0) {
			return false;
		}
		this.members = members;
		return true;
	}

	public int getBudget() {
		return budget;
	}

	public boolean setBudget(int budget){
		if(budget<0) {
			return false;
		}
		this.budget = budget;
		return true;
	}

	public int getFounded() {
		return founded;
	}

	public boolean setFounded(int founded){
		if(founded<1900) {
			return false;
		}
		this.founded = founded;
		return true;
	}
}
