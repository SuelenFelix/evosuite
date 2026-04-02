package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FinKthLargest_fingKthLargest_20249222941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7350;
     Object term7351;
     Object term7354;

    public FinKthLargest_fingKthLargest_20249222941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7350 = newInstance(Class.forName("leetcode.FinKthLargest"));
        term7351 = (int[]) newIntArray(2);
        setIntElement(term7351, 0, 494400151);
        setIntElement(term7351, 1, 1588058685);
        term7354 = new Integer(1677707412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.FinKthLargest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term7351;
        args[1] = term7354;
        callMethod(klass, "fingKthLargest", argTypes, term7350, args);
    }

};


