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

public class MinecraftClient_readData_176055070122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26192;
     Object term26194;

    public MinecraftClient_readData_176055070122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26192 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        setField(term26192, term26192.getClass(), "connectionTuple", null);
        setField(term26192, term26192.getClass(), "rconSocketChannel", null);
        setField(term26192, term26192.getClass(), "currentRequestCounter", null);
        setField(term26192, term26192.getClass(), "executorService", null);
        setBooleanField(term26192, term26192.getClass(), "isConnected", false);
        term26194 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26194;
        callMethod(klass, "readData", argTypes, term26192, args);
    }

};


