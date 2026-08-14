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

public class LeftRotation_reverse_8194896191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term8;
     Object term10;

    public LeftRotation_reverse_8194896191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("hackerrank.datastructures.arrays.LeftRotation"));
        term2 = (int[]) newIntArray(5);
        setIntElement(term2, 0, 568599855);
        setIntElement(term2, 1, 1162663216);
        setIntElement(term2, 2, 1484323161);
        setIntElement(term2, 3, 391863371);
        setIntElement(term2, 4, -1922583790);
        term8 = new Integer(-616727354);
        term10 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.arrays.LeftRotation");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2;
        args[1] = term8;
        args[2] = term10;
        callMethod(klass, "reverse", argTypes, term1, args);
    }

};


