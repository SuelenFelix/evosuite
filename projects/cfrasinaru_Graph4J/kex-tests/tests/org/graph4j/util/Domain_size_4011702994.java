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

public class Domain_size_4011702994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9852;

    public Domain_size_4011702994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9852 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term9854 = (int[]) newIntArray(7);
        int[] term9862 = (int[]) newIntArray(9);
        setIntField(term9852, term9852.getClass(), "vertex", 1092325030);
        setIntElement(term9854, 0, -1901115940);
        setIntElement(term9854, 1, 1934437115);
        setIntElement(term9854, 2, 1820319919);
        setIntElement(term9854, 3, 1444962020);
        setIntElement(term9854, 4, 1636228804);
        setIntElement(term9854, 5, -1650533427);
        setIntElement(term9854, 6, -1076430316);
        setField(term9852, term9852.getClass(), "values", term9854);
        setIntElement(term9862, 0, 1984492528);
        setIntElement(term9862, 1, -655764067);
        setIntElement(term9862, 2, 31238744);
        setIntElement(term9862, 3, 680031965);
        setIntElement(term9862, 4, -2112419098);
        setIntElement(term9862, 5, -1649429373);
        setIntElement(term9862, 6, -1605518502);
        setIntElement(term9862, 7, -499081946);
        setIntElement(term9862, 8, 1834067063);
        setField(term9852, term9852.getClass(), "positions", term9862);
        setIntField(term9852, term9852.getClass(), "size", -1578513908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term9852, args);
    }

};


