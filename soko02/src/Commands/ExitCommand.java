package Commands;

public class ExitCommand implements Command {

	@Override
	public void execute(String[] args) {
		System.out.println("Goodbye, thank-you for playing sokoban! :)");
	}

}
