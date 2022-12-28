package edu.kh.collection.Run;

import edu.kh.collection.model.servcie.StudentService;

public class StudentRun {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		service.displayMenu();

	}

}
