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

public class Domain_indexOf_3069306099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9985;
     Object term10002;

    public Domain_indexOf_3069306099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9985 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term9987 = (int[]) newIntArray(3);
        int[] term9991 = (int[]) newIntArray(9);
        setIntField(term9985, term9985.getClass(), "vertex", 110630919);
        setIntElement(term9987, 0, 2002558305);
        setIntElement(term9987, 1, -1729207675);
        setIntElement(term9987, 2, -861852803);
        setField(term9985, term9985.getClass(), "values", term9987);
        setIntElement(term9991, 0, -2085852488);
        setIntElement(term9991, 1, 600214846);
        setIntElement(term9991, 2, 697208850);
        setIntElement(term9991, 3, -973142506);
        setIntElement(term9991, 4, -15011809);
        setIntElement(term9991, 5, -482193296);
        setIntElement(term9991, 6, 1506869786);
        setIntElement(term9991, 7, 950749769);
        setIntElement(term9991, 8, 1497396124);
        setField(term9985, term9985.getClass(), "positions", term9991);
        setIntField(term9985, term9985.getClass(), "size", 1013816325);
        term10002 = new Integer(-756785345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10002;
        callMethod(klass, "indexOf", argTypes, term9985, args);
    }

};


