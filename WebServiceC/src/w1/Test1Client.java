package w1;

import w1.job.Entity1;
import w1.job.Hello;
import w1.job.HelloImplService;

public class Test1Client {
	public static void main(String[] args) {
		HelloImplService helloImplService = new HelloImplService();
		Hello hello = helloImplService.getHelloImplPort();
		String sayHello = hello.sayHello("aaa");
		System.out.println(sayHello);
		
		Entity1 entity1=new Entity1();
		entity1.setName("a12");
		entity1.setId(1);
		entity1.setColumn1("c1");
		String str = hello.getStr(entity1);
		System.out.println(str);
	}
}
