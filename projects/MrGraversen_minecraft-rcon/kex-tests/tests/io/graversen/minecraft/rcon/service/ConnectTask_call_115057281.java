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

public class ConnectTask_call_115057281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375;

    public ConnectTask_call_115057281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectTask"));
        Object term376 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term378 = newInstance(Class.forName("java.time.Duration"));
        Object term381 = newInstance(Class.forName("java.time.Duration"));
        Object term384 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        setIntField(term376, term376.getClass(), "maxRetries", 1134449235);
        setLongField(term378, term378.getClass(), "seconds", 273600L);
        setIntField(term378, term378.getClass(), "nanos", 0);
        setField(term376, term376.getClass(), "timeBetweenRetries", term378);
        setLongField(term381, term381.getClass(), "seconds", 46800L);
        setIntField(term381, term381.getClass(), "nanos", 0);
        setField(term376, term376.getClass(), "connectionWatcherInterval", term381);
        setField(term375, term375.getClass(), "connectOptions", term376);
        setField(term384, term384.getClass(), "hostname", "LQFpaHEwXR");
        setIntField(term384, term384.getClass(), "port", -883034806);
        setField(term384, term384.getClass(), "password", "oVcInYnLWB");
        setField(term375, term375.getClass(), "rconDetails", term384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "call", argTypes, term375, args);
    }

};


