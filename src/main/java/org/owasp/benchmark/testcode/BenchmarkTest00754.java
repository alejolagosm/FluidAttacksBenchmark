/**
* OWASP Benchmark Project v1.2beta
*
* This file is part of the Open Web Application Security Project (OWASP)
* Benchmark Project. For details, please see
* <a href="https://www.owasp.org/index.php/Benchmark">https://www.owasp.org/index.php/Benchmark</a>.
*
* The OWASP Benchmark is free software: you can redistribute it and/or modify it under the terms
* of the GNU General Public License as published by the Free Software Foundation, version 2.
*
* The OWASP Benchmark is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
* even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* @author Nick Sanidas <a href="https://www.aspectsecurity.com">Aspect Security</a>
* @created 2015
*/

package org.owasp.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest00754")
public class BenchmarkTest00754 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	
		String[] values = request.getParameterValues("vector");
		String param;
		if (values != null && values.length > 0)
		  param = values[0];
		else param = "";
		
		
		String bar = "safe!";
		java.util.HashMap<String,Object> map33225 = new java.util.HashMap<String,Object>();
		map33225.put("keyA-33225", "a Value"); // put some stuff in the collection
		map33225.put("keyB-33225", param); // put it in a collection
		map33225.put("keyC", "another Value"); // put some stuff in the collection
		bar = (String)map33225.get("keyB-33225"); // get it back out
		
		
		// javax.servlet.http.HttpSession.putValue(java.lang.String,java.lang.Object^)
		request.getSession().putValue( "userid", bar);
		
		response.getWriter().println("Item: 'userid' with value: '" + org.owasp.benchmark.helpers.Utils.encodeForHTML(bar)
			+ "' saved in session.");
	}
}