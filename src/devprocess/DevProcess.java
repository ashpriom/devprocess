/**
 * Comment with multiple asterisks like this is used to generate Javadoc.
 */
package devprocess;

/**
 * @author Priom
 *
 */
public class DevProcess {

	public static void main(String[] args) {
		System.out.println("Welcome to the matrix.");
		double a = 7223;
		double b = 33.7;
		String theOne = "Neo";
		System.out.println(a);
		System.out.println("Welcome to the matrix, " + theOne + ".");
		double add = a+b;
		System.out.println(add);
		//String getIt = new theOracle();
		
			for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
			System.out.print(j);
			}
			}
			System.out.println();
			
			
			
			int count=1;
			for(int i=1;i<=9;i++){
				
				for(int j=1;j<=count;j++){
					System.out.print("*");
				}
				
				System.out.println();
			
				if(i<5){
					count=count+1;
				}

				else{
					count=count-1;
				}
			}
	}

	
	private void theOracle(){
		int thePassword = 311;
		int falsePass = thePassword;
		System.out.println(falsePass);
		return;
	}

}
