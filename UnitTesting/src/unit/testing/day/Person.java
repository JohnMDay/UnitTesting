/* File: Person.java
 * Created By:John Day	
 * IST 235
 * Description: gets and sets names of person in library records
 */

package unit.testing.day;

public class Person extends PersonData{
	// fields
	String name; // name of the person
	private int maximumBooks; // most books the person can check out
	private int numberOfBooksCheckedOut; //books checked out
	// constructors

	public int getNumberOfBooksCheckedOut() {
		return numberOfBooksCheckedOut;
	}

	public Person() {
		name = "Unknown Name" ;
		maximumBooks = 3;
		numberOfBooksCheckedOut = 5;
	}

	// methods
	public String getName() {
		return name;
	}

	public void setName(String anyName) {
		name = this.getFullName();
		 
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

	public String toString() {
		return this.getName() + " (" + this.getMaximumBooks() + " books)";
	}
	
	
}