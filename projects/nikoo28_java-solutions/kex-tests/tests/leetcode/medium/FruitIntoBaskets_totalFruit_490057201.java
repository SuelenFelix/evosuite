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

public class FruitIntoBaskets_totalFruit_490057201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246;
     Object term247;

    public FruitIntoBaskets_totalFruit_490057201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246 = newInstance(Class.forName("leetcode.medium.FruitIntoBaskets"));
        term247 = (int[]) newIntArray(6);
        setIntElement(term247, 0, 458147407);
        setIntElement(term247, 1, -184153539);
        setIntElement(term247, 2, 493620644);
        setIntElement(term247, 3, 1328271830);
        setIntElement(term247, 4, 1596070772);
        setIntElement(term247, 5, 97029295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FruitIntoBaskets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term247;
        callMethod(klass, "totalFruit", argTypes, term246, args);
    }

};


