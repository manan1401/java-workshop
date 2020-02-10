package InnerClasses;

public class MethodInnerclass {
	private int password=12345;
	void displayprivatedata() {
		
		class CheckMethodInnerClass{
			void showPassword() {
				System.out.println(password);
			}
		}
		
		CheckMethodInnerClass checkMethodInnerClass=new CheckMethodInnerClass();
		checkMethodInnerClass.showPassword();
		
	}

}
