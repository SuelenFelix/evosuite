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
import java.lang.Object;

public class MinecraftRconService_init_19213023370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487;
     Object term513;

    public MinecraftRconService_init_19213023370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.RconDetails"));
        setField(term487, term487.getClass(), "hostname", "tbcdzjIfER");
        setIntField(term487, term487.getClass(), "port", -1685132342);
        setField(term487, term487.getClass(), "password", "HyxfbSQYBe");
        term513 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions"));
        Object term515 = newInstance(Class.forName("java.time.Duration"));
        Object term518 = newInstance(Class.forName("java.time.Duration"));
        setIntField(term513, term513.getClass(), "maxRetries", -1456670397);
        setLongField(term515, term515.getClass(), "seconds", 352800L);
        setIntField(term515, term515.getClass(), "nanos", 0);
        setField(term513, term513.getClass(), "timeBetweenRetries", term515);
        setLongField(term518, term518.getClass(), "seconds", 97200L);
        setIntField(term518, term518.getClass(), "nanos", 0);
        setField(term513, term513.getClass(), "connectionWatcherInterval", term518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.MinecraftRconService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.service.RconDetails");
        argTypes[1] = Class.forName("io.graversen.minecraft.rcon.service.ConnectOptions");
        Object[] args = new Object[2];
        args[0] = term487;
        args[1] = term513;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


