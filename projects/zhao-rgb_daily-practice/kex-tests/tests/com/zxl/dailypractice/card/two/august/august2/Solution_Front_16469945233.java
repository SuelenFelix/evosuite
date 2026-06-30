package com.zxl.dailypractice.card.two.august.august2;

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
import static com.zxl.dailypractice.card.two.august.august2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Solution_Front_16469945233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public Solution_Front_16469945233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution"));
        int[] term37 = (int[]) newIntArray(3);
        setIntField(term33, term33.getClass(), "front", -1456670397);
        setIntField(term33, term33.getClass(), "rear", 1622346318);
        setIntField(term33, term33.getClass(), "capacity", 1048535127);
        setIntElement(term37, 0, -655067527);
        setIntElement(term37, 1, -6029667);
        setIntElement(term37, 2, -2068769794);
        setField(term33, term33.getClass(), "elements", term37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "Front", argTypes, term33, args);
    }

};


