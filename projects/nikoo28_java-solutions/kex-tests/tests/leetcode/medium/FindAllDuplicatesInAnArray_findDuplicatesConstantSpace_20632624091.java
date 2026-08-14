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

public class FindAllDuplicatesInAnArray_findDuplicatesConstantSpace_20632624091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4445;
     Object term4446;

    public FindAllDuplicatesInAnArray_findDuplicatesConstantSpace_20632624091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4445 = newInstance(Class.forName("leetcode.medium.FindAllDuplicatesInAnArray"));
        term4446 = (int[]) newIntArray(7);
        setIntElement(term4446, 0, 593962063);
        setIntElement(term4446, 1, -1485826786);
        setIntElement(term4446, 2, -1549952664);
        setIntElement(term4446, 3, 148394188);
        setIntElement(term4446, 4, 504525721);
        setIntElement(term4446, 5, 1835568392);
        setIntElement(term4446, 6, 457470807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FindAllDuplicatesInAnArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4446;
        callMethod(klass, "findDuplicatesConstantSpace", argTypes, term4445, args);
    }

};


