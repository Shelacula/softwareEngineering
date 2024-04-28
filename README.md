# softwareEngineering
Software Engineering project. Compute how many possible coin sums for a given int pound value. Max 20 threads. 

# System Diagrams

<img width="834" alt="systemdiagram" src="https://github.com/Shelacula/softwareEngineering/assets/40150200/6bcda836-01cb-4dcb-b2ac-bea9967f37f7">
<img width="834" alt="systemdiagram2" src="https://github.com/Shelacula/softwareEngineering/assets/40150200/1cd6522c-eb94-433c-9324-245a88a0cb2f">

# Performance Tuning 

pre-tuning: 
Engine.java Benchmark: 1074 milliseconds elapsed to calculate number 9000000

post-tuning (refactored code to use 2D array instead of matrix, removed multiple loops): 
EngineOpt.java Benchmark: 171 milliseconds elapsed to calculate number 9000000