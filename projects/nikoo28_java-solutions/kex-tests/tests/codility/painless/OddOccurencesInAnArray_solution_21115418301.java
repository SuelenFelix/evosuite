package codility.painless;

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
import static codility.painless.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OddOccurencesInAnArray_solution_21115418301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term140;

    public OddOccurencesInAnArray_solution_21115418301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("codility.painless.OddOccurencesInAnArray"));
        term140 = (int[]) newIntArray(4);
        setIntElement(term140, 0, 1585847225);
        setIntElement(term140, 1, 597278769);
        setIntElement(term140, 2, -1685132342);
        setIntElement(term140, 3, -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codility.painless.OddOccurencesInAnArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term140;
        callMethod(klass, "solution", argTypes, term139, args);
    }

};


