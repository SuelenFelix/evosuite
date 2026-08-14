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

public class DBModelSystem_setId_4148129304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2347;

    public DBModelSystem_setId_4148129304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2347 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term2347, term2347.getClass(), "id", "AWRooQKkdW");
        setField(term2347, term2347.getClass(), "name", "vjxIhXHxGR");
        setField(term2347, term2347.getClass(), "groupId", "QXzGXbEXMu");
        setField(term2347, term2347.getClass(), "status", "qxSDVejjiY");
        setField(term2347, term2347.getClass(), "payload", "xBsXSDjXYK");
        setLongField(term2347, term2347.getClass(), "mts", 6617340557564669657L);
        setLongField(term2347, term2347.getClass(), "uts", 1439298019805881866L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEnIVFtZuQ";
        callMethod(klass, "setId", argTypes, term2347, args);
    }

};


