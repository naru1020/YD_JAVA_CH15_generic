package com.yedam.java.ch02;

import com.yedam.java.ch01.Box;

public class Main {

	public static void main(String[] args) {
		// 싱글타입 파라미터 : class<T>, interface<T>
		// 멀티타입 파라미터 : class<K, V, ....>, interface<K, V, ...>
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트티비");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		//제네릭 메소드 : <T, R>
		/*Box<Integer> box1 = UtilBox.<Integer>boxing(100);
		int intValue = box1.get();
		*/
		Box<String> box2 = UtilBox.boxing("홍길동");
		String strValue = box2.get();
		
		Point<Integer, Double> p5 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p6 = new Point<>(10, 10.0);
		
		double result3 = Method.makeRectangle(p5, p6);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + result3 + "입니다.");
	}
}