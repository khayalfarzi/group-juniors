package az.iktlab.juniors.java_lessons.lesson_6;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static az.iktlab.juniors.java_lessons.lesson_6.ArrayManipulationEx.findMaxAndMin;
import static org.junit.Assert.assertEquals;

public class ArrayManipulationExTest {

    @Test
    public void findMaxAndMinTest() {

        assertEquals(Arrays.toString(new int[]{0, 9}),
                Arrays.toString(findMaxAndMin(new int[]{1, 4, 7, 8, 9, 0, 3, 5})));
    }
}
