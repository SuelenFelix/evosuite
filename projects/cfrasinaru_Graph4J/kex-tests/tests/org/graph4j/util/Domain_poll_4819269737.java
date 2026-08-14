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

public class Domain_poll_4819269737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9943;

    public Domain_poll_4819269737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9943 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term9945 = (int[]) newIntArray(7);
        int[] term9953 = (int[]) newIntArray(4);
        setIntField(term9943, term9943.getClass(), "vertex", 496461454);
        setIntElement(term9945, 0, -697047947);
        setIntElement(term9945, 1, 505327656);
        setIntElement(term9945, 2, 1779734830);
        setIntElement(term9945, 3, -714618793);
        setIntElement(term9945, 4, 1350743761);
        setIntElement(term9945, 5, -2100246850);
        setIntElement(term9945, 6, 174682854);
        setField(term9943, term9943.getClass(), "values", term9945);
        setIntElement(term9953, 0, -1618786023);
        setIntElement(term9953, 1, -316033780);
        setIntElement(term9953, 2, -1242223364);
        setIntElement(term9953, 3, -347672279);
        setField(term9943, term9943.getClass(), "positions", term9953);
        setIntField(term9943, term9943.getClass(), "size", -2001561246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "poll", argTypes, term9943, args);
    }

};


