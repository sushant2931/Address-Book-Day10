package bl.com.addressbookday10;
import java.util.*;
public class AddressBook {
	 String firstName, lastName, address, city, state,email;
	    long phoneNo;
	    int zip;
	    public void setDetails(){

	        firstName = "Sushant";
	        lastName = "Lad";
	        address = "BalajiNagar";
	        city ="Pune";
	        state = "Maharashta";
	        zip = 411043;
			phoneNo = 8830602356;
	        email = "sushantlad8888@gmail.com";
	    }
	    public void printDetails(){

	        System.out.println("\nFirst Nmae : " + firstName  + "\n\nLast Name : " + lastName + "\n\nAddress : " + address + "\n\nCity : " + city + "\n\nState : " + state + "\n\nZip : " + zip + "\n\nPhone Number : " + phoneNo + "\n\nE-mail : " + email); 
	    }
}
