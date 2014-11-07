/* File: MyLibrary.java
 * Created By:John Day	
 * IST 235
 * Description: Library Application that tracks books out and in and who has them
 */

package unit.testing.day;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;

	public MyLibrary(String name) {
		this.name = name;
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void addBook(Book b1) {
		this.books.add(b1);

	}

	public void removeBook(Book b1) {
		this.books.remove(b1);

	}

	public void addPerson(Person p1) {
		this.people.add(p1);
	}

	public void removePerson(Person p1) {
		this.people.remove(p1);
	}

	public boolean checkOut(Book b1, Person p1) {
		int booksOut = this.getBooksForPerson(p1).size();
		if ((b1.getPerson() == null) && booksOut < p1.getMaximumBooks()) {
			b1.setPerson(p1);
			return true;
		} else {
			return false;
		}
	}

	public boolean checkIn(Book b1) {
		if (b1.getPerson() != null) {
			b1.setPerson(null);
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Book> getBooksForPerson(Person p1) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if ((aBook.getPerson() != null)
					&& (aBook.getPerson().getName().equals(p1.getName()))) {
				result.add(aBook);
			}
		}
		return result;
	}

	public ArrayList<Book> getAvailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getPerson() == null) {
				result.add(aBook);
			}
		}
		return result;
	}

	public ArrayList<Book> getUnavailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getPerson() != null) {
				result.add(aBook);
			}
		}
		return result;
	}

	public String toString() {
		return this.getName() + ": " + this.getBooks().size() + " books; "
				+ this.getPeople().size() + " people.";
	}

	public static void main(String[] args) {
		// create a new MyLibrary

		//Sets values for customer receipt
		String fullName = new PersonData().getFullName();
		String address = new PersonData().getAddress();
		String state = new PersonData().getState();
		String zipCode = new PersonData().getZipCode();
		String city = new PersonData().getCity();
		int maxBooks = new Person().getMaximumBooks();
		int checkedOut = new Person().getNumberOfBooksCheckedOut();

		
		//Extra Credit -- adds current Time and date
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		
		
		//Prints Customer receipt
		System.out.println("Date: \t\t\t" + dateFormat.format(date));
		System.out.println("Customer Name: \t\t" + fullName);
		System.out.println("Address: \t\t" + address);
		System.out.println(" \t\t\t" + city + ", " + state + " " + zipCode
				+ "\n \n");
		System.out.println("Books checked out: \t" + maxBooks);
		System.out.println("Max books allowed: \t" + checkedOut);

	}

}
