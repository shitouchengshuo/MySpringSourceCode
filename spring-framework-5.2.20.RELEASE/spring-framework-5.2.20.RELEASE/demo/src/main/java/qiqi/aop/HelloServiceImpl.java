package qiqi.aop;

import qiqi.aop.HelloService;

public class HelloServiceImpl implements HelloService {
	@Override
	public void sayHello(String name) {
		System.out.println("哈哈A"+ name);
	}
}
