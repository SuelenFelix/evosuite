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

public class MinecraftClient_sendRawSilently_18538135894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25760;

    public MinecraftClient_sendRawSilently_18538135894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25760 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term25773 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25760, term25760.getClass(), "connectionTuple", "HqoTWlkbwF");
        setField(term25760, term25760.getClass(), "rconSocketChannel", null);
        setIntField(term25773, term25773.getClass(), "value", 1484323161);
        setField(term25760, term25760.getClass(), "currentRequestCounter", term25773);
        setField(term25760, term25760.getClass(), "executorService", null);
        setBooleanField(term25760, term25760.getClass(), "isConnected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CwNELDTAPP";
        callMethod(klass, "sendRawSilently", argTypes, term25760, args);
    }

};


