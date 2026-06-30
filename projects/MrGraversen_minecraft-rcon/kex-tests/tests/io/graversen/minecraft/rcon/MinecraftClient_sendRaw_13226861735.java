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
import java.lang.Boolean;

public class MinecraftClient_sendRaw_13226861735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25808;
     Object term25824;
     Object term25838;

    public MinecraftClient_sendRaw_13226861735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25808 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term25821 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25808, term25808.getClass(), "connectionTuple", "GSzQdbHLHw");
        setField(term25808, term25808.getClass(), "rconSocketChannel", null);
        setIntField(term25821, term25821.getClass(), "value", 391863371);
        setField(term25808, term25808.getClass(), "currentRequestCounter", term25821);
        setField(term25808, term25808.getClass(), "executorService", null);
        setBooleanField(term25808, term25808.getClass(), "isConnected", false);
        term25824 = new Integer(1265463001);
        term25838 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term25824;
        args[1] = "IkfarsYNJO";
        args[2] = term25838;
        callMethod(klass, "sendRaw", argTypes, term25808, args);
    }

};


