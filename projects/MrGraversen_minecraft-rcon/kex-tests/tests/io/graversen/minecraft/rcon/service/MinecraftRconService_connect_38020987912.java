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

public class MinecraftRconService_connect_38020987912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1164;

    public MinecraftRconService_connect_38020987912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1164 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService"));
        setField(term1164, term1164.getClass(), "rconDetails", null);
        setField(term1164, term1164.getClass(), "connectOptions", null);
        setField(term1164, term1164.getClass(), "executorService", null);
        setField(term1164, term1164.getClass(), "minecraftClient", null);
        setField(term1164, term1164.getClass(), "minecraftRcon", null);
        setBooleanField(term1164, term1164.getClass(), "shouldClose", false);
        setBooleanField(term1164, term1164.getClass(), "shouldConnect", false);
        setBooleanField(term1164, term1164.getClass(), "isConnected", false);
        setField(term1164, term1164.getClass(), "connectionLatch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "connect", argTypes, term1164, args);
    }

};


