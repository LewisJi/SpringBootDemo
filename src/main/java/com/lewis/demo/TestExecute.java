package com.lewis.demo;

import java.util.Arrays;
import java.util.List;

public class TestExecute {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("aaa","bbb","ccc");
		list.forEach(TestExecute::print);
		
		Runnable runa = ()->new TestExecute().print("ok");
		runa.run();
	}
	
	public static void print(String content) {
		System.out.println(content);
	}

}
