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

public class ConnectOptions_getConnectionWatcherInterval_85331502712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317;

    public ConnectOptions_getConnectionWatcherInterval_85331502712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        setIntField(term317, term317.getClass(), "maxRetries", 0);
        setField(term317, term317.getClass(), "timeBetweenRetries", null);
        setField(term317, term317.getClass(), "connectionWatcherInterval", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnectionWatcherInterval", argTypes, term317, args);
    }

};


