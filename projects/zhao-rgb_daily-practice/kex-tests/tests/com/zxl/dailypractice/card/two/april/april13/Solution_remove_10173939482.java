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

public class Solution_remove_10173939482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term33;

    public Solution_remove_10173939482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19 = new ArrayList();
        HashMap term23 = new HashMap();
        term18 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april13.Solution"));
        Object term28 = newInstance(Class.forName("java.util.Random"));
        Object term29 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term18, term18.getClass(), "nums", term19);
        setField(term18, term18.getClass(), "indices", term23);
        setLongField(term29, term29.getClass(), "value", 81254479888470L);
        setField(term28, term28.getClass(), "seed", term29);
        setDoubleField(term28, term28.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term28, term28.getClass(), "haveNextNextGaussian", false);
        setField(term18, term18.getClass(), "random", term28);
        term33 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april13.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33;
        callMethod(klass, "remove", argTypes, term18, args);
    }

};


