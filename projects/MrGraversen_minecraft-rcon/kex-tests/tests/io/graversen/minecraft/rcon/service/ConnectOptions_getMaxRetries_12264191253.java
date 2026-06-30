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

public class ConnectOptions_getMaxRetries_12264191253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;

    public ConnectOptions_getMaxRetries_12264191253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term277 = newInstance(Class.forName("java.time.Duration"));
        Object term280 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term275, term275.getClass(), "maxRetries", -1955890973);
        setLongField(term277, term277.getClass(), "seconds", 198000L);
        setIntField(term277, term277.getClass(), "nanos", 0);
        setField(term275, term275.getClass(), "timeBetweenRetries", term277);
        setLongField(term280, term280.getClass(), "seconds", 194400L);
        setIntField(term280, term280.getClass(), "nanos", 0);
        setField(term275, term275.getClass(), "connectionWatcherInterval", term280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxRetries", argTypes, term275, args);
    }

};


