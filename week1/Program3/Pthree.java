
public class Pthree {

	public static void main (String[] args){
	int valueOne=10;
	int valueTwo=5;
	Calculator myCalculator=new Calculator();
	
	int addResult=myCalculator.add(valueOne,valueTwo);
	int subValue=myCalculator.sub(valueOne,valueTwo);
	int mulValue=myCalculator.mul(valueOne,valueTwo);
	int divValue=myCalculator.div(valueOne,valueTwo);
	
	System.out.println("add :" + addResult);
	System.out.println("sub :" + subValue);
	System.out.println("mul :" + mulValue);
	System.out.println("div :" + divValue);
}
}
class Calculator{
	
	  private int result;
		public int add(int val1,int val2){
			result=val1+val2;
			return result;
		}
		public int sub(int val1,int val2){
			result=val1-val2;
			return result;
		}
		public int mul(int val1,int val2){
			result=val1*val2;
			return result;
		}
		public int div(int val1,int val2){
			result=val1/val2;
			return result;
		}
}
