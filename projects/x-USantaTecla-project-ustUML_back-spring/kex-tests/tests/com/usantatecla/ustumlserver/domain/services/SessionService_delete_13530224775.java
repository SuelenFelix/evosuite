package com.usantatecla.ustumlserver.domain.services;

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
import static com.usantatecla.ustumlserver.domain.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SessionService_delete_13530224775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35923;

    public SessionService_delete_13530224775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35923 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.SessionService"));
        setField(term35923, term35923.getClass(), "sessionPersistence", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.SessionService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.domain.model.Member");
        Object[] args = new Object[2];
        args[0] = "wUcSfItZgv";
        args[1] = null;
        callMethod(klass, "delete", argTypes, term35923, args);
    }

};


