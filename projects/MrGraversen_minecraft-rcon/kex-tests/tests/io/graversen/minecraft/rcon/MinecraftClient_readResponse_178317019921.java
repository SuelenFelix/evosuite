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

public class MinecraftClient_readResponse_178317019921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26190;

    public MinecraftClient_readResponse_178317019921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26190 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        setField(term26190, term26190.getClass(), "connectionTuple", null);
        setField(term26190, term26190.getClass(), "rconSocketChannel", null);
        setField(term26190, term26190.getClass(), "currentRequestCounter", null);
        setField(term26190, term26190.getClass(), "executorService", null);
        setBooleanField(term26190, term26190.getClass(), "isConnected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readResponse", argTypes, term26190, args);
    }

};


