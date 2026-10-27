
public class Tree {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		
		
		for (int i = 1; i <= n1; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i + 1) * 2 - 3; j++) {
				System.out.print('*');
			}
		}
		

			
			
			
	
							
			
		s.close();

	}

}
