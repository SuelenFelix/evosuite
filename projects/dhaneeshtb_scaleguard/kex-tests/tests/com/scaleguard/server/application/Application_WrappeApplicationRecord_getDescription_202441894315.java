package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Application_WrappeApplicationRecord_getDescription_202441894315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3856;

    public Application_WrappeApplicationRecord_getDescription_202441894315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3856 = newInstance(Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord"));
        setField(term3856, term3856.getClass(), "name", null);
        setField(term3856, term3856.getClass(), "description", null);
        setField(term3856, term3856.getClass(), "clients", null);
        setField(term3856, term3856.getClass(), "id", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term3856, args);
    }

};


