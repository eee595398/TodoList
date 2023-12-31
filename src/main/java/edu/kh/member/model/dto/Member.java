package edu.kh.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
		private int memberNo;
		private String memberId;
		private String memberPw;
		private String memberNickname;
		private String enrollDate;
		private char memberDelFl;

		
	
}
