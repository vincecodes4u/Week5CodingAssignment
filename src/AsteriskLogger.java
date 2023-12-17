
public class AsteriskLogger implements Logger {
@Override
public void log(String message1) {
	System.out.println("*** " + message1 + " ***");
}
@Override
public void error(String errorMessage) {
	System.out.println("****************");
	System.out.println("Error: " + "*** " + errorMessage + " ***");
	System.out.println("****************");
 }
}
