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

public class Solution_getRandom_18237264553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public Solution_getRandom_18237264553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36 = new ArrayList();
        HashMap term40 = new HashMap();
        term35 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april13.Solution"));
        Object term45 = newInstance(Class.forName("java.util.Random"));
        Object term46 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term35, term35.getClass(), "nums", term36);
        setField(term35, term35.getClass(), "indices", term40);
        setLongField(term46, term46.getClass(), "value", 31680054076713L);
        setField(term45, term45.getClass(), "seed", term46);
        setDoubleField(term45, term45.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term45, term45.getClass(), "haveNextNextGaussian", false);
        setField(term35, term35.getClass(), "random", term45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april13.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRandom", argTypes, term35, args);
    }

};


