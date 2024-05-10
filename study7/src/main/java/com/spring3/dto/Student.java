package com.spring3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter, setter 둘다 가져옴
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private int stdNumber;
	private String name;
	private int age;
}
