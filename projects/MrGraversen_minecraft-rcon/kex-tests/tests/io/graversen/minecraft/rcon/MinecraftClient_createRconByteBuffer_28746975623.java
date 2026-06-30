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

public class MinecraftClient_createRconByteBuffer_28746975623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26196;
     Object term26198;
     Object term26200;

    public MinecraftClient_createRconByteBuffer_28746975623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26196 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        setField(term26196, term26196.getClass(), "connectionTuple", null);
        setField(term26196, term26196.getClass(), "rconSocketChannel", null);
        setField(term26196, term26196.getClass(), "currentRequestCounter", null);
        setField(term26196, term26196.getClass(), "executorService", null);
        setBooleanField(term26196, term26196.getClass(), "isConnected", false);
        term26198 = new Integer(0);
        term26200 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term26198;
        args[1] = term26200;
        args[2] = null;
        callMethod(klass, "createRconByteBuffer", argTypes, term26196, args);
    }

};


