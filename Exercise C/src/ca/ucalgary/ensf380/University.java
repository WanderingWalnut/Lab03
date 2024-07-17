package ca.ucalgary.ensf380;

public class University {
	
	// Professor Dave Supervises 3 students, 2 of them are twins. They are all located in Calgary
	// and are eligible to take the course based on their location but Jolly is unable to take the course
	// as her average mark is below the threshold. Check if the address/location of the students is valid and make
	// sure they are eligible to take the course.

	public static void main(String[] args) {
		
		//Professor
		Address profAddress = new Address("123 University", "Calgary",  "AB", "T2N 1N4", "Canada");
		Professor profDave = new Professor("Dr. Dave Dunson", "403-383-3333", "dave.dunson@ucalgary.ca", profAddress, 1000, "P123", 90000);
		
		// The 3 Students
		Address studentAddress1 = new Address("456 College Ave", "Calgary", "AB", "T2N 2N5", "Canada");
        Student studentJohn = new Student("John Doe", "403-234-5678", "john.doe@ucalgary.ca", studentAddress1, 2000, "S12345", profDave, 85.5);
        
        //Twins
        Address studentAddress2 = new Address("789 Campus Dr.", "Calgary", "AB", "T2N 3N6", "Canada");
        Student studentJane = new Student("Jane Smith", "403-345-6789", "jane.smith@ucalgary.ca", studentAddress2, 3000, "S67890", profDave, 92.0);
        
        Address studentAddress3 = new Address("789 Campus Dr.", "Calgary", "AB", "T2N 3N6", "Canada");
        Student studentJolly = new Student("Jolly Smith", "403-444-4444", "jolly.smith@ucalgary.ca", studentAddress3, 3000, "S67891", profDave, 48.0);

        // Basic info
        System.out.println("Professor: " + profDave.getName());
        System.out.println("Supervises: ");
        System.out.println(" - " + studentJohn.getName() + " (Student Number: " + studentJohn.getStudentNumber() + ", Average Mark: " + studentJohn.getAverageMark() + ")");
        System.out.println(" - " + studentJane.getName() + " (Student Number: " + studentJane.getStudentNumber() + ", Average Mark: " + studentJane.getAverageMark() + ")");
        System.out.println(" - " + studentJolly.getName() + " (Student Number: " + studentJolly.getStudentNumber() + ", Average Mark: " + studentJolly.getAverageMark() + ")");
        
        // Validate Credentials
        
        Address addressArray[] = {studentAddress1, studentAddress2, studentAddress3};
        Student studentArray[] = {studentJohn, studentJane, studentJolly};
        
        System.out.println("Validation Check: ");
        		
        // Loop through each address and validate
        for (int i = 0; i < addressArray.length; i++) {
            if (addressArray[i].validate()) {
                System.out.println("*" + " Address for " + studentArray[i].getName() + " is a valid address.");
            } 
            
            else {
                System.out.println("*" + " Address for " + studentArray[i].getName() + " is invalid.");
            }
        }
        
        for (int i = 0; i < studentArray.length; i++) {
        	if (studentArray[i].isEligibleToEnroll() == true) {
        		System.out.println("- " + studentArray[i].getName() + " is eligible to take the course");
        	}
        	
        	else {
        		System.out.println("- " + studentArray[i].getName() + " is not eligible to take the course");
        	}
        }
        		
        
	}

}
