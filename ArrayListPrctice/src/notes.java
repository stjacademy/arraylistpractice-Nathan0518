import java.util.ArrayList;

public class notes {

	public static void main(String[] args) {
		
		/*int[] grades = new int[2];
		grades[0] = 100;
		grades[1] = 100;
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}*/
		
		ArrayList<Integer>grades = new ArrayList<Integer>();
		grades.add(100);
		grades.add(99);
		grades.add(20);
		grades.add(15);
		System.out.println(grades);
		System.out.println("I removed the " + grades.remove(2));
		System.out.println(grades);
		grades.add(1,20);
		System.out.println(grades);
		grades.set(3, 66);
		System.out.println(grades);
		
		for(int i=0; i<grades.size(); i++) {
			System.out.println(grades.get(i));
		}
		
		for(Integer num : grades) {
			System.out.println(num);
		}
	}

}
