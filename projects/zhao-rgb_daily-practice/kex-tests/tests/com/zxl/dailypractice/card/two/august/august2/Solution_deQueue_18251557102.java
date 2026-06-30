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

public class Solution_deQueue_18251557102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;

    public Solution_deQueue_18251557102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution"));
        int[] term24 = (int[]) newIntArray(4);
        setIntField(term20, term20.getClass(), "front", 1725571209);
        setIntField(term20, term20.getClass(), "rear", -522618178);
        setIntField(term20, term20.getClass(), "capacity", 1134449235);
        setIntElement(term24, 0, -883034806);
        setIntElement(term24, 1, 1585847225);
        setIntElement(term24, 2, 597278769);
        setIntElement(term24, 3, -1685132342);
        setField(term20, term20.getClass(), "elements", term24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deQueue", argTypes, term20, args);
    }

};


