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
import java.lang.Integer;

public class MinecraftClient_connect_12557442115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26168;
     Object term26170;

    public MinecraftClient_connect_12557442115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26168 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        setField(term26168, term26168.getClass(), "connectionTuple", null);
        setField(term26168, term26168.getClass(), "rconSocketChannel", null);
        setField(term26168, term26168.getClass(), "currentRequestCounter", null);
        setField(term26168, term26168.getClass(), "executorService", null);
        setBooleanField(term26168, term26168.getClass(), "isConnected", false);
        term26170 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term26170;
        callMethod(klass, "connect", argTypes, term26168, args);
    }

};


