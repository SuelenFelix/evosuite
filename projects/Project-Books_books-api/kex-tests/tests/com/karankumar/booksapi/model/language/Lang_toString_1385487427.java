package com.karankumar.booksapi.model.language;

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
import static com.karankumar.booksapi.model.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Lang_toString_1385487427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2423;

    public Lang_toString_1385487427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2424 = new Long(6811161968424632369L);
        term2423 = newInstance(Class.forName("com.karankumar.booksapi.model.language.Lang"));
        setField(term2423, term2423.getClass(), "id", term2424);
        setField(term2423, term2423.getClass(), "name", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.language.Lang");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2423, args);
    }

};


