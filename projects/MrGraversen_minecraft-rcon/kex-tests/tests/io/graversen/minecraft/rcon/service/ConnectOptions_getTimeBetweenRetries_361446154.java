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

public class ConnectOptions_getTimeBetweenRetries_361446154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;

    public ConnectOptions_getTimeBetweenRetries_361446154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term285 = newInstance(Class.forName("java.time.Duration"));
        Object term288 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term283, term283.getClass(), "maxRetries", -2038273078);
        setLongField(term285, term285.getClass(), "seconds", 100800L);
        setIntField(term285, term285.getClass(), "nanos", 0);
        setField(term283, term283.getClass(), "timeBetweenRetries", term285);
        setLongField(term288, term288.getClass(), "seconds", 144000L);
        setIntField(term288, term288.getClass(), "nanos", 0);
        setField(term283, term283.getClass(), "connectionWatcherInterval", term288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeBetweenRetries", argTypes, term283, args);
    }

};


