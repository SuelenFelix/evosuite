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

public class DBModelSystem_getPayload_1549141319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2978;

    public DBModelSystem_getPayload_1549141319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2978 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term2978, term2978.getClass(), "id", "OJJtVNPyKZ");
        setField(term2978, term2978.getClass(), "name", "AKNapTAfmD");
        setField(term2978, term2978.getClass(), "groupId", "xJgPlLxpgC");
        setField(term2978, term2978.getClass(), "status", "EYtfuJaxiM");
        setField(term2978, term2978.getClass(), "payload", "gCWtLVKVVe");
        setLongField(term2978, term2978.getClass(), "mts", -2170847986967241072L);
        setLongField(term2978, term2978.getClass(), "uts", 4044358158040652353L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPayload", argTypes, term2978, args);
    }

};


