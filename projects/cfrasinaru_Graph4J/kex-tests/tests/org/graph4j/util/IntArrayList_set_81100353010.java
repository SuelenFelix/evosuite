package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class IntArrayList_set_81100353010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156609;
     Object term156622;
     Object term156624;

    public IntArrayList_set_81100353010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156609 = newInstance(Class.forName("org.graph4j.util.IntArrayList"));
        int[] term156610 = (int[]) newIntArray(10);
        setField(term156609, term156609.getClass(), "values", term156610);
        setIntField(term156609, term156609.getClass(), "size", -1435336846);
        term156622 = new Integer(1761135259);
        term156624 = new Integer(984894671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrayList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term156622;
        args[1] = term156624;
        callMethod(klass, "set", argTypes, term156609, args);
    }

};


