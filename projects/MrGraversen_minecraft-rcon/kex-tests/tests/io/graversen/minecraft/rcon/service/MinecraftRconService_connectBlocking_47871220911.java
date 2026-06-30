package io.graversen.minecraft.rcon.service;

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
import static io.graversen.minecraft.rcon.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MinecraftRconService_connectBlocking_47871220911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160;

    public MinecraftRconService_connectBlocking_47871220911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1160 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        setField(term1160, term1160.getClass(), "rconDetails", null);
        setField(term1160, term1160.getClass(), "connectOptions", null);
        setField(term1160, term1160.getClass(), "executorService", null);
        setField(term1160, term1160.getClass(), "minecraftClient", null);
        setField(term1160, term1160.getClass(), "minecraftRcon", null);
        setBooleanField(term1160, term1160.getClass(), "shouldClose", false);
        setBooleanField(term1160, term1160.getClass(), "shouldConnect", false);
        setBooleanField(term1160, term1160.getClass(), "isConnected", false);
        setField(term1160, term1160.getClass(), "connectionLatch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Duration");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "connectBlocking", argTypes, term1160, args);
    }

};


