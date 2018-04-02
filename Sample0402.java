package example20180331;
import java.util.*;
public class Sample0402 {
	public static void main(String[] args) {
		int a=0;
		double b = 0.01;
		boolean c = true;
		char d = 'C';
		String e = "문자열입니다!";
		
		int array_int[] = {21,1,7,9,10};
		
		int sum_for = 0;
		for(int i=0;i<array_int.length;i++) {
			sum_for += array_int[i];
		}
		double avg = sum_for/array_int.length;
		System.out.println(sum_for);
		System.out.println(avg);
		
		int sum_while = 0;
		double avg_while = 0;
		int temp_count = 0;
		
		while(temp_count<array_int.length) {
			sum_while += array_int[temp_count];
			temp_count++;
		}
		avg_while = sum_while/array_int.length;
		System.out.println(sum_while);
		System.out.println(avg_while); 
		
		ArrayList<Integer>a_list = new ArrayList<>();
		
		a_list.add(1);
		a_list.add(3);
		a_list.add(5);
		a_list.add(7);
		
		System.out.println(a_list.get(0));
		
		Map<String,Integer>a_map = new HashMap<>();
		a_map.put("안녕", 2017);
		a_map.put("올해", 2018);
		a_map.put("1년후", 2019);
		a_map.put("안녕", 2002);
		System.out.println(a_map.get("안녕"));
		System.out.println(a_map.containsKey("1년후"));;
	}

}
