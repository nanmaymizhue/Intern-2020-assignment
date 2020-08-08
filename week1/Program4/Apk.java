
public class Apk {
 public static void main(String[] args){
	 superMethod();
	 Apk myApk=new Apk();
	 
	 myApk.hyperMethod();
	 
	 String result =ultraMethod();
	 System.out.println(result);
 }
 public static void superMethod(){
	 System.out.println("This is super methods.....");
	 
 }
 public void hyperMethod(){
	System.out.println("This is hyper methods.....");
	 

 }
 public static String ultraMethod(){
	 //System.out.println("This is ultra methods.....");
	 return ("This is ultra methods.....");

 }
}
