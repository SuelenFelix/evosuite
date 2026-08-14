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

public class LinearSearch_linearSearch_5955606221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2150;
     Object term2159;

    public LinearSearch_linearSearch_5955606221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2150 = (int[]) newIntArray(8);
        setIntElement(term2150, 0, 1916544127);
        setIntElement(term2150, 1, -1133405894);
        setIntElement(term2150, 2, 1289741214);
        setIntElement(term2150, 3, 243280944);
        setIntElement(term2150, 4, -726681073);
        setIntElement(term2150, 5, -1724487863);
        setIntElement(term2150, 6, -128490829);
        setIntElement(term2150, 7, 202214133);
        term2159 = new Integer(1543091617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.LinearSearch");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2150;
        args[1] = term2159;
        callMethod(klass, "linearSearch", argTypes, null, args);
    }

};


