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

public class DBModelSystem_setPayload_96639515510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3091;

    public DBModelSystem_setPayload_96639515510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3091 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term3091, term3091.getClass(), "id", "fWKJoSoCwE");
        setField(term3091, term3091.getClass(), "name", "wfaXBpWAUH");
        setField(term3091, term3091.getClass(), "groupId", "VMeAzAHwZj");
        setField(term3091, term3091.getClass(), "status", "PznxWXsZME");
        setField(term3091, term3091.getClass(), "payload", "ZzIujlwVsw");
        setLongField(term3091, term3091.getClass(), "mts", -4443169559037975007L);
        setLongField(term3091, term3091.getClass(), "uts", -3842548265506930260L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LWyEaeIyAo";
        callMethod(klass, "setPayload", argTypes, term3091, args);
    }

};


