package testCasesUsingPOM;

public class test {

	public static void main(String[] args) {
		String crcard="1234567891234567";
		for(int i=0;i<crcard.length();i++) {
			char crNum=crcard.charAt(i);
			System.out.println(crNum);
		}
	}
}
