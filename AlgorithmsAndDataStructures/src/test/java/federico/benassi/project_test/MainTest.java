package federico.benassi.project_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test(){
        Assertions.assertEquals("PROJECT_TEST", new Main().test());
    }
}
