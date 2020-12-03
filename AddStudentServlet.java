package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String studentId = request.getParameter("studentId");
		String studentName = request.getParameter("studentName");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String email = request.getParameter("email");
		String qualification = request.getParameter("qualification");
		String stream = request.getParameter("stream");
		
		StudentBean student = new StudentBean();
		student.setStudentId(studentId);
		student.setStudentName(studentName);
		student.setGender(gender);
		student.setDob(dob);
		student.setCity(city);
		student.setState(state);
		student.setEmail(email);
		student.setQualification(qualification);
		student.setStream(stream);
		
		boolean flag = CsvOps.addToCSVFile(student.getStudentId(), student.getStudentName(), student.getGender(), student.getDob(), student.getCity(), student.getState(), student.getEmail(), student.getQualification(), student.getStream());
		if(flag) {
			out.println("Records added");
			out.println("<br><a href='index.html'>Home Page</a>");
		}else {
			out.println("Couldn't add Records");
		}
	}

}
