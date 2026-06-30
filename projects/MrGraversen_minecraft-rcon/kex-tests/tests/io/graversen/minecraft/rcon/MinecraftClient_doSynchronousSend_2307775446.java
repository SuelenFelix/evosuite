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

public class MinecraftClient_doSynchronousSend_2307775446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25860;
     Object term25876;
     Object term25890;

    public MinecraftClient_doSynchronousSend_2307775446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25860 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term25873 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term25860, term25860.getClass(), "connectionTuple", "aZKOWhHMEh");
        setField(term25860, term25860.getClass(), "rconSocketChannel", null);
        setIntField(term25873, term25873.getClass(), "value", -1922583790);
        setField(term25860, term25860.getClass(), "currentRequestCounter", term25873);
        setField(term25860, term25860.getClass(), "executorService", null);
        setBooleanField(term25860, term25860.getClass(), "isConnected", false);
        term25876 = new Integer(335112684);
        term25890 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term25876;
        args[1] = "YfkhviKZwl";
        args[2] = term25890;
        callMethod(klass, "doSynchronousSend", argTypes, term25860, args);
    }

};


