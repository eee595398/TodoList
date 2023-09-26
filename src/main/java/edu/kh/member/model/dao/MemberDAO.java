package edu.kh.member.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import edu.kh.member.model.dto.Member;
import static edu.kh.todo.common.JDBCTemplate.*;


public class MemberDAO {
	
		private Statement stmt;
		private PreparedStatement psmt;
		private Properties prop;
		private ResultSet rs;
		
		
		public MemberDAO() {
			
			
			try {
				prop = new Properties();
				
				String filePath 
					= MemberDAO.class.getResource("/edu/kh/todo/sql/member-sql.xml").getPath();
				
				prop.loadFromXML(new FileInputStream(filePath));
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		

	public Member login(Connection conn, String inputId, String inputPw) throws Exception {
		// TODO Auto-generated method stub
		
		Member loginMember = null;
		
		try {
			
			String sql = prop.getProperty("login");
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1,inputId);
			
			psmt.setString(2, inputPw);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				
				loginMember = new Member();
				
				loginMember.setMemberNo(rs.getInt(1));
				loginMember.setMemberId(rs.getString(2));
				loginMember.setMemberPw(rs.getString(3));
				loginMember.setMemberNickname(rs.getString(4));

				
			}
			
			
		}finally {
			
			close(psmt);
			close(rs);
		}
		
		
		
		
		return loginMember;
	}

}
