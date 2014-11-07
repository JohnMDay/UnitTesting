/* File: PersonData.java
 * Created By:John Day	
 * IST 235
 * Description: gets and sets name of fictitious assignment 1 person
 */

package unit.testing.day;




public class PersonData 
{

	
	private String fullName; //Full Name	
	private String address; //Address
	private String city; //City
	private String state; //State
	private String zipCode; //Zip Code
	
	
	//Constructor
	public PersonData()
	{
		fullName = "John Doe";
		address = "102 king st";
		city = "Charleston";
		state = "SC";
		zipCode= "29401";
	}


	public String getFullName()
	{
		fullName = addSalutationToName(fullName);
		return fullName;
	}

	public String addSalutationToName(String aFullName) 
	{
		this.fullName = "Mr. " + aFullName;
		return fullName;
	}

	public String getAddress() 
	{
		return address;
	}


	public String getCity() 
	{
		return city;
	}


	public String getState() 
	{
		return state;
	}


	


	public String getZipCode() {
		return zipCode;
	}
	
}
