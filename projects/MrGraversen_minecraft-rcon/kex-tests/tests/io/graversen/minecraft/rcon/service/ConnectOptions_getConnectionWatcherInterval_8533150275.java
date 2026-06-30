package io.graversen.minecraft.rcon.service;

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
import static io.graversen.minecraft.rcon.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ConnectOptions_getConnectionWatcherInterval_8533150275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public ConnectOptions_getConnectionWatcherInterval_8533150275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term293 = newInstance(Class.forName("java.time.Duration"));
        Object term296 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term291, term291.getClass(), "maxRetries", 1227103734);
        setLongField(term293, term293.getClass(), "seconds", 93600L);
        setIntField(term293, term293.getClass(), "nanos", 0);
        setField(term291, term291.getClass(), "timeBetweenRetries", term293);
        setLongField(term296, term296.getClass(), "seconds", 129600L);
        setIntField(term296, term296.getClass(), "nanos", 0);
        setField(term291, term291.getClass(), "connectionWatcherInterval", term296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnectionWatcherInterval", argTypes, term291, args);
    }

};


