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

public class MinecraftClient_sendRaw_15934645953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25712;

    public MinecraftClient_sendRaw_15934645953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25712 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term25725 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25712, term25712.getClass(), "connectionTuple", "uWqXrwAsDU");
        setField(term25712, term25712.getClass(), "rconSocketChannel", null);
        setIntField(term25725, term25725.getClass(), "value", 1162663216);
        setField(term25712, term25712.getClass(), "currentRequestCounter", term25725);
        setField(term25712, term25712.getClass(), "executorService", null);
        setBooleanField(term25712, term25712.getClass(), "isConnected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hgFbWAUtsu";
        callMethod(klass, "sendRaw", argTypes, term25712, args);
    }

};


