package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReferenceEntity_getExpiresAt_208707624726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;

    public ReferenceEntity_getExpiresAt_208707624726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term880 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        setField(term880, term880.getClass(), "id", null);
        setField(term880, term880.getClass(), "code", null);
        setField(term880, term880.getClass(), "label", null);
        setField(term880, term880.getClass(), "ordinal", null);
        setField(term880, term880.getClass(), "effectiveAt", null);
        setField(term880, term880.getClass(), "expiresAt", null);
        setField(term880, term880.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiresAt", argTypes, term880, args);
    }

};


