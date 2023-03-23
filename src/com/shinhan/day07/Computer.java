package com.shinhan.day07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode(of = {"model","price"})
//@ToString

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"maker"})
//@RequiredArgsConstructor
public class Computer {
	@NonNull
	private String model;
	private int price;
	private String maker;
}
