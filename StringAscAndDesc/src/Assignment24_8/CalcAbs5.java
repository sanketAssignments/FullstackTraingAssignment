package Assignment24_8;

public abstract class CalcAbs5 {

	abstract void sum(int a, int b); 
	 void sub(int a, int b) {
		 
	 }
	 void mul(int a, int b) {
		 
	 }
	 void div(int a,int b) {
		 
	 }
}
  class A extends CalcAbs5{
	@Override
	void sum(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
  }
	class B extends A {
		@Override
		void sub(int a, int b) {
			int sub=a-b;
			System.out.println(sub);
		}
	}

	class C extends B {
		@Override
		void mul(int a, int b) {
			int mul=a*b;
			System.out.println(mul);
		}
	}

	class D extends C {
		@Override
		void div(int a,int b) {
			int div=a/b;
			System.out.println(div);
		}
	}

class Test1{
	public static void main(String[] args) {
		
		A cd1=new A();
		cd1.sum(4, 6);
		B cd2=new B();
		cd2.sub(4, 6);
		C cd3=new C();
		cd3.mul(4, 6);
		D cd4=new D();
		cd4.div(4, 6);
		
		
		
	}
}