package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LeftAndRightSumDifferences_leftRightDifference_20289283931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;
     Object term418;

    public LeftAndRightSumDifferences_leftRightDifference_20289283931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417 = newInstance(Class.forName("leetcode.easy.LeftAndRightSumDifferences"));
        term418 = (int[]) newIntArray(7);
        setIntElement(term418, 0, 444029505);
        setIntElement(term418, 1, -1034506028);
        setIntElement(term418, 2, -1263114719);
        setIntElement(term418, 3, -894662986);
        setIntElement(term418, 4, 304775596);
        setIntElement(term418, 5, -1347665717);
        setIntElement(term418, 6, -1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.LeftAndRightSumDifferences");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term418;
        callMethod(klass, "leftRightDifference", argTypes, term417, args);
    }

};


