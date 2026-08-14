package com.pd.algorithms;

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
import static com.pd.algorithms.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MatrixMultiplication2D_matrixMult2D_11292211411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374;
     Object term375;
     Object term403;

    public MatrixMultiplication2D_matrixMult2D_11292211411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374 = newInstance(Class.forName("com.pd.algorithms.MatrixMultiplication2D"));
        term375 = (Object[]) newArray("[I", 6);
        int[] term376 = (int[]) newIntArray(2);
        int[] term379 = (int[]) newIntArray(5);
        int[] term385 = (int[]) newIntArray(3);
        int[] term389 = (int[]) newIntArray(5);
        int[] term395 = (int[]) newIntArray(5);
        int[] term401 = (int[]) newIntArray(1);
        setIntElement(term376, 0, 1265463001);
        setIntElement(term376, 1, 335112684);
        setElement(term375, 0, term376);
        setIntElement(term379, 0, 1551099402);
        setIntElement(term379, 1, -2027534003);
        setIntElement(term379, 2, 1063420942);
        setIntElement(term379, 3, 1375330971);
        setIntElement(term379, 4, -478195677);
        setElement(term375, 1, term379);
        setIntElement(term385, 0, 972867650);
        setIntElement(term385, 1, 1655935355);
        setIntElement(term385, 2, -481533957);
        setElement(term375, 2, term385);
        setIntElement(term389, 0, 1240914516);
        setIntElement(term389, 1, -1465035361);
        setIntElement(term389, 2, 1090617576);
        setIntElement(term389, 3, -1547384488);
        setIntElement(term389, 4, 1442160736);
        setElement(term375, 3, term389);
        setIntElement(term395, 0, 1114000454);
        setIntElement(term395, 1, -556405712);
        setIntElement(term395, 2, -1772434990);
        setIntElement(term395, 3, -1845499264);
        setIntElement(term395, 4, -505439934);
        setElement(term375, 4, term395);
        setIntElement(term401, 0, -344842608);
        setElement(term375, 5, term401);
        term403 = (Object[]) newArray("[I", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.MatrixMultiplication2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term375;
        args[1] = term403;
        callMethod(klass, "matrixMult2D", argTypes, term374, args);
    }

};


