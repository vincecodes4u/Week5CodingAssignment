
public class SpacedLogger implements Logger {
@Override
public void log(String message2) {
	StringBuilder spacedText = new StringBuilder();
	for (char c : message2.toCharArray()) {
		spacedText.append(c).append(' ');
	}
	System.out.println(spacedText.toString());
}
@Override
public void error(String errorMessage2) {
	StringBuilder spacedErrorText = new StringBuilder("Error: ");
	for (char c : errorMessage2.toCharArray()) {
		spacedErrorText.append(c).append(' ');
	}
	System.out.println(spacedErrorText.toString());
    }
}
