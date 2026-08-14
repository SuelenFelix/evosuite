package hackerrank.projecteuler;

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
import static hackerrank.projecteuler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Problem7_findPrime_19532058912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;
     Object term275;
     Object term277;
     Object term279;

    public Problem7_findPrime_19532058912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270 = (int[]) newIntArray(4);
        setIntElement(term270, 0, 568599855);
        setIntElement(term270, 1, 1162663216);
        setIntElement(term270, 2, 1484323161);
        setIntElement(term270, 3, 391863371);
        term275 = (int[]) newIntArray(1);
        setIntElement(term275, 0, -1922583790);
        term277 = new Integer(-616727354);
        term279 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.projecteuler.Problem7");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term270;
        args[1] = term275;
        args[2] = term277;
        args[3] = term279;
        callMethod(klass, "findPrime", argTypes, null, args);
    }

};


