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

public class SystemProperty_getValue_17104876647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4340;

    public SystemProperty_getValue_17104876647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4340 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4340, term4340.getClass(), "id", "kNqaJKIATy");
        setField(term4340, term4340.getClass(), "name", "vKQukfbJUd");
        setField(term4340, term4340.getClass(), "groupname", "lFRJFUMVbx");
        setField(term4340, term4340.getClass(), "value", "sZdUNdggUW");
        setLongField(term4340, term4340.getClass(), "mts", 41775768178052008L);
        setLongField(term4340, term4340.getClass(), "uts", 6682528376118987775L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term4340, args);
    }

};


