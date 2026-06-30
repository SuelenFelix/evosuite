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

public class ConnectOptions_toString_17361543186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;

    public ConnectOptions_toString_17361543186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term301 = newInstance(Class.forName("java.time.Duration"));
        Object term304 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term299, term299.getClass(), "maxRetries", -1339778481);
        setLongField(term301, term301.getClass(), "seconds", 216000L);
        setIntField(term301, term301.getClass(), "nanos", 0);
        setField(term299, term299.getClass(), "timeBetweenRetries", term301);
        setLongField(term304, term304.getClass(), "seconds", 133200L);
        setIntField(term304, term304.getClass(), "nanos", 0);
        setField(term299, term299.getClass(), "connectionWatcherInterval", term304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term299, args);
    }

};


