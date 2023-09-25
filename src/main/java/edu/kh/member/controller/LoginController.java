package edu.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.member.model.dto.Member;
import edu.kh.member.model.service.MemberService;

@WebServlet("/member/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			try {
				
				String inputId = req.getParameter("inputId");
				String inputPw = req.getParameter("inputPw");
				
				MemberService service = new MemberService();
				
				Member loginMember = service.login(inputId,inputPw);
				
				
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
		
		
	}

}
