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

public class ContiguousArray_findMaxLength_1375196471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3993;
     Object term3994;

    public ContiguousArray_findMaxLength_1375196471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3993 = newInstance(Class.forName("leetcode.medium.ContiguousArray"));
        term3994 = (int[]) newIntArray(9);
        setIntElement(term3994, 0, -1541297110);
        setIntElement(term3994, 1, -1581464804);
        setIntElement(term3994, 2, -1954937310);
        setIntElement(term3994, 3, -460657407);
        setIntElement(term3994, 4, 941003590);
        setIntElement(term3994, 5, -1825624890);
        setIntElement(term3994, 6, 413214164);
        setIntElement(term3994, 7, 355911655);
        setIntElement(term3994, 8, 1811833766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ContiguousArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3994;
        callMethod(klass, "findMaxLength", argTypes, term3993, args);
    }

};


