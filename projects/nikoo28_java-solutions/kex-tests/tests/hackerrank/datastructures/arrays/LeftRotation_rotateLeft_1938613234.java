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

public class LeftRotation_rotateLeft_1938613234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term40;
     Object term45;

    public LeftRotation_rotateLeft_1938613234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("hackerrank.datastructures.arrays.LeftRotation"));
        term40 = (int[]) newIntArray(4);
        setIntElement(term40, 0, -1685132342);
        setIntElement(term40, 1, -1456670397);
        setIntElement(term40, 2, 1622346318);
        setIntElement(term40, 3, 1048535127);
        term45 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.arrays.LeftRotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term40;
        args[1] = term45;
        callMethod(klass, "rotateLeft", argTypes, term39, args);
    }

};


