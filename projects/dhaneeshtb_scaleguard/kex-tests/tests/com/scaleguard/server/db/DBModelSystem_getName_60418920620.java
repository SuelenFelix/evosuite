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

public class DBModelSystem_getName_60418920620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3694;

    public DBModelSystem_getName_60418920620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3694 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term3694, term3694.getClass(), "id", null);
        setField(term3694, term3694.getClass(), "name", null);
        setField(term3694, term3694.getClass(), "groupId", null);
        setField(term3694, term3694.getClass(), "status", null);
        setField(term3694, term3694.getClass(), "payload", null);
        setLongField(term3694, term3694.getClass(), "mts", 0L);
        setLongField(term3694, term3694.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3694, args);
    }

};


