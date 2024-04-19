package com.lewis.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestExecute {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("aaa","bbb","ccc");
		list.forEach(TestExecute::print);
		
		String ok ="ok";
		Runnable runa = ()->new TestExecute().print(ok);
		runa.run();
		
		String content2 = " ok";

        // 使用 lambda 表达式传递参数给 print 方法，包括外部变量 content2
        Consumer<String> consumer = content -> new TestExecute().print(content + content2);
        consumer.accept("Hello");
	}
	
	public static void print(String content) {
		System.out.println(content);
	}

}
