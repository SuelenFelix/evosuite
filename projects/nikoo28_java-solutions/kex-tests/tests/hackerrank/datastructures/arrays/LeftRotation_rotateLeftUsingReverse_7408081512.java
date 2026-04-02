package hackerrank.datastructures.arrays;

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
import static hackerrank.datastructures.arrays.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class LeftRotation_rotateLeftUsingReverse_7408081512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term18;
     Object term23;

    public LeftRotation_rotateLeftUsingReverse_7408081512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("hackerrank.datastructures.arrays.LeftRotation"));
        term18 = (int[]) newIntArray(4);
        setIntElement(term18, 0, -2038273078);
        setIntElement(term18, 1, 1227103734);
        setIntElement(term18, 2, -1339778481);
        setIntElement(term18, 3, 1725571209);
        term23 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.arrays.LeftRotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term18;
        args[1] = term23;
        callMethod(klass, "rotateLeftUsingReverse", argTypes, term17, args);
    }

};


