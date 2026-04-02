package hackerrank.algorithms.search;

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
import static hackerrank.algorithms.search.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MissingNumbers_missingNumbers_16059673781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term54;
     Object term59;

    public MissingNumbers_missingNumbers_16059673781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("hackerrank.algorithms.search.MissingNumbers"));
        term54 = (int[]) newIntArray(4);
        setIntElement(term54, 0, -522618178);
        setIntElement(term54, 1, 1134449235);
        setIntElement(term54, 2, -883034806);
        setIntElement(term54, 3, 1585847225);
        term59 = (int[]) newIntArray(5);
        setIntElement(term59, 0, 597278769);
        setIntElement(term59, 1, -1685132342);
        setIntElement(term59, 2, -1456670397);
        setIntElement(term59, 3, 1622346318);
        setIntElement(term59, 4, 1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.algorithms.search.MissingNumbers");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term54;
        args[1] = term59;
        callMethod(klass, "missingNumbers", argTypes, term53, args);
    }

};


