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

public class DBModelSystem_getId_1144488583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2234;

    public DBModelSystem_getId_1144488583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2234 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term2234, term2234.getClass(), "id", "JiVRgTZvKc");
        setField(term2234, term2234.getClass(), "name", "XPKmummaqg");
        setField(term2234, term2234.getClass(), "groupId", "BKLfkLiZTH");
        setField(term2234, term2234.getClass(), "status", "SPpkrGcPRr");
        setField(term2234, term2234.getClass(), "payload", "sEccwbJKYE");
        setLongField(term2234, term2234.getClass(), "mts", -484994522244390100L);
        setLongField(term2234, term2234.getClass(), "uts", 1233889271256172047L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2234, args);
    }

};


