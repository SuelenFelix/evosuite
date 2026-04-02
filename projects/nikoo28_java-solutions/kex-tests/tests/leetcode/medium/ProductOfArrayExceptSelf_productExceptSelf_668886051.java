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

public class ProductOfArrayExceptSelf_productExceptSelf_668886051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1883;
     Object term1884;

    public ProductOfArrayExceptSelf_productExceptSelf_668886051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1883 = newInstance(Class.forName("leetcode.medium.ProductOfArrayExceptSelf"));
        term1884 = (int[]) newIntArray(5);
        setIntElement(term1884, 0, 754055848);
        setIntElement(term1884, 1, -19246901);
        setIntElement(term1884, 2, -370828664);
        setIntElement(term1884, 3, 1168633950);
        setIntElement(term1884, 4, 1607082164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ProductOfArrayExceptSelf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1884;
        callMethod(klass, "productExceptSelf", argTypes, term1883, args);
    }

};


