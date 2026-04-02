package leetcode.medium;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LongestIncreasingSubsequence_lengthOfLIS_6000725421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3192;
     Object term3193;

    public LongestIncreasingSubsequence_lengthOfLIS_6000725421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3192 = newInstance(Class.forName("leetcode.medium.LongestIncreasingSubsequence"));
        term3193 = (int[]) newIntArray(4);
        setIntElement(term3193, 0, -985334541);
        setIntElement(term3193, 1, -1870004228);
        setIntElement(term3193, 2, 380484139);
        setIntElement(term3193, 3, 1822317628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.LongestIncreasingSubsequence");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3193;
        callMethod(klass, "lengthOfLIS", argTypes, term3192, args);
    }

};


