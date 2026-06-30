package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Cash_setSen5_135704274342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14483;

    public Cash_setSen5_135704274342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14483 = newInstance(Class.forName("com.iwamih31.Cash"));
        setField(term14483, term14483.getClass(), "id", null);
        setField(term14483, term14483.getClass(), "date", null);
        setField(term14483, term14483.getClass(), "man1", null);
        setField(term14483, term14483.getClass(), "sen5", null);
        setField(term14483, term14483.getClass(), "sen1", null);
        setField(term14483, term14483.getClass(), "hyaku5", null);
        setField(term14483, term14483.getClass(), "hyaku1", null);
        setField(term14483, term14483.getClass(), "jyuu5", null);
        setField(term14483, term14483.getClass(), "jyuu1", null);
        setField(term14483, term14483.getClass(), "en5", null);
        setField(term14483, term14483.getClass(), "en1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSen5", argTypes, term14483, args);
    }

};


