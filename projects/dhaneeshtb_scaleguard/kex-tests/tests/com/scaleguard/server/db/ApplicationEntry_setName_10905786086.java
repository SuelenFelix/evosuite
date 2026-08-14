package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApplicationEntry_setName_10905786086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8005;

    public ApplicationEntry_setName_10905786086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8005 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term8005, term8005.getClass(), "id", "xClUIcPECX");
        setField(term8005, term8005.getClass(), "name", "avhRaGZaBF");
        setField(term8005, term8005.getClass(), "description", "JkgoRtImdE");
        setLongField(term8005, term8005.getClass(), "mts", 3452833434644634217L);
        setLongField(term8005, term8005.getClass(), "uts", -8603648071751666348L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qFGKIJjlmV";
        callMethod(klass, "setName", argTypes, term8005, args);
    }

};


