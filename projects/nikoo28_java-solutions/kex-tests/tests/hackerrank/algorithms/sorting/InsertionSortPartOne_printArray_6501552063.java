package hackerrank.algorithms.sorting;

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
import static hackerrank.algorithms.sorting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class InsertionSortPartOne_printArray_6501552063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;

    public InsertionSortPartOne_printArray_6501552063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = (int[]) newIntArray(3);
        setIntElement(term101, 0, -616727354);
        setIntElement(term101, 1, -1955890973);
        setIntElement(term101, 2, -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.algorithms.sorting.InsertionSortPartOne");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term101;
        callMethod(klass, "printArray", argTypes, null, args);
    }

};


