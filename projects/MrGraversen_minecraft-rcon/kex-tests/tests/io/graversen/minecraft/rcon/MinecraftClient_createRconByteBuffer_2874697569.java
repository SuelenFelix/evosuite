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
import java.lang.Integer;

public class MinecraftClient_createRconByteBuffer_2874697569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25966;
     Object term25982;
     Object term25984;

    public MinecraftClient_createRconByteBuffer_2874697569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25966 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term25979 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25966, term25966.getClass(), "connectionTuple", "xmzSoVgiED");
        setField(term25966, term25966.getClass(), "rconSocketChannel", null);
        setIntField(term25979, term25979.getClass(), "value", -2038273078);
        setField(term25966, term25966.getClass(), "currentRequestCounter", term25979);
        setField(term25966, term25966.getClass(), "executorService", null);
        setBooleanField(term25966, term25966.getClass(), "isConnected", true);
        term25982 = new Integer(-2027534003);
        term25984 = new Integer(1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term25982;
        args[1] = term25984;
        args[2] = "pdSvedKgPq";
        callMethod(klass, "createRconByteBuffer", argTypes, term25966, args);
    }

};


