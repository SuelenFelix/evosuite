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

public class DBModelSystem_getGroupId_15319198477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2730;

    public DBModelSystem_getGroupId_15319198477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2730 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term2730, term2730.getClass(), "id", "mXGCWJDOqA");
        setField(term2730, term2730.getClass(), "name", "dpNsDgfPso");
        setField(term2730, term2730.getClass(), "groupId", "hCWPJQKpdc");
        setField(term2730, term2730.getClass(), "status", "WzMEhMXkKx");
        setField(term2730, term2730.getClass(), "payload", "XOiDvlDhdc");
        setLongField(term2730, term2730.getClass(), "mts", -6292278961887936280L);
        setLongField(term2730, term2730.getClass(), "uts", -6645965768855543712L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term2730, args);
    }

};


