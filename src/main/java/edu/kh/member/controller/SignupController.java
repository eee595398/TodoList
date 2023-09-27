package edu.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.kh.member.model.dto.Member;
import edu.kh.member.model.service.MemberService;

@WebServlet("/signup")
public class SignupController extends HttpServlet {
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	
		
		req.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(req, resp);
	
		
		
		
		try {
			
		
		
			
		
			String inputId = req.getParameter("inputId");
			String inputPw = req.getParameter("inputPw");
			String inputNickname = req.getParameter("inputNickname");
			
			MemberService service = new MemberService();
			
			Member signupMember = service.signup(inputId,inputPw,inputNickname);
			
			
			
			HttpSession session = req.getSession();
			
			
			if(signupMember !=null) {
				
				
				session.setAttribute("signup", signupMember);
			
		
				
				session.setMaxInactiveInterval(60*60);
				
				resp.sendRedirect("/WEB-INF/views/signup.jsp");
				
				
			}else {
				
				session.setAttribute("message", "다시 입력해주요");
					
				
				
				req.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(req, resp);
				
			}
			
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
