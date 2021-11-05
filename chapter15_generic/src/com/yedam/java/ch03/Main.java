package com.yedam.java.ch03;

import com.yedam.java.ch02.Product;
import com.yedam.java.ch02.Tv;

public class Main {

	public static void main(String[] args) {
		//제한된 타입 파라미터 : <T extends 최상위 타입>
		
		int result1 = Util.Compare(10, 20);
		System.out.println(result1);
		int result2 = Util.Compare(4.5, 3);
		System.out.println(result2);
		//int result3 = Util.Compare("a", "b");
		
		//제한된 타입 파라미터 : <T super 하위클래스>
		/*
		 * Person : 상위 클래스
		 * - Worker, student : 하위 클래스
		 * 			- HighStudent : 자손 클래스
		 * <T extends Student> => Student, HighStudent
		 * <T super Worker> => person, worker
		 */
		
		//제너릭 상속과 구현
		ChildProduct<Tv, String, String> product= new ChildProduct <Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("samsung");
		
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}
}
