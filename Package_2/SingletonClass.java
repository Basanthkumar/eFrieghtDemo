package Package_2;


class Singleton1
{
	static Singleton1 obj = null;
	
	private Singleton1(){
		
	}
	 static Singleton1 method(){
		if(obj==null)
		{
			obj= new Singleton1();
		}
		return obj;
	 }	
		void method1()
		{
			System.out.println("Method 1");
		}
		
		void method2()
		{
			System.out.println("Method 2");
		}
	}


public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton1 obj1 = Singleton1.method();
		obj1.method1();
		obj1.method2();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Singleton1 obj2 = Singleton1.method();
		obj1.method1();
		obj1.method2();
			
	}

}
