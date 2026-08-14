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
import java.lang.Integer;

public class FirstAndLastPositionOfElementInSortedArray_findRightBound_8541315503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1238;
     Object term1239;
     Object term1246;

    public FirstAndLastPositionOfElementInSortedArray_findRightBound_8541315503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1238 = newInstance(Class.forName("leetcode.medium.FirstAndLastPositionOfElementInSortedArray"));
        term1239 = (int[]) newIntArray(6);
        setIntElement(term1239, 0, -310528004);
        setIntElement(term1239, 1, -634976996);
        setIntElement(term1239, 2, -1015274146);
        setIntElement(term1239, 3, -49052672);
        setIntElement(term1239, 4, 339372704);
        setIntElement(term1239, 5, -851097944);
        term1246 = new Integer(803925431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FirstAndLastPositionOfElementInSortedArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1239;
        args[1] = term1246;
        callMethod(klass, "findRightBound", argTypes, term1238, args);
    }

};


