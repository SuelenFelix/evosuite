package tudelft.intro;

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
import static tudelft.intro.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MinMax_find_15669445421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4;

    public MinMax_find_15669445421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("tudelft.intro.MinMax"));
        setIntField(term1, term1.getClass(), "min", 2147483647);
        setIntField(term1, term1.getClass(), "max", -2147483648);
        term4 = (int[]) newIntArray(5);
        setIntElement(term4, 0, 568599855);
        setIntElement(term4, 1, 1162663216);
        setIntElement(term4, 2, 1484323161);
        setIntElement(term4, 3, 391863371);
        setIntElement(term4, 4, -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.intro.MinMax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "find", argTypes, term1, args);
    }

};


