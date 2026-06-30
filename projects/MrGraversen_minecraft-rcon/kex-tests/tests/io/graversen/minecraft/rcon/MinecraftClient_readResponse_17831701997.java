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

public class MinecraftClient_readResponse_17831701997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25912;

    public MinecraftClient_readResponse_17831701997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25912 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term25925 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25912, term25912.getClass(), "connectionTuple", "DcOhhAfJTI");
        setField(term25912, term25912.getClass(), "rconSocketChannel", null);
        setIntField(term25925, term25925.getClass(), "value", -616727354);
        setField(term25912, term25912.getClass(), "currentRequestCounter", term25925);
        setField(term25912, term25912.getClass(), "executorService", null);
        setBooleanField(term25912, term25912.getClass(), "isConnected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readResponse", argTypes, term25912, args);
    }

};


