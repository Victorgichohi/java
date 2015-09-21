
public class DogName {
  private String dogname;
  public void setName(String name){
	  DogName=name;
  }
  public String getName(){
	  return dogname;
  }
  public void saying(){
	  System.out.printf("Your first dogs name was %s",getName());
  }
}
