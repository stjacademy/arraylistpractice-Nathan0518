import java.util.ArrayList;
public class minilab
{
 
	public static void main(String[] args) {
		ArrayList<Integer> something = new ArrayList<Integer>();
		something = getListOfFactors(14);
		System.out.println(something);
		keepOnlyCompositeNumbers(something);
		System.out.println(something);
	}
	
  public static ArrayList<Integer> getListOfFactors(int number)
  {  
	ArrayList<Integer> factors = new ArrayList<Integer>();
  	for(int i=2; i<number; i++) {
  		if(number%i==0) {
  			factors.add(i);
  		}
  	}
  return factors;
  }
 
  public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums )
  {
  	for(int i=0; i<nums.size(); i++) {
  	    if(getListOfFactors(nums.get(i)).size()==0) {
  				nums.remove(i);
  				i--;
  	  }
  	}
  }
}