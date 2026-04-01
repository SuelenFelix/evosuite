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

public class IntArrays_shuffle_193719044019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155669;

    public IntArrays_shuffle_193719044019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155669 = (int[]) newIntArray(8);
        setIntElement(term155669, 0, -813099037);
        setIntElement(term155669, 1, -1631695509);
        setIntElement(term155669, 2, 492742625);
        setIntElement(term155669, 3, -1116549816);
        setIntElement(term155669, 4, -110818250);
        setIntElement(term155669, 5, 1648744094);
        setIntElement(term155669, 6, -742077421);
        setIntElement(term155669, 7, -2057402941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term155669;
        callMethod(klass, "shuffle", argTypes, null, args);
    }

};


