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

public class SquaresOfSortedArray_sortedSquares_17843479121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1196;
     Object term1197;

    public SquaresOfSortedArray_sortedSquares_17843479121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1196 = newInstance(Class.forName("leetcode.easy.SquaresOfSortedArray"));
        term1197 = (int[]) newIntArray(9);
        setIntElement(term1197, 0, -420030135);
        setIntElement(term1197, 1, 267763294);
        setIntElement(term1197, 2, -1497710478);
        setIntElement(term1197, 3, 49950830);
        setIntElement(term1197, 4, -525257914);
        setIntElement(term1197, 5, 147209682);
        setIntElement(term1197, 6, 34470066);
        setIntElement(term1197, 7, 2058711405);
        setIntElement(term1197, 8, 1743683601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.SquaresOfSortedArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1197;
        callMethod(klass, "sortedSquares", argTypes, term1196, args);
    }

};


