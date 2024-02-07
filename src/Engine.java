package src;
//public void testEnginge(Engine engine) {
//  ComputeResponse testComputer = compute(new Data());
//  ProcessedResponse testProcess = out(testComputer.data());
//}

public interface Engine{
  ComputeResponse compute();
  ProcessedResponse out();
}
