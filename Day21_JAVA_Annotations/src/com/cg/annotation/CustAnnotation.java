package com.cg.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@SuppressWarnings("unused")
//@Retention(RetentionPolicy.RUNTIME)
//@Traget(ElementType.METHOD)
@interface OwnCustom{
	int accept();
}
	class C{
	@OwnCustom(accept=35)
	public void display() {
		System.out.println("Hey, Using custom Annotations");
	}
}

public class CustAnnotation {

	public static void main(String[] args) throws Exception{
		C c= new C();
		Method m=c.getClass().getMethod("display");
		OwnCustom obj=m.getAnnotation(OwnCustom.class);
		System.out.println(obj.accept());
		

	}

}