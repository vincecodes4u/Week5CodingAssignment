

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log("Ello");
		asteriskLogger.error("ByeBye");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("ElloGov");
		spacedLogger.error("WrongBuddy");
	}

}
