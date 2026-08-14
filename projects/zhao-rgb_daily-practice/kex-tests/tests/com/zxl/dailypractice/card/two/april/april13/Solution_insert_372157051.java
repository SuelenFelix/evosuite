package com.zxl.dailypractice.card.two.april.april13;

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
import static com.zxl.dailypractice.card.two.april.april13.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;

public class Solution_insert_372157051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term16;

    public Solution_insert_372157051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        HashMap term6 = new HashMap();
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april13.Solution"));
        Object term11 = newInstance(Class.forName("java.util.Random"));
        Object term12 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term1, term1.getClass(), "nums", term2);
        setField(term1, term1.getClass(), "indices", term6);
        setLongField(term12, term12.getClass(), "value", 250434123587357L);
        setField(term11, term11.getClass(), "seed", term12);
        setDoubleField(term11, term11.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term11, term11.getClass(), "haveNextNextGaussian", false);
        setField(term1, term1.getClass(), "random", term11);
        term16 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april13.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16;
        callMethod(klass, "insert", argTypes, term1, args);
    }

};


