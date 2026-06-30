package io.graversen.minecraft.rcon;

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
import static io.graversen.minecraft.rcon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinecraftClient_close_11958807110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26018;

    public MinecraftClient_close_11958807110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26018 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term26031 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term26018, term26018.getClass(), "connectionTuple", "epPTwvcoyb");
        setField(term26018, term26018.getClass(), "rconSocketChannel", null);
        setIntField(term26031, term26031.getClass(), "value", 1227103734);
        setField(term26018, term26018.getClass(), "currentRequestCounter", term26031);
        setField(term26018, term26018.getClass(), "executorService", null);
        setBooleanField(term26018, term26018.getClass(), "isConnected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term26018, args);
    }

};


