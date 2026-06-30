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

public class MinecraftClient_printCommand_101825471027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26208;

    public MinecraftClient_printCommand_101825471027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26208 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        setField(term26208, term26208.getClass(), "connectionTuple", null);
        setField(term26208, term26208.getClass(), "rconSocketChannel", null);
        setField(term26208, term26208.getClass(), "currentRequestCounter", null);
        setField(term26208, term26208.getClass(), "executorService", null);
        setBooleanField(term26208, term26208.getClass(), "isConnected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "printCommand", argTypes, term26208, args);
    }

};


