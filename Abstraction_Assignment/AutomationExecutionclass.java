package Abstraction_Assignment;

public class AutomationExecutionclass extends MultipleLanguage implements Language, Testtool {

	public void Selenium() {
		System.out.println("Selenium From Testtool Interface");
			}

	public void Java() {
		System.out.println("Java from Language Interface");
			}

	
	@Override
	public void Ruby() {
		System.out.println("Ruby from Abstract class");
		
	}
	public static void main(String[] args) {

		// creating obj for Concrete class
		
		AutomationExecutionclass objRef = new AutomationExecutionclass();
		
		objRef.Java();
		objRef.Selenium();
		objRef.python(); // directlyfromabstractclass by clickingobjRef.MultipleLanguag
		objRef.Ruby();
		

	}
}
