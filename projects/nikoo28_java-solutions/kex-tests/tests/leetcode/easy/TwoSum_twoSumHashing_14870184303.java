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
import java.lang.Integer;

public class TwoSum_twoSumHashing_14870184303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;
     Object term564;
     Object term570;

    public TwoSum_twoSumHashing_14870184303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563 = newInstance(Class.forName("leetcode.easy.TwoSum"));
        term564 = (int[]) newIntArray(5);
        setIntElement(term564, 0, -893623680);
        setIntElement(term564, 1, -1963434938);
        setIntElement(term564, 2, 906181092);
        setIntElement(term564, 3, 1045657203);
        setIntElement(term564, 4, 1386130016);
        term570 = new Integer(1072005683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.TwoSum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term564;
        args[1] = term570;
        callMethod(klass, "twoSumHashing", argTypes, term563, args);
    }

};


