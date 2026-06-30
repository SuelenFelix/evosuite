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

public class MinecraftClient_printCommand_101825471013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26118;

    public MinecraftClient_printCommand_101825471013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26118 = newInstance(Class.forName("io.graversen.minecraft.rcon.MinecraftClient"));
        Object term26131 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term26118, term26118.getClass(), "connectionTuple", "wgRGBNrTGP");
        setField(term26118, term26118.getClass(), "rconSocketChannel", null);
        setIntField(term26131, term26131.getClass(), "value", -522618178);
        setField(term26118, term26118.getClass(), "currentRequestCounter", term26131);
        setField(term26118, term26118.getClass(), "executorService", null);
        setBooleanField(term26118, term26118.getClass(), "isConnected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.MinecraftClient");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FIdNVptZpW";
        callMethod(klass, "printCommand", argTypes, term26118, args);
    }

};


