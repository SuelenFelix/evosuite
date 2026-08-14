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

public class SearchA2DMatrix_binarySearchOverRow_11869856507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2438;
     Object term2439;
     Object term2441;

    public SearchA2DMatrix_binarySearchOverRow_11869856507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2438 = newInstance(Class.forName("leetcode.medium.SearchA2DMatrix"));
        term2439 = new Integer(0);
        term2441 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchA2DMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2439;
        args[1] = null;
        args[2] = term2441;
        callMethod(klass, "binarySearchOverRow", argTypes, term2438, args);
    }

};


