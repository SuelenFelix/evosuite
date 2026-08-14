package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RefreshToken_setBrowser_117824625525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7608;

    public RefreshToken_setBrowser_117824625525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7608 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        setField(term7608, term7608.getClass(), "user", null);
        setField(term7608, term7608.getClass(), "token", null);
        setField(term7608, term7608.getClass(), "expiryDate", null);
        setField(term7608, term7608.getClass(), "browser", null);
        setField(term7608, term7608.getClass(), "operatingSystem", null);
        setField(term7608, term7608.getClass(), "ipAddress", null);
        setField(term7608, term7608.getClass(), "id", null);
        setField(term7608, term7608.getClass(), "createdAt", null);
        setField(term7608, term7608.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBrowser", argTypes, term7608, args);
    }

};


