package az.iktlab.juniors.java_lessons.lesson_6;

import org.junit.Assert;
import org.junit.Test;

public class FirstUnitTest {

    @Test
    public void testFindMax() {
        Assert.assertEquals(5, UnitTestEx.findMax(3, 5));
        Assert.assertEquals(5, UnitTestEx.findMax(8, 5));
        Assert.assertEquals(5, UnitTestEx.findMax(2, 9));
        Assert.assertEquals(5, UnitTestEx.findMax(3, 12));
    }
}
