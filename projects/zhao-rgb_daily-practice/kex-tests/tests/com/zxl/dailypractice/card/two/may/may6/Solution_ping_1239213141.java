package com.zxl.dailypractice.card.two.may.may6;

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
import static com.zxl.dailypractice.card.two.may.may6.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;
import java.lang.Integer;

public class Solution_ping_1239213141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term21;

    public Solution_ping_1239213141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2 = new ArrayDeque();
        Integer term8 = new Integer(568599855);
        Integer term10 = new Integer(1162663216);
        Integer term12 = new Integer(1484323161);
        Integer term14 = new Integer(391863371);
        Integer term16 = new Integer(-1922583790);
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.may.may6.Solution"));
        Object term6 = newInstance(Class.forName("java.util.Stack"));
        Object[] term7 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1, term1.getClass(), "queue", term2);
        setElement(term7, 0, term8);
        setElement(term7, 1, term10);
        setElement(term7, 2, term12);
        setElement(term7, 3, term14);
        setElement(term7, 4, term16);
        setField(term6, term6.getClass(), "elementData", term7);
        setIntField(term6, term6.getClass(), "elementCount", 5);
        setIntField(term6, term6.getClass(), "capacityIncrement", 0);
        setIntField(term6, term6.getClass(), "modCount", 5);
        setField(term1, term1.getClass(), "stack", term6);
        term21 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.may.may6.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21;
        callMethod(klass, "ping", argTypes, term1, args);
    }

};


