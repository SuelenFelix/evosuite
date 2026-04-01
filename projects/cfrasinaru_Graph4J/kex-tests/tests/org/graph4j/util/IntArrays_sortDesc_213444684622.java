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

public class IntArrays_sortDesc_213444684622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155713;

    public IntArrays_sortDesc_213444684622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155713 = (int[]) newIntArray(9);
        setIntElement(term155713, 0, -1017903413);
        setIntElement(term155713, 1, -836196659);
        setIntElement(term155713, 2, 965832423);
        setIntElement(term155713, 3, 694647175);
        setIntElement(term155713, 4, 294335533);
        setIntElement(term155713, 5, 1671795200);
        setIntElement(term155713, 6, 2017942490);
        setIntElement(term155713, 7, 1724726086);
        setIntElement(term155713, 8, -1197987867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term155713;
        callMethod(klass, "sortDesc", argTypes, null, args);
    }

};


