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

public class SortColors_sortColors_9696301551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3408;
     Object term3409;

    public SortColors_sortColors_9696301551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3408 = newInstance(Class.forName("leetcode.medium.SortColors"));
        term3409 = (int[]) newIntArray(5);
        setIntElement(term3409, 0, -1421649118);
        setIntElement(term3409, 1, -511248284);
        setIntElement(term3409, 2, 788630042);
        setIntElement(term3409, 3, 1430066560);
        setIntElement(term3409, 4, 836734074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SortColors");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3409;
        callMethod(klass, "sortColors", argTypes, term3408, args);
    }

};


