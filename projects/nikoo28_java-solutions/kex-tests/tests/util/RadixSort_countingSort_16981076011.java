package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RadixSort_countingSort_16981076011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1909;
     Object term1910;
     Object term1916;

    public RadixSort_countingSort_16981076011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1909 = newInstance(Class.forName("util.RadixSort"));
        term1910 = (int[]) newIntArray(5);
        setIntElement(term1910, 0, 76650923);
        setIntElement(term1910, 1, 1003743923);
        setIntElement(term1910, 2, 1887772522);
        setIntElement(term1910, 3, 354196060);
        setIntElement(term1910, 4, -1840305774);
        term1916 = new Integer(1365087144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.RadixSort");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1910;
        args[1] = term1916;
        callMethod(klass, "countingSort", argTypes, term1909, args);
    }

};


