package w1;

import javax.xml.ws.Endpoint;

import w1.job.Hello;
import w1.job.HelloImpl;

public class Test1 {
	public static void main(String[] args) {
		String address="http://127.0.0.1:8092/job1";
		Hello hello = new HelloImpl();
		Endpoint.publish(address, hello);
	}
}
