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

public class MinecraftClient_authenticateClient_191034814112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26070;

    public MinecraftClient_authenticateClient_191034814112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26070 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term26083 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term26070, term26070.getClass(), "connectionTuple", "IDJUVPgUJf");
        setField(term26070, term26070.getClass(), "rconSocketChannel", null);
        setIntField(term26083, term26083.getClass(), "value", 1725571209);
        setField(term26070, term26070.getClass(), "currentRequestCounter", term26083);
        setField(term26070, term26070.getClass(), "executorService", null);
        setBooleanField(term26070, term26070.getClass(), "isConnected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JmnWRJUxGr";
        callMethod(klass, "authenticateClient", argTypes, term26070, args);
    }

};


