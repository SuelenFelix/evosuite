package com.zxl.dailypractice.card.two.april.april25;

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
import static com.zxl.dailypractice.card.two.april.april25.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;

public class Solution_pick_6629016941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;
     Object term23;

    public Solution_pick_6629016941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13 = new HashMap();
        term12 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april25.Solution"));
        Object term18 = newInstance(Class.forName("java.util.Random"));
        Object term19 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term12, term12.getClass(), "pos", term13);
        setLongField(term19, term19.getClass(), "value", 247232485515273L);
        setField(term18, term18.getClass(), "seed", term19);
        setDoubleField(term18, term18.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term18, term18.getClass(), "haveNextNextGaussian", false);
        setField(term12, term12.getClass(), "random", term18);
        term23 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april25.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "pick", argTypes, term12, args);
    }

};


