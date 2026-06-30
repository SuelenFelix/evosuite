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

public class Solution_isEmpty_16269798515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;

    public Solution_isEmpty_16269798515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution"));
        int[] term61 = (int[]) newIntArray(1);
        setIntField(term57, term57.getClass(), "front", -203030934);
        setIntField(term57, term57.getClass(), "rear", -1179120542);
        setIntField(term57, term57.getClass(), "capacity", -73683645);
        setIntElement(term61, 0, -226514366);
        setField(term57, term57.getClass(), "elements", term61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.august.august2.Solution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEmpty", argTypes, term57, args);
    }

};


