package com.zxl.dailypractice.card.two.june.june5;

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
import static com.zxl.dailypractice.card.two.june.june5.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_randPoint_9588776491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public Solution_randPoint_9588776491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("com.zxl.dailypractice.card.two.june.june5.Solution"));
        Object term8 = newInstance(Class.forName("java.util.Random"));
        Object term9 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term9, term9.getClass(), "value", 120039382188425L);
        setField(term8, term8.getClass(), "seed", term9);
        setDoubleField(term8, term8.getClass(), "nextNextGaussian", 0.544608645520025);
        setBooleanField(term8, term8.getClass(), "haveNextNextGaussian", false);
        setField(term7, term7.getClass(), "random", term8);
        setDoubleField(term7, term7.getClass(), "xc", 0.28570734989730284);
        setDoubleField(term7, term7.getClass(), "yc", 0.40176586625454525);
        setDoubleField(term7, term7.getClass(), "r", 0.2641345529914265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june5.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "randPoint", argTypes, term7, args);
    }

};


