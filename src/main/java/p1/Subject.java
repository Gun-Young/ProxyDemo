package p1;

/*
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问
 * 
 * Subject 类，定义了RealSubject和proxy的公共接口，这样就在任何使用
 * RealSubject的地方都可以使用Proxy
 * 
 * */

 interface Subject
{
           public void request();
	
}
