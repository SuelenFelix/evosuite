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

public class SystemProperty_getId_36656698214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4912;

    public SystemProperty_getId_36656698214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4912 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4912, term4912.getClass(), "id", null);
        setField(term4912, term4912.getClass(), "name", null);
        setField(term4912, term4912.getClass(), "groupname", null);
        setField(term4912, term4912.getClass(), "value", null);
        setLongField(term4912, term4912.getClass(), "mts", 0L);
        setLongField(term4912, term4912.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4912, args);
    }

};


