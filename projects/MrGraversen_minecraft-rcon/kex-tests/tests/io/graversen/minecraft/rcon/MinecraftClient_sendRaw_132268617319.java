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

public class MinecraftClient_sendRaw_132268617319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26178;
     Object term26180;
     Object term26182;

    public MinecraftClient_sendRaw_132268617319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26178 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        setField(term26178, term26178.getClass(), "connectionTuple", null);
        setField(term26178, term26178.getClass(), "rconSocketChannel", null);
        setField(term26178, term26178.getClass(), "currentRequestCounter", null);
        setField(term26178, term26178.getClass(), "executorService", null);
        setBooleanField(term26178, term26178.getClass(), "isConnected", false);
        term26180 = new Integer(0);
        term26182 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term26180;
        args[1] = null;
        args[2] = term26182;
        callMethod(klass, "sendRaw", argTypes, term26178, args);
    }

};


