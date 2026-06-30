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

public class MinecraftClient_isConnected_7887606212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25683;
     Object term25699;

    public MinecraftClient_isConnected_7887606212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25683 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term25696 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25683, term25683.getClass(), "connectionTuple", "JdOMfNWgLP");
        setField(term25683, term25683.getClass(), "rconSocketChannel", null);
        setIntField(term25696, term25696.getClass(), "value", 568599855);
        setField(term25683, term25683.getClass(), "currentRequestCounter", term25696);
        setField(term25683, term25683.getClass(), "executorService", null);
        setBooleanField(term25683, term25683.getClass(), "isConnected", true);
        term25699 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term25699, term25699.getClass(), "seconds", 25200L);
        setIntField(term25699, term25699.getClass(), "nanos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Duration");
        Object[] args = new Object[1];
        args[0] = term25699;
        callMethod(klass, "isConnected", argTypes, term25683, args);
    }

};


