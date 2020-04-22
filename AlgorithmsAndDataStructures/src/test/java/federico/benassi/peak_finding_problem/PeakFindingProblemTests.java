package federico.benassi.peak_finding_problem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeakFindingProblemTests {

    @Test
    public void shouldReturnAPeak1Version(){
        Integer[] emptyIntegers = new Integer[]{};
        PeakFindingProblem<Integer> problem = new PeakFindingProblem<>(emptyIntegers);

        assertNull(problem.findAPeak1Version());

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6};
        PeakFindingProblem<Integer> problem2 = new PeakFindingProblem<>(integers);

        assertNotNull(problem2.findAPeak1Version());
        assertEquals(6, problem2.findAPeak1Version());

        Integer[] integers2 = new Integer[]{1, 0, 3, 2, 5, 1};
        PeakFindingProblem<Integer> problem3 = new PeakFindingProblem<>(integers);

        assertNotNull(problem3.findAPeak1Version());
    }

    @Test
    public void shouldReturnAPeak2Version(){
        Integer[] emptyIntegers = new Integer[]{};
        PeakFindingProblem<Integer> problem = new PeakFindingProblem<>(emptyIntegers);

        assertNull(problem.findAPeak2Version());

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6};
        PeakFindingProblem<Integer> problem2 = new PeakFindingProblem<>(integers);

        assertNotNull(problem2.findAPeak2Version());
        assertEquals(6, problem2.findAPeak2Version());

        Integer[] integers2 = new Integer[]{1, 0, 3, 2, 5, 1};
        PeakFindingProblem<Integer> problem3 = new PeakFindingProblem<>(integers2);

        assertNotNull(problem3.findAPeak2Version());
        assertEquals(1, problem3.findAPeak2Version());
    }

    @Test
    public void shouldReturnAPeak3Version(){
        Integer[] emptyIntegers = new Integer[]{};
        PeakFindingProblem<Integer> problem = new PeakFindingProblem<>(emptyIntegers);

        assertNull(problem.findAPeak3Version());

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6};
        PeakFindingProblem<Integer> problem2 = new PeakFindingProblem<>(integers);

        assertNotNull(problem2.findAPeak3Version());
        assertEquals(6, problem2.findAPeak3Version());

        Integer[] integers2 = new Integer[]{1, 0, 3, 2, 5, 1};
        PeakFindingProblem<Integer> problem3 = new PeakFindingProblem<>(integers2);

        assertNotNull(problem3.findAPeak3Version());
        assertEquals(1, problem3.findAPeak2Version());
    }
}
