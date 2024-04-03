
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;



public class TestUser {
	
	private final UserStart coordinator;

	public TestUser(UserStart coordinator) {
		this.coordinator = coordinator;
	}

	public void run(String outputPath) throws IOException, ExecutionException {
		String delimiter = ";";
		String inputPath = "test" + File.separatorChar + "testInputFile.test";
		Input input = new Input(inputPath);
		Output output = new Output(outputPath);
		
		coordinator.startComputationJob(input, output, delimiter);
	}

}
