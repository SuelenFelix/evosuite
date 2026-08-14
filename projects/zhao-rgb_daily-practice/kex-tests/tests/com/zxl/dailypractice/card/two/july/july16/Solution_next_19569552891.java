package com.zxl.dailypractice.card.two.july.july16;

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
import static com.zxl.dailypractice.card.two.july.july16.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Integer;
import java.lang.Object;

public class Solution_next_19569552891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term24;

    public Solution_next_19569552891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7 = new Integer(568599855);
        Integer term10 = new Integer(1162663216);
        Integer term13 = new Integer(1484323161);
        LinkedList term4 = new LinkedList();
        ((LinkedList) term4).add(term7);
        ((LinkedList) term4).add(term10);
        ((LinkedList) term4).add(term13);
        ((LinkedList) term4).add((Object)null);
        ((LinkedList) term4).add((Object)null);
        term3 = newInstance(Class.forName("com.zxl.dailypractice.card.two.july.july16.Solution"));
        setField(term3, term3.getClass(), "queue", term4);
        setIntField(term3, term3.getClass(), "size", 1162663216);
        setDoubleField(term3, term3.getClass(), "sum", 0.13238746331190498);
        term24 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.july.july16.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24;
        callMethod(klass, "next", argTypes, term3, args);
    }

};


