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

public class FindPivotIndex_pivotIndex_14076216531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1366;
     Object term1367;

    public FindPivotIndex_pivotIndex_14076216531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1366 = newInstance(Class.forName("leetcode.easy.FindPivotIndex"));
        term1367 = (int[]) newIntArray(6);
        setIntElement(term1367, 0, -1972436591);
        setIntElement(term1367, 1, 68922753);
        setIntElement(term1367, 2, -220791533);
        setIntElement(term1367, 3, 1741500243);
        setIntElement(term1367, 4, -2070466617);
        setIntElement(term1367, 5, -1127721881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.FindPivotIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1367;
        callMethod(klass, "pivotIndex", argTypes, term1366, args);
    }

};


