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

public class Domain_init_3528344542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9796;
     Object term9798;

    public Domain_init_3528344542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9796 = new Integer(-85442762);
        term9798 = (int[]) newIntArray(8);
        setIntElement(term9798, 0, 295245507);
        setIntElement(term9798, 1, -1782801582);
        setIntElement(term9798, 2, -112814060);
        setIntElement(term9798, 3, -1111447214);
        setIntElement(term9798, 4, 1463964937);
        setIntElement(term9798, 5, -1207878110);
        setIntElement(term9798, 6, -284421477);
        setIntElement(term9798, 7, 55419591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9796;
        args[1] = term9798;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


