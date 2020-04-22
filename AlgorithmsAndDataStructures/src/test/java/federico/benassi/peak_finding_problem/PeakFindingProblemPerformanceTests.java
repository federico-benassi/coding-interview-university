package federico.benassi.peak_finding_problem;

public class PeakFindingProblemPerformanceTests {
    // With 1 Billion the 2nd Version goes in OutOfMemory: Java heap space, that's caused by
    // the recursive calls
    public static void main(String[] args) {
        Integer[] integers = new Integer[9_999_999_9];
        for(int i = 0; i < integers.length; i++){
            integers[i] = i;
        }

        PeakFindingProblem<Integer> problem = new PeakFindingProblem<>(integers);
        problem.printPerformances();
    }
}
