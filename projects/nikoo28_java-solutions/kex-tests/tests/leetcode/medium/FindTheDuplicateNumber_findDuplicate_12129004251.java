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

public class FindTheDuplicateNumber_findDuplicate_12129004251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4804;
     Object term4805;

    public FindTheDuplicateNumber_findDuplicate_12129004251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4804 = newInstance(Class.forName("leetcode.medium.FindTheDuplicateNumber"));
        term4805 = (int[]) newIntArray(6);
        setIntElement(term4805, 0, -1631415805);
        setIntElement(term4805, 1, 1073400519);
        setIntElement(term4805, 2, -2025555268);
        setIntElement(term4805, 3, -746950289);
        setIntElement(term4805, 4, -137577510);
        setIntElement(term4805, 5, 719185716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FindTheDuplicateNumber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4805;
        callMethod(klass, "findDuplicate", argTypes, term4804, args);
    }

};


