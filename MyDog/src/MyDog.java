import java.util.Scanner;
public class MyDog {
  public static void main(String[] args){
	  Scanner input = new Scanner (System.in);
	  
	  //this method calls the next class
	DogName DogNameObject=new DogName();
	
	//prompts the user for input
	System.out.println("Enter name of your dog: ");
	
	//stores name in temp
	String temp =input.nextLine();
	//the name is taken and used in the Setname method in the other class
	DogNameObject.setName(temp);
	
	//calls the method saying from the other class
	DognameObject.saying();
  }
}
