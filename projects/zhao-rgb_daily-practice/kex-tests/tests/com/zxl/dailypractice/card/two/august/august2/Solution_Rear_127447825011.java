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

public class Solution_Rear_127447825011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;

    public Solution_Rear_127447825011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution"));
        setIntField(term97, term97.getClass(), "front", 0);
        setIntField(term97, term97.getClass(), "rear", 0);
        setIntField(term97, term97.getClass(), "capacity", 0);
        setField(term97, term97.getClass(), "elements", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "Rear", argTypes, term97, args);
    }

};


