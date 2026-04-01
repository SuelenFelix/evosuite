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
import java.lang.Integer;

public class TwoSum_twoSum_13857754251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;
     Object term103;
     Object term109;

    public TwoSum_twoSum_13857754251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("com.pd.algorithms.TwoSum"));
        term103 = (int[]) newIntArray(5);
        setIntElement(term103, 0, 1962444399);
        setIntElement(term103, 1, 767834723);
        setIntElement(term103, 2, -602026508);
        setIntElement(term103, 3, -157887805);
        setIntElement(term103, 4, 1876565163);
        term109 = new Integer(-817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.TwoSum");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term103;
        args[1] = term109;
        callMethod(klass, "twoSum", argTypes, term102, args);
    }

};


