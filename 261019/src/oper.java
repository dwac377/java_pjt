
public class oper {

	public static void main(String[] args) {
		
		int num7 = 10;
		float num8 = 10.0f;
		System.out.println(num7 > num8);
		System.out.println(num7 >= num8);
		System.out.println(num7 < num8);
		System.out.println(num7 <= num8);
		System.out.println(num7 == num8);
		System.out.println(num7 != num8);
		
		
//		******* 문자열 비교 *******
		String str = "hi";
		String str2 = "hi";
		System.out.println(str == str2);
		String str3 = new String("hi");
		String str4 = new String("hi");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
