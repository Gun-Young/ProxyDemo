package p1;


/*
 * RealSubject类，定义Proxy所代表的真是实体
 * 
 * */
public class RealSubject implements Subject 
{

	public void request() 
	{
	        System.out.println("被代理的类，真是的请求.........");	
		
	}
        
}
