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
import java.lang.Integer;

public class CyclicRotation_solution_19814597471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term8;
     Object term14;

    public CyclicRotation_solution_19814597471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("codility.painless.CyclicRotation"));
        term8 = (int[]) newIntArray(5);
        setIntElement(term8, 0, 1162663216);
        setIntElement(term8, 1, 1484323161);
        setIntElement(term8, 2, 391863371);
        setIntElement(term8, 3, -1922583790);
        setIntElement(term8, 4, -616727354);
        term14 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codility.painless.CyclicRotation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8;
        args[1] = term14;
        callMethod(klass, "solution", argTypes, term7, args);
    }

};


