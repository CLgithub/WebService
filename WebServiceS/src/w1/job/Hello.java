package w1.job;

import javax.jws.WebService;

import w1.e.Entity1;

@WebService
public interface Hello {
	public String sayHello(String name);
	
	public String getStr(Entity1 entity1);
}
