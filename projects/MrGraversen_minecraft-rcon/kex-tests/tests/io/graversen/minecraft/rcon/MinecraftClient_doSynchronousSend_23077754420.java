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
import java.lang.Boolean;

public class MinecraftClient_doSynchronousSend_23077754420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26184;
     Object term26186;
     Object term26188;

    public MinecraftClient_doSynchronousSend_23077754420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26184 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        setField(term26184, term26184.getClass(), "connectionTuple", null);
        setField(term26184, term26184.getClass(), "rconSocketChannel", null);
        setField(term26184, term26184.getClass(), "currentRequestCounter", null);
        setField(term26184, term26184.getClass(), "executorService", null);
        setBooleanField(term26184, term26184.getClass(), "isConnected", false);
        term26186 = new Integer(0);
        term26188 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term26186;
        args[1] = null;
        args[2] = term26188;
        callMethod(klass, "doSynchronousSend", argTypes, term26184, args);
    }

};


