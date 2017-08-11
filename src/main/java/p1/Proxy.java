package p1;


/*
 * Proxy类，保存一个引用是的代理可以访问实体，并实现与RealSubject相同的接口（Subject）
 * 这样代理就可以用来替代实体
 * 
 * */
public class Proxy implements Subject
{

	RealSubject realSubject;
	
	public void request() 
	{
		
	      if(realSubject==null)
	      {
	    	  realSubject =new RealSubject();
	      }
		
	      realSubject.request();
	}

}
