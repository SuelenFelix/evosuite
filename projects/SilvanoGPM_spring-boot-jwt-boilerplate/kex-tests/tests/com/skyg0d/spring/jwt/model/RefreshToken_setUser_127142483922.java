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

public class RefreshToken_setUser_127142483922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7605;

    public RefreshToken_setUser_127142483922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7605 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        setField(term7605, term7605.getClass(), "user", null);
        setField(term7605, term7605.getClass(), "token", null);
        setField(term7605, term7605.getClass(), "expiryDate", null);
        setField(term7605, term7605.getClass(), "browser", null);
        setField(term7605, term7605.getClass(), "operatingSystem", null);
        setField(term7605, term7605.getClass(), "ipAddress", null);
        setField(term7605, term7605.getClass(), "id", null);
        setField(term7605, term7605.getClass(), "createdAt", null);
        setField(term7605, term7605.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.model.User");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term7605, args);
    }

};


