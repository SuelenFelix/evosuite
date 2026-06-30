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

public class Cash_getDate_13540186629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14470;

    public Cash_getDate_13540186629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14470 = newInstance(Class.forName("com.iwamih31.Cash"));
        setField(term14470, term14470.getClass(), "id", null);
        setField(term14470, term14470.getClass(), "date", null);
        setField(term14470, term14470.getClass(), "man1", null);
        setField(term14470, term14470.getClass(), "sen5", null);
        setField(term14470, term14470.getClass(), "sen1", null);
        setField(term14470, term14470.getClass(), "hyaku5", null);
        setField(term14470, term14470.getClass(), "hyaku1", null);
        setField(term14470, term14470.getClass(), "jyuu5", null);
        setField(term14470, term14470.getClass(), "jyuu1", null);
        setField(term14470, term14470.getClass(), "en5", null);
        setField(term14470, term14470.getClass(), "en1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term14470, args);
    }

};


