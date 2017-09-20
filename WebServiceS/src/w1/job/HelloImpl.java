package w1.job;

import javax.jws.WebService;

import w1.e.Entity1;

@WebService(endpointInterface="w1.job.Hello")
public class HelloImpl implements Hello{

	@Override
	public String sayHello(String name) {
		return name+" hello";
	}

	@Override
	public String getStr(Entity1 entity1) {
		return entity1.toString();
	}

}
