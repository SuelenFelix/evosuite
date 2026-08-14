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

public class ApplicationEntry_setDescription_17186064352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7685;

    public ApplicationEntry_setDescription_17186064352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7685 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term7685, term7685.getClass(), "id", "VVNNlAePXF");
        setField(term7685, term7685.getClass(), "name", "jnwVnmKAFv");
        setField(term7685, term7685.getClass(), "description", "TXyHhqeCjR");
        setLongField(term7685, term7685.getClass(), "mts", -6301101997917060727L);
        setLongField(term7685, term7685.getClass(), "uts", 8166095254618543564L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lZIgPZPgTu";
        callMethod(klass, "setDescription", argTypes, term7685, args);
    }

};


