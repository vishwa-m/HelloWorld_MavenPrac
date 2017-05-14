package com.vnath.maven.hw;

public class MyHelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int count = 0;
		count = count + 1;

		MyHelloWorld mhw = new MyHelloWorld();
	}

	public int sum(int i, int j) {
		return i + j;
	}

	public int subtract(int i, int j) {
		return i - j;
	}

	public int multiply(int i, int j) {
		return i * j;
	}
}