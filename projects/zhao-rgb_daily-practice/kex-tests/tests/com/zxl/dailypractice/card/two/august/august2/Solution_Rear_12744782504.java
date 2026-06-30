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

public class Solution_Rear_12744782504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;

    public Solution_Rear_12744782504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution"));
        int[] term48 = (int[]) newIntArray(4);
        setIntField(term44, term44.getClass(), "front", -117576464);
        setIntField(term44, term44.getClass(), "rear", -1007160944);
        setIntField(term44, term44.getClass(), "capacity", 1135664017);
        setIntElement(term48, 0, 590364439);
        setIntElement(term48, 1, 865208305);
        setIntElement(term48, 2, -1275173084);
        setIntElement(term48, 3, -244121226);
        setField(term44, term44.getClass(), "elements", term48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "Rear", argTypes, term44, args);
    }

};


