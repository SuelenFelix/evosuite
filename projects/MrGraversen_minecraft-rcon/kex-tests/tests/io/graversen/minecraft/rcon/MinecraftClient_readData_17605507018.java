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
import java.lang.Integer;

public class MinecraftClient_readData_17605507018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25938;
     Object term25954;

    public MinecraftClient_readData_17605507018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25938 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term25951 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25938, term25938.getClass(), "connectionTuple", "gYTIkBFOoS");
        setField(term25938, term25938.getClass(), "rconSocketChannel", null);
        setIntField(term25951, term25951.getClass(), "value", -1955890973);
        setField(term25938, term25938.getClass(), "currentRequestCounter", term25951);
        setField(term25938, term25938.getClass(), "executorService", null);
        setBooleanField(term25938, term25938.getClass(), "isConnected", false);
        term25954 = new Integer(1551099402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25954;
        callMethod(klass, "readData", argTypes, term25938, args);
    }

};


