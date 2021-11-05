package com.yedam.java.ch02;

import com.yedam.java.ch01.Box;

public class UtilBox {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;//리턴타입 메소드명 매개변수
		
		Pair<Integer,String> p1 = new Pair<>(1, "사과");
		Pair<Integer,String> p2 = new Pair<>(1, "사과");
		boolean result1 = UtilPair.compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		Pair<String, String> p3 = new Pair<>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");
		boolean result2 = UtilPair.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}
}
