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

public class DBModelSystem_getGroupId_153191984722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3700;

    public DBModelSystem_getGroupId_153191984722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3700 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term3700, term3700.getClass(), "id", null);
        setField(term3700, term3700.getClass(), "name", null);
        setField(term3700, term3700.getClass(), "groupId", null);
        setField(term3700, term3700.getClass(), "status", null);
        setField(term3700, term3700.getClass(), "payload", null);
        setLongField(term3700, term3700.getClass(), "mts", 0L);
        setLongField(term3700, term3700.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term3700, args);
    }

};


