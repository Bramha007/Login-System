package com.controller;

//import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.util.StringJoiner;

public class CsvOps {
	
	public static boolean addToCSVFile(String studentId, String studentName, String gender, String dob, String city, String state, String email, String qualification, String stream) {
		try {
			FileWriter fw = new FileWriter("students.csv", true);
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter pw = new PrintWriter(bw);
//			StringJoiner sj = new StringJoiner(", ");
			fw.append(studentId);
			fw.append(", ");
			fw.append(studentName);
			fw.append(", ");
			fw.append(gender);
			fw.append(", ");
			fw.append(dob);
			fw.append(", ");
			fw.append(city);
			fw.append(", ");
			fw.append(state);
			fw.append(", ");
			fw.append(email);
			fw.append(", ");
			fw.append(qualification);
			fw.append(", ");
			fw.append(stream);
			fw.append("\n");
//			pw.println(sj);
//			pw.println(studentId + ", " + studentName+ ", " + gender+ ", " + dob+ ", " + city+ ", " + city+ ", " + state+ ", " + email+ ", " + qualification+ ", " + stream);
//			pw.flush();
//			pw.close();
			fw.flush();
			fw.close();
			return true;
			
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
