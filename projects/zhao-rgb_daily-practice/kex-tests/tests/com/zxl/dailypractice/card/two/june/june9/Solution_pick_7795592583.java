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

public class Solution_pick_7795592583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public Solution_pick_7795592583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("com.zxl.dailypractice.card.two.june.june9.Solution"));
        setField(term82, term82.getClass(), "rs", null);
        setField(term82, term82.getClass(), "sum", null);
        setIntField(term82, term82.getClass(), "n", 0);
        setField(term82, term82.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.june.june9.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pick", argTypes, term82, args);
    }

};


