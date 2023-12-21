package com.kh.tinyfarm.member.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Follow {
	private String userId;
	private String followingId;
}
