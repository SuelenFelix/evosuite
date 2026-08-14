package com.zxl.dailypractice.card.two.june.june9;

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
import static com.zxl.dailypractice.card.two.june.june9.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Solution_pick_7795592581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;

    public Solution_pick_7795592581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("com.zxl.dailypractice.card.two.june.june9.Solution"));
        Object[] term44 = (Object[]) newArray("[I", 2);
        int[] term45 = (int[]) newIntArray(6);
        int[] term52 = (int[]) newIntArray(7);
        int[] term60 = (int[]) newIntArray(1);
        Object term63 = newInstance(Class.forName("java.util.Random"));
        Object term64 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setIntElement(term45, 0, 1622346318);
        setIntElement(term45, 1, 1048535127);
        setIntElement(term45, 2, -655067527);
        setIntElement(term45, 3, -6029667);
        setIntElement(term45, 4, -2068769794);
        setIntElement(term45, 5, -117576464);
        setElement(term44, 0, term45);
        setIntElement(term52, 0, -1007160944);
        setIntElement(term52, 1, 1135664017);
        setIntElement(term52, 2, 590364439);
        setIntElement(term52, 3, 865208305);
        setIntElement(term52, 4, -1275173084);
        setIntElement(term52, 5, -244121226);
        setIntElement(term52, 6, -203030934);
        setElement(term44, 1, term52);
        setField(term43, term43.getClass(), "rs", term44);
        setIntElement(term60, 0, -1179120542);
        setField(term43, term43.getClass(), "sum", term60);
        setIntField(term43, term43.getClass(), "n", -73683645);
        setLongField(term64, term64.getClass(), "value", 240099772723690L);
        setField(term63, term63.getClass(), "seed", term64);
        setDoubleField(term63, term63.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term63, term63.getClass(), "haveNextNextGaussian", false);
        setField(term43, term43.getClass(), "random", term63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june9.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pick", argTypes, term43, args);
    }

};


