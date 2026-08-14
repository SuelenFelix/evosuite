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
import java.lang.Integer;

public class Solution_enQueue_8322171241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term13;

    public Solution_enQueue_8322171241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution"));
        int[] term7 = (int[]) newIntArray(5);
        setIntField(term3, term3.getClass(), "front", 1162663216);
        setIntField(term3, term3.getClass(), "rear", 1484323161);
        setIntField(term3, term3.getClass(), "capacity", 391863371);
        setIntElement(term7, 0, -1922583790);
        setIntElement(term7, 1, -616727354);
        setIntElement(term7, 2, -1955890973);
        setIntElement(term7, 3, -2038273078);
        setIntElement(term7, 4, 1227103734);
        setField(term3, term3.getClass(), "elements", term7);
        term13 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13;
        callMethod(klass, "enQueue", argTypes, term3, args);
    }

};


