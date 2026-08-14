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

public class DBModelSystem_setGroupId_195156642523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3703;

    public DBModelSystem_setGroupId_195156642523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3703 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term3703, term3703.getClass(), "id", null);
        setField(term3703, term3703.getClass(), "name", null);
        setField(term3703, term3703.getClass(), "groupId", null);
        setField(term3703, term3703.getClass(), "status", null);
        setField(term3703, term3703.getClass(), "payload", null);
        setLongField(term3703, term3703.getClass(), "mts", 0L);
        setLongField(term3703, term3703.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGroupId", argTypes, term3703, args);
    }

};


