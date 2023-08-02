package tops.accounts;

public class Practise2 {
public static void main(String[] args) {
//	int n=4;  //for star pattern
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
	//	}
	//	System.out.println();
//	}
	//pattern 12345
//	int n=5;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
	//		System.out.print(j+" ");
	//	}
//		System.out.println( );
//	}
	// reverse pattern 54321
//	int n=5;
//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
	
	//floyds triangle//
//	int n=5;
//	int number=1;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(number+" ");
//			number++;
//		}
	//	System.out.println();
//	}
//         	pattern 0 and 1
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			int sum=i+j;
			if(sum % 2==0) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}System.out.println();
		
	}
	
	
	
	
}
}

























