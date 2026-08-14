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

public class DBModelSystem_getMts_29078130626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3712;

    public DBModelSystem_getMts_29078130626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3712 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term3712, term3712.getClass(), "id", null);
        setField(term3712, term3712.getClass(), "name", null);
        setField(term3712, term3712.getClass(), "groupId", null);
        setField(term3712, term3712.getClass(), "status", null);
        setField(term3712, term3712.getClass(), "payload", null);
        setLongField(term3712, term3712.getClass(), "mts", 0L);
        setLongField(term3712, term3712.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMts", argTypes, term3712, args);
    }

};


